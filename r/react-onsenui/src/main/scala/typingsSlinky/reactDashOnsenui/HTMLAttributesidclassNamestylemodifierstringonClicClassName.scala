package typingsSlinky.reactDashOnsenui

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   onClick ? :react.react.MouseEventHandler<any>} */
trait HTMLAttributesidclassNamestylemodifierstringonClicClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNamestylemodifierstringonClicClassName {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    modifier: String = null,
    onClick: SyntheticMouseEvent[_] => Unit = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNamestylemodifierstringonClicClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNamestylemodifierstringonClicClassName]
  }
}

