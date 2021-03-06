package typingsSlinky.antdDashMobileDashRn.libDateDashPickerPropsTypeMod

import slinky.core.TagMod
import typingsSlinky.antdDashMobileDashRn.Anon_DatePickerLocale
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.date
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.datetime
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.month
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.time
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerPropsType extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dismissText: js.UndefOr[TagMod[Any]] = js.undefined
  var extra: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String | (js.Function1[/* value */ js.Date, String])] = js.undefined
  var locale: js.UndefOr[Anon_DatePickerLocale] = js.undefined
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[datetime | date | year | month | time] = js.undefined
  var okText: js.UndefOr[TagMod[Any]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.Date, Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function2[/* vals */ js.Any, /* index */ Double, Unit]] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
  var value: js.UndefOr[js.Date] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object DatePickerPropsType {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dismissText: TagMod[Any] = null,
    extra: String = null,
    format: String | (js.Function1[/* value */ js.Date, String]) = null,
    locale: Anon_DatePickerLocale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    minuteStep: Int | Double = null,
    mode: datetime | date | year | month | time = null,
    okText: TagMod[Any] = null,
    onChange: /* value */ js.Date => Unit = null,
    onDismiss: () => Unit = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Unit = null,
    title: TagMod[Any] = null,
    value: js.Date = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DatePickerPropsType = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerPropsType]
  }
}

