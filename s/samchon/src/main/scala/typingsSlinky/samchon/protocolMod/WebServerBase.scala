package typingsSlinky.samchon.protocolMod

import typingsSlinky.samchon.protocolServerIServerMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "WebServerBase")
@js.native
class WebServerBase protected ()
  extends typingsSlinky.samchon.protocolServerBaseWebServerBaseMod.WebServerBase {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: IServer) = this()
}

