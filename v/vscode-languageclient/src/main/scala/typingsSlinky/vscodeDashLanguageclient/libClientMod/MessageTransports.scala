package typingsSlinky.vscodeDashLanguageclient.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTransports extends js.Object {
  var detached: js.UndefOr[Boolean] = js.undefined
  var reader: typingsSlinky.vscodeDashJsonrpc.libMessageReaderMod.MessageReader
  var writer: typingsSlinky.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
}

@JSImport("vscode-languageclient/lib/client", "MessageTransports")
@js.native
object MessageTransports extends js.Object {
  def is(value: js.Any): /* is vscode-languageclient.vscode-languageclient/lib/client.MessageTransports */ Boolean = js.native
}

