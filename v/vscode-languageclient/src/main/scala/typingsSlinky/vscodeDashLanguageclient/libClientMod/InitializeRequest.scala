package typingsSlinky.vscodeDashLanguageclient.libClientMod

import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "InitializeRequest")
@js.native
object InitializeRequest extends js.Object {
  val `type`: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    InitializeParams, 
    InitializeResult, 
    typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeError, 
    Unit
  ] = js.native
}

