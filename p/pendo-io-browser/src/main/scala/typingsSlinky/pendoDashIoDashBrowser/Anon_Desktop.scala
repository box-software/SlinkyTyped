package typingsSlinky.pendoDashIoDashBrowser

import typingsSlinky.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.desktop
import typingsSlinky.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.mobile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Desktop extends js.Object {
  var desktop: Boolean
  var mobile: Boolean
  var `type`: desktop | mobile
}

object Anon_Desktop {
  @scala.inline
  def apply(desktop: Boolean, mobile: Boolean, `type`: desktop | mobile): Anon_Desktop = {
    val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Desktop]
  }
}

