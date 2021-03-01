package kz.dar.tech.akka.persistence.template.model

import org.joda.time.DateTime

case class SummaryPost(ts: Long,
                       name: String,
                       postId: String,
                       address: String,
                       status: String) extends Serializable

