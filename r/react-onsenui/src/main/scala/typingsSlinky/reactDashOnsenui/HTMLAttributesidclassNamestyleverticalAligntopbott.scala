package typingsSlinky.reactDashOnsenui

import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashOnsenui.reactDashOnsenuiStrings.bottom
import typingsSlinky.reactDashOnsenui.reactDashOnsenuiStrings.center
import typingsSlinky.reactDashOnsenui.reactDashOnsenuiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  verticalAlign ? :'top' | 'bottom' | 'center',   width ? :string} */
trait HTMLAttributesidclassNamestyleverticalAligntopbott extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var verticalAlign: js.UndefOr[top | bottom | center] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object HTMLAttributesidclassNamestyleverticalAligntopbott {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    style: CSSProperties = null,
    verticalAlign: top | bottom | center = null,
    width: String = null
  ): HTMLAttributesidclassNamestyleverticalAligntopbott = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNamestyleverticalAligntopbott]
  }
}

