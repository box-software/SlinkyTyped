package typingsSlinky.d3pie

import typingsSlinky.d3pie.d3pieStrings.curved
import typingsSlinky.d3pie.d3pieStrings.straight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorCurved extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[curved | straight] = js.undefined
}

object Anon_ColorCurved {
  @scala.inline
  def apply(color: String = null, enabled: js.UndefOr[Boolean] = js.undefined, style: curved | straight = null): Anon_ColorCurved = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorCurved]
  }
}

