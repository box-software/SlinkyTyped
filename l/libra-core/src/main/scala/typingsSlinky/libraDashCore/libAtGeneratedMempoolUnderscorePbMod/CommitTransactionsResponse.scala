package typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse")
@js.native
class CommitTransactionsResponse () extends Message

/* static members */
@JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse")
@js.native
object CommitTransactionsResponse extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): CommitTransactionsResponse = js.native
  def deserializeBinaryFromReader(message: CommitTransactionsResponse, reader: BinaryReader): CommitTransactionsResponse = js.native
  def serializeBinaryToWriter(message: CommitTransactionsResponse, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: CommitTransactionsResponse): AsObject = js.native
  type AsObject = js.Object
}

