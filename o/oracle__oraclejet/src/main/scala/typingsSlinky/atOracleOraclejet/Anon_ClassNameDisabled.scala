package typingsSlinky.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameDisabled extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object Anon_ClassNameDisabled {
  @scala.inline
  def apply(className: String = null, disabled: js.UndefOr[Boolean] = js.undefined, tooltip: String = null): Anon_ClassNameDisabled = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassNameDisabled]
  }
}

