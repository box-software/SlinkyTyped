package typingsSlinky.baseui.timepickerMod

import typingsSlinky.baseui.Anon_Select
import typingsSlinky.baseui.baseuiStrings.`12`
import typingsSlinky.baseui.baseuiStrings.`24`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerProps extends js.Object {
  var creatable: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[`12` | `24`] = js.undefined
  var nullable: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ js.Date, _]] = js.undefined
  var overrides: js.UndefOr[Anon_Select] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var positive: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[js.Date | Null] = js.undefined
}

object TimePickerProps {
  @scala.inline
  def apply(
    creatable: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    format: `12` | `24` = null,
    nullable: js.UndefOr[Boolean] = js.undefined,
    onChange: /* args */ js.Date => _ = null,
    overrides: Anon_Select = null,
    placeholder: String = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    value: js.Date = null
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(creatable)) __obj.updateDynamic("creatable")(creatable.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerProps]
  }
}

