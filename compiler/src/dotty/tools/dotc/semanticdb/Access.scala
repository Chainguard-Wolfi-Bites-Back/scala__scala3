// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dotty.tools.dotc.semanticdb
import dotty.tools.dotc.semanticdb.internal._
import scala.annotation.internal.sharable

sealed trait Access  extends SemanticdbGeneratedSealedOneof  derives CanEqual {
  type MessageType = dotty.tools.dotc.semanticdb.AccessMessage
  final def isEmpty = this.isInstanceOf[dotty.tools.dotc.semanticdb.Access.Empty.type]
  final def isDefined = !isEmpty
  final def asMessage: dotty.tools.dotc.semanticdb.AccessMessage = dotty.tools.dotc.semanticdb.Access.AccessTypeMapper.toBase(this)
  final def asNonEmpty: Option[dotty.tools.dotc.semanticdb.Access.NonEmpty] = if (isEmpty) None else Some(this.asInstanceOf[dotty.tools.dotc.semanticdb.Access.NonEmpty])
}

object Access {
  case object Empty extends dotty.tools.dotc.semanticdb.Access
  
  sealed trait NonEmpty extends dotty.tools.dotc.semanticdb.Access
  def defaultInstance: dotty.tools.dotc.semanticdb.Access = Empty
  
  implicit val AccessTypeMapper: SemanticdbTypeMapper[dotty.tools.dotc.semanticdb.AccessMessage, dotty.tools.dotc.semanticdb.Access] = new SemanticdbTypeMapper[dotty.tools.dotc.semanticdb.AccessMessage, dotty.tools.dotc.semanticdb.Access] {
    override def toCustom(__base: dotty.tools.dotc.semanticdb.AccessMessage): dotty.tools.dotc.semanticdb.Access = __base.sealedValue match {
      case __v: dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PrivateAccess => __v.value
      case __v: dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PrivateThisAccess => __v.value
      case __v: dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PrivateWithinAccess => __v.value
      case __v: dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.ProtectedAccess => __v.value
      case __v: dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.ProtectedThisAccess => __v.value
      case __v: dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.ProtectedWithinAccess => __v.value
      case __v: dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PublicAccess => __v.value
      case dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.Empty => Empty
    }
    override def toBase(__custom: dotty.tools.dotc.semanticdb.Access): dotty.tools.dotc.semanticdb.AccessMessage = dotty.tools.dotc.semanticdb.AccessMessage(__custom match {
      case __v: dotty.tools.dotc.semanticdb.PrivateAccess => dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PrivateAccess(__v)
      case __v: dotty.tools.dotc.semanticdb.PrivateThisAccess => dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PrivateThisAccess(__v)
      case __v: dotty.tools.dotc.semanticdb.PrivateWithinAccess => dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PrivateWithinAccess(__v)
      case __v: dotty.tools.dotc.semanticdb.ProtectedAccess => dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.ProtectedAccess(__v)
      case __v: dotty.tools.dotc.semanticdb.ProtectedThisAccess => dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.ProtectedThisAccess(__v)
      case __v: dotty.tools.dotc.semanticdb.ProtectedWithinAccess => dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.ProtectedWithinAccess(__v)
      case __v: dotty.tools.dotc.semanticdb.PublicAccess => dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PublicAccess(__v)
      case Empty => dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.Empty
    })
  }
}
@SerialVersionUID(0L)
final case class AccessMessage(
    sealedValue: dotty.tools.dotc.semanticdb.AccessMessage.SealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.Empty
    )  extends SemanticdbGeneratedMessage  derives CanEqual {
    @transient @sharable
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (sealedValue.privateAccess.isDefined) {
        val __value = sealedValue.privateAccess.get
        __size += 1 + SemanticdbOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (sealedValue.privateThisAccess.isDefined) {
        val __value = sealedValue.privateThisAccess.get
        __size += 1 + SemanticdbOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (sealedValue.privateWithinAccess.isDefined) {
        val __value = sealedValue.privateWithinAccess.get
        __size += 1 + SemanticdbOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (sealedValue.protectedAccess.isDefined) {
        val __value = sealedValue.protectedAccess.get
        __size += 1 + SemanticdbOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (sealedValue.protectedThisAccess.isDefined) {
        val __value = sealedValue.protectedThisAccess.get
        __size += 1 + SemanticdbOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (sealedValue.protectedWithinAccess.isDefined) {
        val __value = sealedValue.protectedWithinAccess.get
        __size += 1 + SemanticdbOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (sealedValue.publicAccess.isDefined) {
        val __value = sealedValue.publicAccess.get
        __size += 1 + SemanticdbOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
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
    def writeTo(`_output__`: SemanticdbOutputStream): _root_.scala.Unit = {
      sealedValue.privateAccess.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      sealedValue.privateThisAccess.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      sealedValue.privateWithinAccess.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      sealedValue.protectedAccess.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      sealedValue.protectedThisAccess.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      sealedValue.protectedWithinAccess.foreach { __v =>
        val __m = __v
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      sealedValue.publicAccess.foreach { __v =>
        val __m = __v
        _output__.writeTag(7, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def getPrivateAccess: dotty.tools.dotc.semanticdb.PrivateAccess = sealedValue.privateAccess.getOrElse(dotty.tools.dotc.semanticdb.PrivateAccess.defaultInstance)
    def withPrivateAccess(__v: dotty.tools.dotc.semanticdb.PrivateAccess): AccessMessage = copy(sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PrivateAccess(__v))
    def getPrivateThisAccess: dotty.tools.dotc.semanticdb.PrivateThisAccess = sealedValue.privateThisAccess.getOrElse(dotty.tools.dotc.semanticdb.PrivateThisAccess.defaultInstance)
    def withPrivateThisAccess(__v: dotty.tools.dotc.semanticdb.PrivateThisAccess): AccessMessage = copy(sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PrivateThisAccess(__v))
    def getPrivateWithinAccess: dotty.tools.dotc.semanticdb.PrivateWithinAccess = sealedValue.privateWithinAccess.getOrElse(dotty.tools.dotc.semanticdb.PrivateWithinAccess.defaultInstance)
    def withPrivateWithinAccess(__v: dotty.tools.dotc.semanticdb.PrivateWithinAccess): AccessMessage = copy(sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PrivateWithinAccess(__v))
    def getProtectedAccess: dotty.tools.dotc.semanticdb.ProtectedAccess = sealedValue.protectedAccess.getOrElse(dotty.tools.dotc.semanticdb.ProtectedAccess.defaultInstance)
    def withProtectedAccess(__v: dotty.tools.dotc.semanticdb.ProtectedAccess): AccessMessage = copy(sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.ProtectedAccess(__v))
    def getProtectedThisAccess: dotty.tools.dotc.semanticdb.ProtectedThisAccess = sealedValue.protectedThisAccess.getOrElse(dotty.tools.dotc.semanticdb.ProtectedThisAccess.defaultInstance)
    def withProtectedThisAccess(__v: dotty.tools.dotc.semanticdb.ProtectedThisAccess): AccessMessage = copy(sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.ProtectedThisAccess(__v))
    def getProtectedWithinAccess: dotty.tools.dotc.semanticdb.ProtectedWithinAccess = sealedValue.protectedWithinAccess.getOrElse(dotty.tools.dotc.semanticdb.ProtectedWithinAccess.defaultInstance)
    def withProtectedWithinAccess(__v: dotty.tools.dotc.semanticdb.ProtectedWithinAccess): AccessMessage = copy(sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.ProtectedWithinAccess(__v))
    def getPublicAccess: dotty.tools.dotc.semanticdb.PublicAccess = sealedValue.publicAccess.getOrElse(dotty.tools.dotc.semanticdb.PublicAccess.defaultInstance)
    def withPublicAccess(__v: dotty.tools.dotc.semanticdb.PublicAccess): AccessMessage = copy(sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PublicAccess(__v))
    def clearSealedValue: AccessMessage = copy(sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.Empty)
    def withSealedValue(__v: dotty.tools.dotc.semanticdb.AccessMessage.SealedValue): AccessMessage = copy(sealedValue = __v)
    
    
    
    
    def toAccess: dotty.tools.dotc.semanticdb.Access = dotty.tools.dotc.semanticdb.Access.AccessTypeMapper.toCustom(this)
    // @@protoc_insertion_point(GeneratedMessage[dotty.tools.dotc.semanticdb.Access])
}

object AccessMessage  extends SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.AccessMessage] {
  implicit def messageCompanion: SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.AccessMessage] = this
  def parseFrom(`_input__`: SemanticdbInputStream): dotty.tools.dotc.semanticdb.AccessMessage = {
    var __sealedValue: dotty.tools.dotc.semanticdb.AccessMessage.SealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.Empty
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PrivateAccess(__sealedValue.privateAccess.fold(LiteParser.readMessage[dotty.tools.dotc.semanticdb.PrivateAccess](_input__))(LiteParser.readMessage(_input__, _)))
        case 18 =>
          __sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PrivateThisAccess(__sealedValue.privateThisAccess.fold(LiteParser.readMessage[dotty.tools.dotc.semanticdb.PrivateThisAccess](_input__))(LiteParser.readMessage(_input__, _)))
        case 26 =>
          __sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PrivateWithinAccess(__sealedValue.privateWithinAccess.fold(LiteParser.readMessage[dotty.tools.dotc.semanticdb.PrivateWithinAccess](_input__))(LiteParser.readMessage(_input__, _)))
        case 34 =>
          __sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.ProtectedAccess(__sealedValue.protectedAccess.fold(LiteParser.readMessage[dotty.tools.dotc.semanticdb.ProtectedAccess](_input__))(LiteParser.readMessage(_input__, _)))
        case 42 =>
          __sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.ProtectedThisAccess(__sealedValue.protectedThisAccess.fold(LiteParser.readMessage[dotty.tools.dotc.semanticdb.ProtectedThisAccess](_input__))(LiteParser.readMessage(_input__, _)))
        case 50 =>
          __sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.ProtectedWithinAccess(__sealedValue.protectedWithinAccess.fold(LiteParser.readMessage[dotty.tools.dotc.semanticdb.ProtectedWithinAccess](_input__))(LiteParser.readMessage(_input__, _)))
        case 58 =>
          __sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.PublicAccess(__sealedValue.publicAccess.fold(LiteParser.readMessage[dotty.tools.dotc.semanticdb.PublicAccess](_input__))(LiteParser.readMessage(_input__, _)))
        case tag => _input__.skipField(tag)
      }
    }
    dotty.tools.dotc.semanticdb.AccessMessage(
        sealedValue = __sealedValue
    )
  }
  
  
  
  
  
  
  lazy val defaultInstance = dotty.tools.dotc.semanticdb.AccessMessage(
    sealedValue = dotty.tools.dotc.semanticdb.AccessMessage.SealedValue.Empty
  )
  sealed trait SealedValue  extends SemanticdbGeneratedOneof  derives CanEqual {
    def isEmpty: _root_.scala.Boolean = false
    def isDefined: _root_.scala.Boolean = true
    def isPrivateAccess: _root_.scala.Boolean = false
    def isPrivateThisAccess: _root_.scala.Boolean = false
    def isPrivateWithinAccess: _root_.scala.Boolean = false
    def isProtectedAccess: _root_.scala.Boolean = false
    def isProtectedThisAccess: _root_.scala.Boolean = false
    def isProtectedWithinAccess: _root_.scala.Boolean = false
    def isPublicAccess: _root_.scala.Boolean = false
    def privateAccess: _root_.scala.Option[dotty.tools.dotc.semanticdb.PrivateAccess] = _root_.scala.None
    def privateThisAccess: _root_.scala.Option[dotty.tools.dotc.semanticdb.PrivateThisAccess] = _root_.scala.None
    def privateWithinAccess: _root_.scala.Option[dotty.tools.dotc.semanticdb.PrivateWithinAccess] = _root_.scala.None
    def protectedAccess: _root_.scala.Option[dotty.tools.dotc.semanticdb.ProtectedAccess] = _root_.scala.None
    def protectedThisAccess: _root_.scala.Option[dotty.tools.dotc.semanticdb.ProtectedThisAccess] = _root_.scala.None
    def protectedWithinAccess: _root_.scala.Option[dotty.tools.dotc.semanticdb.ProtectedWithinAccess] = _root_.scala.None
    def publicAccess: _root_.scala.Option[dotty.tools.dotc.semanticdb.PublicAccess] = _root_.scala.None
  }
  object SealedValue {
    @SerialVersionUID(0L)
    case object Empty extends dotty.tools.dotc.semanticdb.AccessMessage.SealedValue {
      type ValueType = _root_.scala.Nothing
      override def isEmpty: _root_.scala.Boolean = true
      override def isDefined: _root_.scala.Boolean = false
      override def number: _root_.scala.Int = 0
      override def value: _root_.scala.Nothing = throw new java.util.NoSuchElementException("Empty.value")
    }
  
    @SerialVersionUID(0L)
    final case class PrivateAccess(value: dotty.tools.dotc.semanticdb.PrivateAccess) extends dotty.tools.dotc.semanticdb.AccessMessage.SealedValue  derives CanEqual {
      type ValueType = dotty.tools.dotc.semanticdb.PrivateAccess
      override def isPrivateAccess: _root_.scala.Boolean = true
      override def privateAccess: _root_.scala.Option[dotty.tools.dotc.semanticdb.PrivateAccess] = Some(value)
      override def number: _root_.scala.Int = 1
    }
    @SerialVersionUID(0L)
    final case class PrivateThisAccess(value: dotty.tools.dotc.semanticdb.PrivateThisAccess) extends dotty.tools.dotc.semanticdb.AccessMessage.SealedValue  derives CanEqual {
      type ValueType = dotty.tools.dotc.semanticdb.PrivateThisAccess
      override def isPrivateThisAccess: _root_.scala.Boolean = true
      override def privateThisAccess: _root_.scala.Option[dotty.tools.dotc.semanticdb.PrivateThisAccess] = Some(value)
      override def number: _root_.scala.Int = 2
    }
    @SerialVersionUID(0L)
    final case class PrivateWithinAccess(value: dotty.tools.dotc.semanticdb.PrivateWithinAccess) extends dotty.tools.dotc.semanticdb.AccessMessage.SealedValue  derives CanEqual {
      type ValueType = dotty.tools.dotc.semanticdb.PrivateWithinAccess
      override def isPrivateWithinAccess: _root_.scala.Boolean = true
      override def privateWithinAccess: _root_.scala.Option[dotty.tools.dotc.semanticdb.PrivateWithinAccess] = Some(value)
      override def number: _root_.scala.Int = 3
    }
    @SerialVersionUID(0L)
    final case class ProtectedAccess(value: dotty.tools.dotc.semanticdb.ProtectedAccess) extends dotty.tools.dotc.semanticdb.AccessMessage.SealedValue  derives CanEqual {
      type ValueType = dotty.tools.dotc.semanticdb.ProtectedAccess
      override def isProtectedAccess: _root_.scala.Boolean = true
      override def protectedAccess: _root_.scala.Option[dotty.tools.dotc.semanticdb.ProtectedAccess] = Some(value)
      override def number: _root_.scala.Int = 4
    }
    @SerialVersionUID(0L)
    final case class ProtectedThisAccess(value: dotty.tools.dotc.semanticdb.ProtectedThisAccess) extends dotty.tools.dotc.semanticdb.AccessMessage.SealedValue  derives CanEqual {
      type ValueType = dotty.tools.dotc.semanticdb.ProtectedThisAccess
      override def isProtectedThisAccess: _root_.scala.Boolean = true
      override def protectedThisAccess: _root_.scala.Option[dotty.tools.dotc.semanticdb.ProtectedThisAccess] = Some(value)
      override def number: _root_.scala.Int = 5
    }
    @SerialVersionUID(0L)
    final case class ProtectedWithinAccess(value: dotty.tools.dotc.semanticdb.ProtectedWithinAccess) extends dotty.tools.dotc.semanticdb.AccessMessage.SealedValue  derives CanEqual {
      type ValueType = dotty.tools.dotc.semanticdb.ProtectedWithinAccess
      override def isProtectedWithinAccess: _root_.scala.Boolean = true
      override def protectedWithinAccess: _root_.scala.Option[dotty.tools.dotc.semanticdb.ProtectedWithinAccess] = Some(value)
      override def number: _root_.scala.Int = 6
    }
    @SerialVersionUID(0L)
    final case class PublicAccess(value: dotty.tools.dotc.semanticdb.PublicAccess) extends dotty.tools.dotc.semanticdb.AccessMessage.SealedValue  derives CanEqual {
      type ValueType = dotty.tools.dotc.semanticdb.PublicAccess
      override def isPublicAccess: _root_.scala.Boolean = true
      override def publicAccess: _root_.scala.Option[dotty.tools.dotc.semanticdb.PublicAccess] = Some(value)
      override def number: _root_.scala.Int = 7
    }
  }
  final val PRIVATE_ACCESS_FIELD_NUMBER = 1
  final val PRIVATE_THIS_ACCESS_FIELD_NUMBER = 2
  final val PRIVATE_WITHIN_ACCESS_FIELD_NUMBER = 3
  final val PROTECTED_ACCESS_FIELD_NUMBER = 4
  final val PROTECTED_THIS_ACCESS_FIELD_NUMBER = 5
  final val PROTECTED_WITHIN_ACCESS_FIELD_NUMBER = 6
  final val PUBLIC_ACCESS_FIELD_NUMBER = 7
  def of(
    sealedValue: dotty.tools.dotc.semanticdb.AccessMessage.SealedValue
  ): _root_.dotty.tools.dotc.semanticdb.AccessMessage = _root_.dotty.tools.dotc.semanticdb.AccessMessage(
    sealedValue
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[dotty.tools.dotc.semanticdb.Access])
}

@SerialVersionUID(0L)
final case class PrivateAccess(
    )  extends dotty.tools.dotc.semanticdb.Access.NonEmpty with SemanticdbGeneratedMessage  derives CanEqual {
    final override def serializedSize: _root_.scala.Int = 0
    def writeTo(`_output__`: SemanticdbOutputStream): _root_.scala.Unit = {
    }
    
    
    
    
    // @@protoc_insertion_point(GeneratedMessage[dotty.tools.dotc.semanticdb.PrivateAccess])
}

object PrivateAccess  extends SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.PrivateAccess] {
  implicit def messageCompanion: SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.PrivateAccess] = this
  def parseFrom(`_input__`: SemanticdbInputStream): dotty.tools.dotc.semanticdb.PrivateAccess = {
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case tag => _input__.skipField(tag)
      }
    }
    dotty.tools.dotc.semanticdb.PrivateAccess(
    )
  }
  
  
  
  
  
  
  lazy val defaultInstance = dotty.tools.dotc.semanticdb.PrivateAccess(
  )
  def of(
  ): _root_.dotty.tools.dotc.semanticdb.PrivateAccess = _root_.dotty.tools.dotc.semanticdb.PrivateAccess(
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[dotty.tools.dotc.semanticdb.PrivateAccess])
}

@SerialVersionUID(0L)
final case class PrivateThisAccess(
    )  extends dotty.tools.dotc.semanticdb.Access.NonEmpty with SemanticdbGeneratedMessage  derives CanEqual {
    final override def serializedSize: _root_.scala.Int = 0
    def writeTo(`_output__`: SemanticdbOutputStream): _root_.scala.Unit = {
    }
    
    
    
    
    // @@protoc_insertion_point(GeneratedMessage[dotty.tools.dotc.semanticdb.PrivateThisAccess])
}

object PrivateThisAccess  extends SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.PrivateThisAccess] {
  implicit def messageCompanion: SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.PrivateThisAccess] = this
  def parseFrom(`_input__`: SemanticdbInputStream): dotty.tools.dotc.semanticdb.PrivateThisAccess = {
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case tag => _input__.skipField(tag)
      }
    }
    dotty.tools.dotc.semanticdb.PrivateThisAccess(
    )
  }
  
  
  
  
  
  
  lazy val defaultInstance = dotty.tools.dotc.semanticdb.PrivateThisAccess(
  )
  def of(
  ): _root_.dotty.tools.dotc.semanticdb.PrivateThisAccess = _root_.dotty.tools.dotc.semanticdb.PrivateThisAccess(
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[dotty.tools.dotc.semanticdb.PrivateThisAccess])
}

@SerialVersionUID(0L)
final case class PrivateWithinAccess(
    symbol: _root_.scala.Predef.String = ""
    )  extends dotty.tools.dotc.semanticdb.Access.NonEmpty with SemanticdbGeneratedMessage  derives CanEqual {
    @transient @sharable
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = symbol
        if (!__value.isEmpty) {
          __size += SemanticdbOutputStream.computeStringSize(1, __value)
        }
      };
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
    def writeTo(`_output__`: SemanticdbOutputStream): _root_.scala.Unit = {
      {
        val __v = symbol
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
    }
    def withSymbol(__v: _root_.scala.Predef.String): PrivateWithinAccess = copy(symbol = __v)
    
    
    
    
    // @@protoc_insertion_point(GeneratedMessage[dotty.tools.dotc.semanticdb.PrivateWithinAccess])
}

object PrivateWithinAccess  extends SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.PrivateWithinAccess] {
  implicit def messageCompanion: SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.PrivateWithinAccess] = this
  def parseFrom(`_input__`: SemanticdbInputStream): dotty.tools.dotc.semanticdb.PrivateWithinAccess = {
    var __symbol: _root_.scala.Predef.String = ""
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __symbol = _input__.readStringRequireUtf8()
        case tag => _input__.skipField(tag)
      }
    }
    dotty.tools.dotc.semanticdb.PrivateWithinAccess(
        symbol = __symbol
    )
  }
  
  
  
  
  
  
  lazy val defaultInstance = dotty.tools.dotc.semanticdb.PrivateWithinAccess(
    symbol = ""
  )
  final val SYMBOL_FIELD_NUMBER = 1
  def of(
    symbol: _root_.scala.Predef.String
  ): _root_.dotty.tools.dotc.semanticdb.PrivateWithinAccess = _root_.dotty.tools.dotc.semanticdb.PrivateWithinAccess(
    symbol
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[dotty.tools.dotc.semanticdb.PrivateWithinAccess])
}

@SerialVersionUID(0L)
final case class ProtectedAccess(
    )  extends dotty.tools.dotc.semanticdb.Access.NonEmpty with SemanticdbGeneratedMessage  derives CanEqual {
    final override def serializedSize: _root_.scala.Int = 0
    def writeTo(`_output__`: SemanticdbOutputStream): _root_.scala.Unit = {
    }
    
    
    
    
    // @@protoc_insertion_point(GeneratedMessage[dotty.tools.dotc.semanticdb.ProtectedAccess])
}

object ProtectedAccess  extends SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.ProtectedAccess] {
  implicit def messageCompanion: SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.ProtectedAccess] = this
  def parseFrom(`_input__`: SemanticdbInputStream): dotty.tools.dotc.semanticdb.ProtectedAccess = {
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case tag => _input__.skipField(tag)
      }
    }
    dotty.tools.dotc.semanticdb.ProtectedAccess(
    )
  }
  
  
  
  
  
  
  lazy val defaultInstance = dotty.tools.dotc.semanticdb.ProtectedAccess(
  )
  def of(
  ): _root_.dotty.tools.dotc.semanticdb.ProtectedAccess = _root_.dotty.tools.dotc.semanticdb.ProtectedAccess(
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[dotty.tools.dotc.semanticdb.ProtectedAccess])
}

@SerialVersionUID(0L)
final case class ProtectedThisAccess(
    )  extends dotty.tools.dotc.semanticdb.Access.NonEmpty with SemanticdbGeneratedMessage  derives CanEqual {
    final override def serializedSize: _root_.scala.Int = 0
    def writeTo(`_output__`: SemanticdbOutputStream): _root_.scala.Unit = {
    }
    
    
    
    
    // @@protoc_insertion_point(GeneratedMessage[dotty.tools.dotc.semanticdb.ProtectedThisAccess])
}

object ProtectedThisAccess  extends SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.ProtectedThisAccess] {
  implicit def messageCompanion: SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.ProtectedThisAccess] = this
  def parseFrom(`_input__`: SemanticdbInputStream): dotty.tools.dotc.semanticdb.ProtectedThisAccess = {
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case tag => _input__.skipField(tag)
      }
    }
    dotty.tools.dotc.semanticdb.ProtectedThisAccess(
    )
  }
  
  
  
  
  
  
  lazy val defaultInstance = dotty.tools.dotc.semanticdb.ProtectedThisAccess(
  )
  def of(
  ): _root_.dotty.tools.dotc.semanticdb.ProtectedThisAccess = _root_.dotty.tools.dotc.semanticdb.ProtectedThisAccess(
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[dotty.tools.dotc.semanticdb.ProtectedThisAccess])
}

@SerialVersionUID(0L)
final case class ProtectedWithinAccess(
    symbol: _root_.scala.Predef.String = ""
    )  extends dotty.tools.dotc.semanticdb.Access.NonEmpty with SemanticdbGeneratedMessage  derives CanEqual {
    @transient @sharable
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = symbol
        if (!__value.isEmpty) {
          __size += SemanticdbOutputStream.computeStringSize(1, __value)
        }
      };
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
    def writeTo(`_output__`: SemanticdbOutputStream): _root_.scala.Unit = {
      {
        val __v = symbol
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
    }
    def withSymbol(__v: _root_.scala.Predef.String): ProtectedWithinAccess = copy(symbol = __v)
    
    
    
    
    // @@protoc_insertion_point(GeneratedMessage[dotty.tools.dotc.semanticdb.ProtectedWithinAccess])
}

object ProtectedWithinAccess  extends SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.ProtectedWithinAccess] {
  implicit def messageCompanion: SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.ProtectedWithinAccess] = this
  def parseFrom(`_input__`: SemanticdbInputStream): dotty.tools.dotc.semanticdb.ProtectedWithinAccess = {
    var __symbol: _root_.scala.Predef.String = ""
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __symbol = _input__.readStringRequireUtf8()
        case tag => _input__.skipField(tag)
      }
    }
    dotty.tools.dotc.semanticdb.ProtectedWithinAccess(
        symbol = __symbol
    )
  }
  
  
  
  
  
  
  lazy val defaultInstance = dotty.tools.dotc.semanticdb.ProtectedWithinAccess(
    symbol = ""
  )
  final val SYMBOL_FIELD_NUMBER = 1
  def of(
    symbol: _root_.scala.Predef.String
  ): _root_.dotty.tools.dotc.semanticdb.ProtectedWithinAccess = _root_.dotty.tools.dotc.semanticdb.ProtectedWithinAccess(
    symbol
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[dotty.tools.dotc.semanticdb.ProtectedWithinAccess])
}

@SerialVersionUID(0L)
final case class PublicAccess(
    )  extends dotty.tools.dotc.semanticdb.Access.NonEmpty with SemanticdbGeneratedMessage  derives CanEqual {
    final override def serializedSize: _root_.scala.Int = 0
    def writeTo(`_output__`: SemanticdbOutputStream): _root_.scala.Unit = {
    }
    
    
    
    
    // @@protoc_insertion_point(GeneratedMessage[dotty.tools.dotc.semanticdb.PublicAccess])
}

object PublicAccess  extends SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.PublicAccess] {
  implicit def messageCompanion: SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.PublicAccess] = this
  def parseFrom(`_input__`: SemanticdbInputStream): dotty.tools.dotc.semanticdb.PublicAccess = {
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case tag => _input__.skipField(tag)
      }
    }
    dotty.tools.dotc.semanticdb.PublicAccess(
    )
  }
  
  
  
  
  
  
  lazy val defaultInstance = dotty.tools.dotc.semanticdb.PublicAccess(
  )
  def of(
  ): _root_.dotty.tools.dotc.semanticdb.PublicAccess = _root_.dotty.tools.dotc.semanticdb.PublicAccess(
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[dotty.tools.dotc.semanticdb.PublicAccess])
}
