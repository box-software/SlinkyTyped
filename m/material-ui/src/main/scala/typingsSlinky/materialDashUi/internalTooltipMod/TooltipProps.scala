package typingsSlinky.materialDashUi.internalTooltipMod

import slinky.core.TagMod
import typingsSlinky.materialDashUi.__MaterialUI.propTypes.tooltipHorizontal
import typingsSlinky.materialDashUi.__MaterialUI.propTypes.vertical
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.LegacyRef
import typingsSlinky.react.reactMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends Props[Tooltip] {
  var className: js.UndefOr[String] = js.undefined
  var horizontalPosition: js.UndefOr[tooltipHorizontal] = js.undefined
  var label: js.Any
  var show: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var touch: js.UndefOr[Boolean] = js.undefined
  var verticalPosition: js.UndefOr[vertical] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    label: js.Any,
    children: TagMod[Any] = null,
    className: String = null,
    horizontalPosition: tooltipHorizontal = null,
    key: Key = null,
    ref: LegacyRef[Tooltip] = null,
    show: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    verticalPosition: vertical = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (horizontalPosition != null) __obj.updateDynamic("horizontalPosition")(horizontalPosition.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (verticalPosition != null) __obj.updateDynamic("verticalPosition")(verticalPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

