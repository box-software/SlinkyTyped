package typingsSlinky.angularDashWebsocket.angularDashWebsocketMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object websocket {
  /**
    * Creates and opens an IWebSocket instance.
    *
    * @param url url to connect to
    * @return websocket instance
    */
  type IWebSocketProvider = js.Function3[
    /* url */ String, 
    /* protocols */ js.UndefOr[String | js.Array[String] | IWebSocketConfigOptions], 
    /* options */ js.UndefOr[IWebSocketConfigOptions], 
    IWebSocket
  ]
}
