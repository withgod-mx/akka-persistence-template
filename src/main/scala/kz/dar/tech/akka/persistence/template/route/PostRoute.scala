package kz.dar.tech.akka.persistence.template.route

import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{ContentTypes, HttpEntity, HttpMethods, HttpRequest, HttpResponse, StatusCodes}
import akka.http.scaladsl.server.Route
import akka.util.Timeout
import de.heikoseeberger.akkahttpcirce.FailFastCirceSupport
import kz.dar.tech.akka.persistence.template.util.Codec
import akka.http.scaladsl.server.Directives._
import io.circe.parser.parse
import kz.dar.tech.akka.persistence.template.command.CreatePostCommand
import kz.dar.tech.akka.persistence.template.entity.{EmployeeEntityProto, PostEntity}
import kz.dar.tech.akka.persistence.template.model.{PostDTO, SummaryPost}

import io.circe.{Json, parser}
import io.circe.generic.auto._
import io.circe.syntax._

import scala.util.{ Failure, Success }

import scala.concurrent.{ExecutionContext, Future}

class PostRoute(implicit system: ActorSystem[_], implicit val executionContext: ExecutionContext) extends Codec with FailFastCirceSupport {

  implicit private val timeout: Timeout = Timeout.create(system.settings.config.getDuration("askTimeout"))

  private val sharding = ClusterSharding(system)

  val routes: Route = {
    createPostRoute
  }


  def createPostRoute: Route = {
    pathPrefix("post" / "init") {
      post {
        entity(as[PostDTO]) { entity =>

          val entityRef = sharding.entityRefFor(PostEntity.EntityKey, entity.postId)

          val reply: Future[SummaryPost] = entityRef.ask(
            CreatePostCommand(
              ts = entity.ts,
              postId = entity.postId,
              name = entity.name,
              _,
              address = entity.address
            )
          )

          onSuccess(reply) { summary =>

            val message = HttpRequest(
              method = HttpMethods.POST,
              uri = "http://localhost:8080/api/v1/post/create",
              entity = HttpEntity(ContentTypes.`application/json`, summary.asJson.noSpaces)
            )

            val responseFuture: Future[HttpResponse] = Http().singleRequest(message)

            responseFuture
              .onComplete {
                case Success(res) => println(res)
                case Failure(_)   => sys.error("something wrong")
              }


            complete("OK")
          }
        }
      }
    }
  }


}
