package typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo = js.native
  def deserializeBinaryFromReader(
    message: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo,
    reader: BinaryReader
  ): typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo = js.native
  def serializeBinaryToWriter(
    message: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo
  ): AsObject = js.native
}

