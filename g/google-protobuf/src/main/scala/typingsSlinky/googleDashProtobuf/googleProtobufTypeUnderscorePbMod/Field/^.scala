package typingsSlinky.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Field

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Field")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Field = js.native
  def deserializeBinaryFromReader(
    message: typingsSlinky.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Field,
    reader: BinaryReader
  ): typingsSlinky.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Field = js.native
  def serializeBinaryToWriter(
    message: typingsSlinky.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Field,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Field
  ): AsObject = js.native
}

