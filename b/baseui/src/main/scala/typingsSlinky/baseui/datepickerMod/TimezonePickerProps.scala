package typingsSlinky.baseui.datepickerMod

import slinky.core.TagMod
import typingsSlinky.baseui.Anon_Id
import typingsSlinky.baseui.Anon_Select
import typingsSlinky.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimezonePickerProps extends js.Object {
  var date: js.UndefOr[js.Date] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var mapLabels: js.UndefOr[js.Function1[/* args */ Option, TagMod[Any]]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ Anon_Id, _]] = js.undefined
  var overrides: js.UndefOr[Anon_Select] = js.undefined
  var positive: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TimezonePickerProps {
  @scala.inline
  def apply(
    date: js.Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    mapLabels: /* args */ Option => TagMod[Any] = null,
    onChange: /* value */ Anon_Id => _ = null,
    overrides: Anon_Select = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): TimezonePickerProps = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (mapLabels != null) __obj.updateDynamic("mapLabels")(js.Any.fromFunction1(mapLabels))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimezonePickerProps]
  }
}

