package typingsSlinky.antdDashMobile.libFlexFlexItemMod

import typingsSlinky.antdDashMobile.libFlexPropsTypeMod.FlexItemPropsType
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexItemProps extends FlexItemPropsType {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FlexItemProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    style: CSSProperties = null
  ): FlexItemProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexItemProps]
  }
}

