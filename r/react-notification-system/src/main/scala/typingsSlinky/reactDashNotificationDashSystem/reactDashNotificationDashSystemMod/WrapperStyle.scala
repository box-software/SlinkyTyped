package typingsSlinky.reactDashNotificationDashSystem.reactDashNotificationDashSystemMod

import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperStyle extends js.Object {
  var DefaultStyle: js.UndefOr[CSSProperties] = js.undefined
}

object WrapperStyle {
  @scala.inline
  def apply(DefaultStyle: CSSProperties = null): WrapperStyle = {
    val __obj = js.Dynamic.literal()
    if (DefaultStyle != null) __obj.updateDynamic("DefaultStyle")(DefaultStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperStyle]
  }
}

