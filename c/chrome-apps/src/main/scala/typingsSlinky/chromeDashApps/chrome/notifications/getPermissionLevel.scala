package typingsSlinky.chromeDashApps.chrome.notifications

import typingsSlinky.chromeDashApps.Anon_DENIED
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.denied
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.granted
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications.getPermissionLevel")
@js.native
object getPermissionLevel extends js.Object {
  /**
    * Retrieves whether the user has enabled notifications from this app .
    * @since Chrome 32.
    * @param callback Returns the current permission level.
    * @see enum PermissionLevel
    */
  def apply(
    callback: js.Function1[
      /* level */ ToStringLiteral[Anon_DENIED, String, Exclude[String, granted | denied]], 
      Unit
    ]
  ): Unit = js.native
}

