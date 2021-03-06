package typingsSlinky.reduxDashForm.libFieldMod

import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonFieldProps extends CommonFieldInputProps {
  var onBlur: EventWithDataHandler[SyntheticFocusEvent[_]]
  var onChange: EventWithDataHandler[ChangeEvent[_]]
}

object CommonFieldProps {
  @scala.inline
  def apply(
    name: String,
    onBlur: (/* event */ js.UndefOr[SyntheticFocusEvent[_]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit,
    onChange: (/* event */ js.UndefOr[ChangeEvent[_]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit,
    onDragStart: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onDrop: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onFocus: (SyntheticFocusEvent[_], /* name */ js.UndefOr[String]) => Unit
  ): CommonFieldProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = js.Any.fromFunction4(onBlur), onChange = js.Any.fromFunction4(onChange), onDragStart = js.Any.fromFunction2(onDragStart), onDrop = js.Any.fromFunction2(onDrop), onFocus = js.Any.fromFunction2(onFocus))
  
    __obj.asInstanceOf[CommonFieldProps]
  }
}

