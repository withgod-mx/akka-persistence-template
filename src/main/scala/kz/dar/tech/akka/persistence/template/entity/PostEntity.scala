package kz.dar.tech.akka.persistence.template.entity

import akka.actor.typed.{ActorSystem, Behavior}
import akka.cluster.sharding.typed.scaladsl.{ClusterSharding, Entity, EntityTypeKey}
import akka.event.slf4j.Logger
import akka.persistence.typed.PersistenceId
import akka.persistence.typed.scaladsl.{Effect, EventSourcedBehavior, RetentionCriteria}
import kz.dar.tech.akka.persistence.template.adapter.PostEventAdapter
import kz.dar.tech.akka.persistence.template.command.{CreatePostCommand, PostCommand, RegisterPostCommand}
import kz.dar.tech.akka.persistence.template.entity.EmployeeEntityProto.{EntityKey, getClass, logger}
import kz.dar.tech.akka.persistence.template.event.{CreatePostEvent, PostEvent, RegisterPostEvent}
import kz.dar.tech.akka.persistence.template.model.SummaryPost
import kz.dar.tech.akka.persistence.template.util.EventProcessorSettings

object PostEntity {

  case class Post(ts: Option[Long] = None,
                  name: Option[String] = None,
                  postId: Option[String] = None,
                  address: Option[String] = None)


  object Post {
    def empty = new Post()
  }


  trait State

  trait PostEntityState

  object PostEntityState {

    case object REGISTER extends PostEntityState

    case object INIT extends PostEntityState

    case object SEND extends PostEntityState

    case object FINISH extends PostEntityState

    case object CLOSE extends PostEntityState

  }

  case class StateHolder(content: Post, state: PostEntityState) {

    def update(event: PostEvent): StateHolder = event match {
      case evt: CreatePostEvent => {
        copy(
          content = content.copy(
            ts = Some(evt.ts),
            name = Some(evt.name),
            postId = Some(evt.postId),
            address = Some(evt.address)
          ),
          state = PostEntityState.REGISTER
        )
      }

      case evt: RegisterPostEvent => {
        copy(
          content = content.copy(
            ts = Some(evt.ts),
            postId = Some(evt.postId)
          ),
          state = PostEntityState.SEND
        )
      }
    }
  }

  object StateHolder {
    def empty: StateHolder = StateHolder(content = Post.empty, state = PostEntityState.INIT)
  }

  private val logger = Logger(getClass.getSimpleName)

  val EntityKey: EntityTypeKey[PostCommand] = EntityTypeKey[PostCommand]("Post")

  def init(system: ActorSystem[_], eventProcessorSettings: EventProcessorSettings): Unit = {

    ClusterSharding(system).init(Entity(EntityKey) { entityContext =>
      val n = math.abs(entityContext.entityId.hashCode % eventProcessorSettings.parallelism)
      val eventProcessorTag = eventProcessorSettings.tagPrefix + "-" + n
      PostEntity(entityContext.entityId, Set(eventProcessorTag))
    })

  }

  def apply(postId: String, eventProcessorTag: Set[String]): Behavior[PostCommand] = {
    EventSourcedBehavior[PostCommand, PostEvent, StateHolder](
    persistenceId = PersistenceId(EntityKey.name, postId),
    StateHolder.empty,
    (state, command) => commandHandler(postId, state, command),
    (state, event) => handleEvent(state, event)
    ).withTagger(_ => eventProcessorTag)
      .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 10, keepNSnapshots = 2))
      .eventAdapter(new PostEventAdapter)
  }


  def commandHandler(postId: String, state: StateHolder, command: PostCommand): Effect[PostEvent, StateHolder] = {
    command match {
      case cmd: CreatePostCommand => {
        state.state match {
          case PostEntityState.INIT => {

            val evt = CreatePostEvent(
              ts = cmd.ts,
              postId = cmd.postId,
              name = cmd.name,
              address = cmd.address
            )

            Effect.persist(evt).thenReply(cmd.replyTo)(_ =>
              SummaryPost(
                ts = cmd.ts,
                name = cmd.name,
                postId = cmd.postId,
                address = cmd.address,
                status = "CREATE"
              )
            )
          }

          case _ => throw new RuntimeException("Error")
        }
      }

      case cmd: RegisterPostCommand => {
        state.state match {
          case PostEntityState.REGISTER => {

            val evt = RegisterPostEvent(
              ts = cmd.ts,
              postId = cmd.postId
            )

            Effect.persist(evt)
          }

        }
      }
    }
  }


  def handleEvent(state: StateHolder, event: PostEvent): StateHolder = {
    state.update(event)
  }
}
