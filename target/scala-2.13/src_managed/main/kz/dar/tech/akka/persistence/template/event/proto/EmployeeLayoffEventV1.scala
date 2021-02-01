// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package kz.dar.tech.akka.persistence.template.event.proto

@SerialVersionUID(0L)
final case class EmployeeLayoffEventV1(
    ts: _root_.scala.Predef.String = "",
    employeeId: _root_.scala.Predef.String = "",
    isLayoffs: _root_.scala.Boolean = false,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[EmployeeLayoffEventV1] with kz.dar.tech.akka.persistence.template.model.protobuf.EmployeeProtoEvent {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = ts
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = employeeId
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = isLayoffs
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(3, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = ts
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = employeeId
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = isLayoffs
        if (__v != false) {
          _output__.writeBool(3, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withTs(__v: _root_.scala.Predef.String): EmployeeLayoffEventV1 = copy(ts = __v)
    def withEmployeeId(__v: _root_.scala.Predef.String): EmployeeLayoffEventV1 = copy(employeeId = __v)
    def withIsLayoffs(__v: _root_.scala.Boolean): EmployeeLayoffEventV1 = copy(isLayoffs = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = ts
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = employeeId
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = isLayoffs
          if (__t != false) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(ts)
        case 2 => _root_.scalapb.descriptors.PString(employeeId)
        case 3 => _root_.scalapb.descriptors.PBoolean(isLayoffs)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = kz.dar.tech.akka.persistence.template.event.proto.EmployeeLayoffEventV1
}

object EmployeeLayoffEventV1 extends scalapb.GeneratedMessageCompanion[kz.dar.tech.akka.persistence.template.event.proto.EmployeeLayoffEventV1] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[kz.dar.tech.akka.persistence.template.event.proto.EmployeeLayoffEventV1] = this
  def merge(`_message__`: kz.dar.tech.akka.persistence.template.event.proto.EmployeeLayoffEventV1, `_input__`: _root_.com.google.protobuf.CodedInputStream): kz.dar.tech.akka.persistence.template.event.proto.EmployeeLayoffEventV1 = {
    var __ts = `_message__`.ts
    var __employeeId = `_message__`.employeeId
    var __isLayoffs = `_message__`.isLayoffs
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __ts = _input__.readStringRequireUtf8()
        case 18 =>
          __employeeId = _input__.readStringRequireUtf8()
        case 24 =>
          __isLayoffs = _input__.readBool()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    kz.dar.tech.akka.persistence.template.event.proto.EmployeeLayoffEventV1(
        ts = __ts,
        employeeId = __employeeId,
        isLayoffs = __isLayoffs,
        unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[kz.dar.tech.akka.persistence.template.event.proto.EmployeeLayoffEventV1] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      kz.dar.tech.akka.persistence.template.event.proto.EmployeeLayoffEventV1(
        ts = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        employeeId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        isLayoffs = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Boolean]).getOrElse(false)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = EmployeeEventProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = EmployeeEventProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = kz.dar.tech.akka.persistence.template.event.proto.EmployeeLayoffEventV1(
    ts = "",
    employeeId = "",
    isLayoffs = false
  )
  implicit class EmployeeLayoffEventV1Lens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, kz.dar.tech.akka.persistence.template.event.proto.EmployeeLayoffEventV1]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, kz.dar.tech.akka.persistence.template.event.proto.EmployeeLayoffEventV1](_l) {
    def ts: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.ts)((c_, f_) => c_.copy(ts = f_))
    def employeeId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.employeeId)((c_, f_) => c_.copy(employeeId = f_))
    def isLayoffs: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.isLayoffs)((c_, f_) => c_.copy(isLayoffs = f_))
  }
  final val TS_FIELD_NUMBER = 1
  final val EMPLOYEEID_FIELD_NUMBER = 2
  final val ISLAYOFFS_FIELD_NUMBER = 3
  def of(
    ts: _root_.scala.Predef.String,
    employeeId: _root_.scala.Predef.String,
    isLayoffs: _root_.scala.Boolean
  ): _root_.kz.dar.tech.akka.persistence.template.event.proto.EmployeeLayoffEventV1 = _root_.kz.dar.tech.akka.persistence.template.event.proto.EmployeeLayoffEventV1(
    ts,
    employeeId,
    isLayoffs
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[EmployeeLayoffEventV1])
}
