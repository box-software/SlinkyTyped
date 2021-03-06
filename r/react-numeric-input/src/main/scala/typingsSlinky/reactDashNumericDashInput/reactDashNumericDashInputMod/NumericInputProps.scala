package typingsSlinky.reactDashNumericDashInput.reactDashNumericDashInputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.FocusEventHandler
import typingsSlinky.react.reactMod.FormEventHandler
import typingsSlinky.react.reactMod.KeyboardEventHandler
import typingsSlinky.react.reactMod.ReactEventHandler
import typingsSlinky.reactDashNumericDashInput.reactDashNumericDashInputStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.InputHTMLAttributes<std.HTMLInputElement>, 'min' | 'max' | 'step' | 'onChange' | 'defaultValue' | 'onInvalid' | 'style'> ]: react.react.InputHTMLAttributes<std.HTMLInputElement>[P]} */ trait NumericInputProps extends js.Object {
  var addLabelText: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[Double | String] = js.undefined
  var format: js.UndefOr[js.Function1[/* value */ Double | Null, String]] = js.undefined
  var max: js.UndefOr[BoundsFunctionProp] = js.undefined
  var min: js.UndefOr[BoundsFunctionProp] = js.undefined
  var mobile: js.UndefOr[Boolean | auto | (js.Function1[ReactComponentClass[NumericInputProps], Boolean])] = js.undefined
  var noStyle: js.UndefOr[Boolean] = js.undefined
  var noValidate: js.UndefOr[Boolean | String] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement | HTMLInputElement]] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* value */ Double | Null, 
      /* stringValue */ String, 
      /* input */ HTMLInputElement, 
      Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement | HTMLInputElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onInvalid: js.UndefOr[
    js.Function3[/* error */ String, /* value */ Double | Null, /* stringValue */ String, Unit]
  ] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement | HTMLInputElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onValid: js.UndefOr[js.Function2[/* value */ Double | Null, /* stringValue */ String, Unit]] = js.undefined
  var parse: js.UndefOr[js.Function1[/* stringValue */ String, Double | Null]] = js.undefined
  var precision: js.UndefOr[
    Double | (js.Function1[ReactComponentClass[NumericInputProps], js.UndefOr[Double | Null]])
  ] = js.undefined
  var snap: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[
    Double | (js.Function2[ReactComponentClass[NumericInputProps], /* direction */ String, js.UndefOr[Double]])
  ] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StringDictionary[CSSProperties] | Boolean] = js.undefined
  var value: js.UndefOr[Double | String] = js.undefined
}

object NumericInputProps {
  @scala.inline
  def apply(
    addLabelText: String = null,
    componentClass: String = null,
    defaultValue: Double | String = null,
    format: /* value */ Double | Null => String = null,
    max: BoundsFunctionProp = null,
    min: BoundsFunctionProp = null,
    mobile: Boolean | auto | (js.Function1[ReactComponentClass[NumericInputProps], Boolean]) = null,
    noStyle: js.UndefOr[Boolean] = js.undefined,
    noValidate: Boolean | String = null,
    onBlur: SyntheticFocusEvent[HTMLDivElement | HTMLInputElement] => Unit = null,
    onChange: (/* value */ Double | Null, /* stringValue */ String, /* input */ HTMLInputElement) => Unit = null,
    onFocus: SyntheticFocusEvent[HTMLDivElement | HTMLInputElement] => Unit = null,
    onInput: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit = null,
    onInvalid: (/* error */ String, /* value */ Double | Null, /* stringValue */ String) => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[HTMLDivElement | HTMLInputElement] => Unit = null,
    onSelect: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onValid: (/* value */ Double | Null, /* stringValue */ String) => Unit = null,
    parse: /* stringValue */ String => Double | Null = null,
    precision: Double | (js.Function1[ReactComponentClass[NumericInputProps], js.UndefOr[Double | Null]]) = null,
    snap: js.UndefOr[Boolean] = js.undefined,
    step: Double | (js.Function2[ReactComponentClass[NumericInputProps], /* direction */ String, js.UndefOr[Double]]) = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    style: StringDictionary[CSSProperties] | Boolean = null,
    value: Double | String = null
  ): NumericInputProps = {
    val __obj = js.Dynamic.literal()
    if (addLabelText != null) __obj.updateDynamic("addLabelText")(addLabelText.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (!js.isUndefined(noStyle)) __obj.updateDynamic("noStyle")(noStyle.asInstanceOf[js.Any])
    if (noValidate != null) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction3(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onValid != null) __obj.updateDynamic("onValid")(js.Any.fromFunction2(onValid))
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction1(parse))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericInputProps]
  }
}

