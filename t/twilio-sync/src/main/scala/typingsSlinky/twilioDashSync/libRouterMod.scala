package typingsSlinky.twilioDashSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/router", JSImport.Namespace)
@js.native
object libRouterMod extends js.Object {
  @js.native
  class Router protected () extends js.Object {
    def this(params: js.Any) = this()
    var config: js.Any = js.native
    var notifications: js.Any = js.native
    var subscriptions: js.Any = js.native
    /**
      * Handle transport establishing event
      * If we have any subscriptions - we should check object for modifications
      */
    def onConnectionStateChanged(isConnected: Boolean): Unit = js.native
    /**
      * Entry point for all incoming messages
      * @param {String} type - Type of incoming message
      * @param {Object} message - Message to route
      */
    def onMessage(`type`: String, message: js.Any): Unit = js.native
    /**
      * Subscribe for events
      */
    def subscribe(sid: String, entity: js.Any): Unit = js.native
    /**
      * Unsubscribe from events
      */
    def unsubscribe(sid: String): Unit = js.native
  }
  
  @js.native
  class default protected () extends Router {
    def this(params: js.Any) = this()
  }
  
}

