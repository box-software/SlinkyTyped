package typingsSlinky.twilsock

import typingsSlinky.twilsock.libInterfacesChannelMod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/websocketchannel", JSImport.Namespace)
@js.native
object libWebsocketchannelMod extends js.Object {
  @js.native
  class WebSocketChannel protected () extends Channel {
    def this(url: String) = this()
    var WebSocket: js.Any = js.native
    var socket: js.Any = js.native
    val url: js.Any = js.native
    def close(): Unit = js.native
    def connect(): Unit = js.native
  }
  
}

