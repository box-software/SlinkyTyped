package typingsSlinky.antdDashMobileDashRn.libListIndexDotNativeMod

import slinky.core.ReactComponentClass
import typingsSlinky.antdDashMobileDashRn.Anon_ArrowArrowV
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnBooleans.`false`
import typingsSlinky.antdDashMobileDashRn.libListPropsTypeMod.ListPropsType
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps extends ListPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[Anon_ArrowArrowV] = js.undefined
}

object ListProps {
  @scala.inline
  def apply(
    children: `false` | Element | js.Array[Element] = null,
    renderFooter: js.Function0[ReactComponentClass[_]] | String | Element = null,
    renderHeader: js.Function0[ReactComponentClass[_]] | String | Element = null,
    style: StyleProp[ViewStyle] = null,
    styles: Anon_ArrowArrowV = null
  ): ListProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
}

