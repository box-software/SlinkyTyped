package typingsSlinky.ckeditor.CKEDITOR.dialog.definition

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.plugins.widget
import typingsSlinky.ckeditor.CKEDITOR.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait file extends labeledElement {
  var action: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object file {
  @scala.inline
  def apply(
    action: String = null,
    align: String = null,
    className: String = null,
    commit: /* widget */ widget => Unit = null,
    controlStyle: String = null,
    id: String = null,
    inputStyle: String = null,
    label: String = null,
    labelLayout: String = null,
    labelStyle: String = null,
    onHide: /* elem */ typingsSlinky.ckeditor.CKEDITOR.ui.dialog.uiElement => Unit = null,
    onLoad: /* elem */ typingsSlinky.ckeditor.CKEDITOR.ui.dialog.uiElement => Unit = null,
    onShow: /* elem */ typingsSlinky.ckeditor.CKEDITOR.ui.dialog.uiElement => Unit = null,
    requiredContent: String | StringDictionary[js.Any] | style = null,
    setup: /* widget */ widget => Unit = null,
    size: String = null,
    style: String = null,
    title: String = null,
    `type`: String = null,
    validate: () => Boolean = null,
    widths: js.Array[Double] = null
  ): file = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (commit != null) __obj.updateDynamic("commit")(js.Any.fromFunction1(commit))
    if (controlStyle != null) __obj.updateDynamic("controlStyle")(controlStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelLayout != null) __obj.updateDynamic("labelLayout")(labelLayout.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction1(setup))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[file]
  }
}

