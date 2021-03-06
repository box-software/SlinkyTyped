package typingsSlinky.chromeDashApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The type of modal dialog requested by the guest.
  */
/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.alert
  - typings.chromeDashApps.chromeDashAppsStrings.confirm
  - typings.chromeDashApps.chromeDashAppsStrings.prompt
*/
trait DialogMessageType extends js.Object

object DialogMessageType {
  @scala.inline
  def alert: typingsSlinky.chromeDashApps.chromeDashAppsStrings.alert = this.cast("alert")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirm: typingsSlinky.chromeDashApps.chromeDashAppsStrings.confirm = this.cast("confirm")
  @scala.inline
  def prompt: typingsSlinky.chromeDashApps.chromeDashAppsStrings.prompt = this.cast("prompt")
}

