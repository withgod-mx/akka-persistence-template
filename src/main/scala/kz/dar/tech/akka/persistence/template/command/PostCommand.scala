package kz.dar.tech.akka.persistence.template.command

import akka.actor.typed.ActorRef
import kz.dar.tech.akka.persistence.template.model.{Summary, SummaryPost}

trait PostCommand {
  def ts: Long

  def postId: String
}

case class CreatePostCommand(ts: Long,
                             postId: String,
                             name: String,
                             replyTo: ActorRef[SummaryPost],
                             address: String) extends PostCommand



case class RegisterPostCommand(ts: Long,
                               postId: String) extends PostCommand

case class SendPostCommand(ts: Long,
                           postId: String) extends PostCommand

case class ReceivePostCommand(ts: Long,
                              postId: String) extends PostCommand
