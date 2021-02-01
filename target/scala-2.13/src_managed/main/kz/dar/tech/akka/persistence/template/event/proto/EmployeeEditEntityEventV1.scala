// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package kz.dar.tech.akka.persistence.template.event.proto

@SerialVersionUID(0L)
final case class EmployeeEditEntityEventV1(
    ts: _root_.scala.Predef.String = "",
    employeeId: _root_.scala.Predef.String = "",
    firstName: _root_.scala.Predef.String = "",
    lastName: _root_.scala.Predef.String = "",
    middleName: _root_.scala.Predef.String = "",
    birthDate: _root_.scala.Predef.String = "",
    position: _root_.scala.Predef.String = "",
    isLayoffs: _root_.scala.Boolean = false,
    family: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, kz.dar.tech.akka.persistence.template.event.proto.FamilyV1] = _root_.scala.collection.immutable.Map.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[EmployeeEditEntityEventV1] with kz.dar.tech.akka.persistence.template.model.protobuf.EmployeeProtoEvent {
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
        val __value = firstName
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = lastName
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      
      {
        val __value = middleName
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, __value)
        }
      };
      
      {
        val __value = birthDate
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, __value)
        }
      };
      
      {
        val __value = position
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(7, __value)
        }
      };
      
      {
        val __value = isLayoffs
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(8, __value)
        }
      };
      family.foreach { __item =>
        val __value = kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1._typemapper_family.toBase(__item)
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
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
        val __v = firstName
        if (!__v.isEmpty) {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = lastName
        if (!__v.isEmpty) {
          _output__.writeString(4, __v)
        }
      };
      {
        val __v = middleName
        if (!__v.isEmpty) {
          _output__.writeString(5, __v)
        }
      };
      {
        val __v = birthDate
        if (!__v.isEmpty) {
          _output__.writeString(6, __v)
        }
      };
      {
        val __v = position
        if (!__v.isEmpty) {
          _output__.writeString(7, __v)
        }
      };
      {
        val __v = isLayoffs
        if (__v != false) {
          _output__.writeBool(8, __v)
        }
      };
      family.foreach { __v =>
        val __m = kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1._typemapper_family.toBase(__v)
        _output__.writeTag(9, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def withTs(__v: _root_.scala.Predef.String): EmployeeEditEntityEventV1 = copy(ts = __v)
    def withEmployeeId(__v: _root_.scala.Predef.String): EmployeeEditEntityEventV1 = copy(employeeId = __v)
    def withFirstName(__v: _root_.scala.Predef.String): EmployeeEditEntityEventV1 = copy(firstName = __v)
    def withLastName(__v: _root_.scala.Predef.String): EmployeeEditEntityEventV1 = copy(lastName = __v)
    def withMiddleName(__v: _root_.scala.Predef.String): EmployeeEditEntityEventV1 = copy(middleName = __v)
    def withBirthDate(__v: _root_.scala.Predef.String): EmployeeEditEntityEventV1 = copy(birthDate = __v)
    def withPosition(__v: _root_.scala.Predef.String): EmployeeEditEntityEventV1 = copy(position = __v)
    def withIsLayoffs(__v: _root_.scala.Boolean): EmployeeEditEntityEventV1 = copy(isLayoffs = __v)
    def clearFamily = copy(family = _root_.scala.collection.immutable.Map.empty)
    def addFamily(__vs: (_root_.scala.Predef.String, kz.dar.tech.akka.persistence.template.event.proto.FamilyV1)*): EmployeeEditEntityEventV1 = addAllFamily(__vs)
    def addAllFamily(__vs: Iterable[(_root_.scala.Predef.String, kz.dar.tech.akka.persistence.template.event.proto.FamilyV1)]): EmployeeEditEntityEventV1 = copy(family = family ++ __vs)
    def withFamily(__v: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, kz.dar.tech.akka.persistence.template.event.proto.FamilyV1]): EmployeeEditEntityEventV1 = copy(family = __v)
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
          val __t = firstName
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = lastName
          if (__t != "") __t else null
        }
        case 5 => {
          val __t = middleName
          if (__t != "") __t else null
        }
        case 6 => {
          val __t = birthDate
          if (__t != "") __t else null
        }
        case 7 => {
          val __t = position
          if (__t != "") __t else null
        }
        case 8 => {
          val __t = isLayoffs
          if (__t != false) __t else null
        }
        case 9 => family.iterator.map(kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1._typemapper_family.toBase).toSeq
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(ts)
        case 2 => _root_.scalapb.descriptors.PString(employeeId)
        case 3 => _root_.scalapb.descriptors.PString(firstName)
        case 4 => _root_.scalapb.descriptors.PString(lastName)
        case 5 => _root_.scalapb.descriptors.PString(middleName)
        case 6 => _root_.scalapb.descriptors.PString(birthDate)
        case 7 => _root_.scalapb.descriptors.PString(position)
        case 8 => _root_.scalapb.descriptors.PBoolean(isLayoffs)
        case 9 => _root_.scalapb.descriptors.PRepeated(family.iterator.map(kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1._typemapper_family.toBase(_).toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1
}

object EmployeeEditEntityEventV1 extends scalapb.GeneratedMessageCompanion[kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1] = this
  def merge(`_message__`: kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1, `_input__`: _root_.com.google.protobuf.CodedInputStream): kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1 = {
    var __ts = `_message__`.ts
    var __employeeId = `_message__`.employeeId
    var __firstName = `_message__`.firstName
    var __lastName = `_message__`.lastName
    var __middleName = `_message__`.middleName
    var __birthDate = `_message__`.birthDate
    var __position = `_message__`.position
    var __isLayoffs = `_message__`.isLayoffs
    val __family = (_root_.scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, kz.dar.tech.akka.persistence.template.event.proto.FamilyV1] ++= `_message__`.family)
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
        case 26 =>
          __firstName = _input__.readStringRequireUtf8()
        case 34 =>
          __lastName = _input__.readStringRequireUtf8()
        case 42 =>
          __middleName = _input__.readStringRequireUtf8()
        case 50 =>
          __birthDate = _input__.readStringRequireUtf8()
        case 58 =>
          __position = _input__.readStringRequireUtf8()
        case 64 =>
          __isLayoffs = _input__.readBool()
        case 74 =>
          __family += kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1._typemapper_family.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry.defaultInstance))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1(
        ts = __ts,
        employeeId = __employeeId,
        firstName = __firstName,
        lastName = __lastName,
        middleName = __middleName,
        birthDate = __birthDate,
        position = __position,
        isLayoffs = __isLayoffs,
        family = __family.result(),
        unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1(
        ts = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        employeeId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        firstName = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        lastName = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        middleName = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        birthDate = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        position = __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        isLayoffs = __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.scala.Boolean]).getOrElse(false),
        family = __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).map(_.as[_root_.scala.Seq[kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry]]).getOrElse(_root_.scala.Seq.empty).iterator.map(kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1._typemapper_family.toCustom).toMap
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = EmployeeEventProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = EmployeeEventProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 9 => __out = kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1(
    ts = "",
    employeeId = "",
    firstName = "",
    lastName = "",
    middleName = "",
    birthDate = "",
    position = "",
    isLayoffs = false,
    family = _root_.scala.collection.immutable.Map.empty
  )
  @SerialVersionUID(0L)
  final case class FamilyEntry(
      key: _root_.scala.Predef.String = "",
      value: _root_.scala.Option[kz.dar.tech.akka.persistence.template.event.proto.FamilyV1] = _root_.scala.None,
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[FamilyEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = key
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
          }
        };
        if (value.isDefined) {
          val __value = value.get
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
          val __v = key
          if (!__v.isEmpty) {
            _output__.writeString(1, __v)
          }
        };
        value.foreach { __v =>
          val __m = __v
          _output__.writeTag(2, 2)
          _output__.writeUInt32NoTag(__m.serializedSize)
          __m.writeTo(_output__)
        };
        unknownFields.writeTo(_output__)
      }
      def withKey(__v: _root_.scala.Predef.String): FamilyEntry = copy(key = __v)
      def getValue: kz.dar.tech.akka.persistence.template.event.proto.FamilyV1 = value.getOrElse(kz.dar.tech.akka.persistence.template.event.proto.FamilyV1.defaultInstance)
      def clearValue: FamilyEntry = copy(value = _root_.scala.None)
      def withValue(__v: kz.dar.tech.akka.persistence.template.event.proto.FamilyV1): FamilyEntry = copy(value = Option(__v))
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => value.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => value.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry
  }
  
  object FamilyEntry extends scalapb.GeneratedMessageCompanion[kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry] = this
    def merge(`_message__`: kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry, `_input__`: _root_.com.google.protobuf.CodedInputStream): kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry = {
      var __key = `_message__`.key
      var __value = `_message__`.value
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __key = _input__.readStringRequireUtf8()
          case 18 =>
            __value = Option(_root_.scalapb.LiteParser.readMessage(_input__, __value.getOrElse(kz.dar.tech.akka.persistence.template.event.proto.FamilyV1.defaultInstance)))
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry(
          key = __key,
          value = __value,
          unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry(
          key = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          value = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[kz.dar.tech.akka.persistence.template.event.proto.FamilyV1]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
      var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
      (__number: @_root_.scala.unchecked) match {
        case 2 => __out = kz.dar.tech.akka.persistence.template.event.proto.FamilyV1
      }
      __out
    }
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry(
      key = "",
      value = _root_.scala.None
    )
    implicit class FamilyEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, kz.dar.tech.akka.persistence.template.event.proto.FamilyV1] = field(_.getValue)((c_, f_) => c_.copy(value = Option(f_)))
      def optionalValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[kz.dar.tech.akka.persistence.template.event.proto.FamilyV1]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    @transient
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry, (_root_.scala.Predef.String, kz.dar.tech.akka.persistence.template.event.proto.FamilyV1)] =
      _root_.scalapb.TypeMapper[kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry, (_root_.scala.Predef.String, kz.dar.tech.akka.persistence.template.event.proto.FamilyV1)](__m => (__m.key, __m.getValue))(__p => kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry(__p._1, Some(__p._2)))
    def of(
      key: _root_.scala.Predef.String,
      value: _root_.scala.Option[kz.dar.tech.akka.persistence.template.event.proto.FamilyV1]
    ): _root_.kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry = _root_.kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry(
      key,
      value
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[EmployeeEditEntityEventV1.FamilyEntry])
  }
  
  implicit class EmployeeEditEntityEventV1Lens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1](_l) {
    def ts: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.ts)((c_, f_) => c_.copy(ts = f_))
    def employeeId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.employeeId)((c_, f_) => c_.copy(employeeId = f_))
    def firstName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.firstName)((c_, f_) => c_.copy(firstName = f_))
    def lastName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.lastName)((c_, f_) => c_.copy(lastName = f_))
    def middleName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.middleName)((c_, f_) => c_.copy(middleName = f_))
    def birthDate: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.birthDate)((c_, f_) => c_.copy(birthDate = f_))
    def position: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.position)((c_, f_) => c_.copy(position = f_))
    def isLayoffs: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.isLayoffs)((c_, f_) => c_.copy(isLayoffs = f_))
    def family: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, kz.dar.tech.akka.persistence.template.event.proto.FamilyV1]] = field(_.family)((c_, f_) => c_.copy(family = f_))
  }
  final val TS_FIELD_NUMBER = 1
  final val EMPLOYEEID_FIELD_NUMBER = 2
  final val FIRSTNAME_FIELD_NUMBER = 3
  final val LASTNAME_FIELD_NUMBER = 4
  final val MIDDLENAME_FIELD_NUMBER = 5
  final val BIRTHDATE_FIELD_NUMBER = 6
  final val POSITION_FIELD_NUMBER = 7
  final val ISLAYOFFS_FIELD_NUMBER = 8
  final val FAMILY_FIELD_NUMBER = 9
  @transient
  private val _typemapper_family: _root_.scalapb.TypeMapper[kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry, (_root_.scala.Predef.String, kz.dar.tech.akka.persistence.template.event.proto.FamilyV1)] = implicitly[_root_.scalapb.TypeMapper[kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1.FamilyEntry, (_root_.scala.Predef.String, kz.dar.tech.akka.persistence.template.event.proto.FamilyV1)]]
  def of(
    ts: _root_.scala.Predef.String,
    employeeId: _root_.scala.Predef.String,
    firstName: _root_.scala.Predef.String,
    lastName: _root_.scala.Predef.String,
    middleName: _root_.scala.Predef.String,
    birthDate: _root_.scala.Predef.String,
    position: _root_.scala.Predef.String,
    isLayoffs: _root_.scala.Boolean,
    family: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, kz.dar.tech.akka.persistence.template.event.proto.FamilyV1]
  ): _root_.kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1 = _root_.kz.dar.tech.akka.persistence.template.event.proto.EmployeeEditEntityEventV1(
    ts,
    employeeId,
    firstName,
    lastName,
    middleName,
    birthDate,
    position,
    isLayoffs,
    family
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[EmployeeEditEntityEventV1])
}