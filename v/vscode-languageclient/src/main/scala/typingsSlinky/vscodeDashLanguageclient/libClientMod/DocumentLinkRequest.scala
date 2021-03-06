package typingsSlinky.vscodeDashLanguageclient.libClientMod

import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentLinkParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentLinkRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "DocumentLinkRequest")
@js.native
object DocumentLinkRequest extends js.Object {
  val `type`: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    DocumentLinkParams, 
    (js.Array[
      typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentLink
    ]) | Null, 
    Unit, 
    DocumentLinkRegistrationOptions
  ] = js.native
}

