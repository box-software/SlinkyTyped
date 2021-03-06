package typingsSlinky.atAntDashDesignReactDashNative.libAccordionMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionHeader extends js.Object {
  var content: ReactElement
  var style: StyleProp[ViewStyle]
  var title: String
}

object AccordionHeader {
  @scala.inline
  def apply(content: ReactElement, title: String, style: StyleProp[ViewStyle] = null): AccordionHeader = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionHeader]
  }
}

