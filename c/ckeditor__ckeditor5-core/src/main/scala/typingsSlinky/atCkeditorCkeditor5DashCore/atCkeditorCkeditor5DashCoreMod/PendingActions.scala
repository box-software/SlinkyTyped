package typingsSlinky.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod

import typingsSlinky.atCkeditorCkeditor5DashCore.Anon_Message
import typingsSlinky.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "PendingActions")
@js.native
class PendingActions () extends Plugin[Unit] {
  var first: Null | (Observable with Anon_Message) = js.native
  val hasAny: Boolean = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[js.Iterator[Observable with Anon_Message]] = js.native
  def add(message: String): Observable with Anon_Message = js.native
  def remove(action: Observable with Anon_Message): Unit = js.native
}

/* static members */
@JSImport("@ckeditor/ckeditor5-core", "PendingActions")
@js.native
object PendingActions extends js.Object {
  val pluginName: typingsSlinky.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreStrings.PendingActions = js.native
}

