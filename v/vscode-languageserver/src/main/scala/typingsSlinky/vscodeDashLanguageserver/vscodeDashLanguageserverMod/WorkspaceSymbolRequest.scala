package typingsSlinky.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.WorkspaceSymbolParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "WorkspaceSymbolRequest")
@js.native
object WorkspaceSymbolRequest extends js.Object {
  val `type`: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    WorkspaceSymbolParams, 
    (js.Array[
      typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolInformation
    ]) | Null, 
    Unit, 
    Unit
  ] = js.native
}

