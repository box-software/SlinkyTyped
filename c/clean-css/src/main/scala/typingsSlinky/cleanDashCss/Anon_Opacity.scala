package typingsSlinky.cleanDashCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Opacity extends js.Object {
  /**
    * Controls `rgba()` / `hsla()` color support; defaults to `true`
    */
  var opacity: js.UndefOr[Boolean] = js.undefined
}

object Anon_Opacity {
  @scala.inline
  def apply(opacity: js.UndefOr[Boolean] = js.undefined): Anon_Opacity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Opacity]
  }
}

