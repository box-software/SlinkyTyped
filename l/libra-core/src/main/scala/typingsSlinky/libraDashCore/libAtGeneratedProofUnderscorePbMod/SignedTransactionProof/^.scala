package typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.SignedTransactionProof

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.SignedTransactionProof = js.native
  def deserializeBinaryFromReader(
    message: typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.SignedTransactionProof,
    reader: BinaryReader
  ): typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.SignedTransactionProof = js.native
  def serializeBinaryToWriter(
    message: typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.SignedTransactionProof,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.SignedTransactionProof
  ): AsObject = js.native
}

