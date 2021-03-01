package kz.dar.tech.akka.persistence.template.serializable.proto

import akka.serialization.SerializerWithStringManifest
import kz.dar.tech.akka.persistence.template.event.proto.{CreatePostEventV1, EmployeeCreateEntityEventV1}

class PostEmployeeSerializer extends SerializerWithStringManifest {

  final val CreatePostEventV1EventManifestV1: String = classOf[CreatePostEventV1].getName

  override def identifier: Int = 1001

  override def manifest(o: AnyRef): String = o.getClass.getName

  override def toBinary(o: AnyRef): Array[Byte] = o match {
    case evt: CreatePostEventV1 => evt.toByteArray
  }

  override def fromBinary(bytes: Array[Byte], manifest: String): AnyRef = manifest match {
    case CreatePostEventV1EventManifestV1 => CreatePostEventV1.parseFrom(bytes)
  }
}
