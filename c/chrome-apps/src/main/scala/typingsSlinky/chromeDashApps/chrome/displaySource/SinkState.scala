package typingsSlinky.chromeDashApps.chrome.displaySource

import typingsSlinky.chromeDashApps.chromeDashAppsStrings.Connected
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.Connecting
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.Disconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @enum
  * @description
  * **'connected'**
  * Connected using this Display Source (i.e., there is an active session)
  *
  * **'connecting'**
  * In process of connection to this Display Source
  *
  * **'disconnected'**
  * Disconnected from this Display Source
  */
@JSGlobal("chrome.displaySource.SinkState")
@js.native
object SinkState extends js.Object {
  var CONNECTED: Connected = js.native
  var CONNECTING: Connecting = js.native
  var DISCONNECTED: Disconnected = js.native
}

