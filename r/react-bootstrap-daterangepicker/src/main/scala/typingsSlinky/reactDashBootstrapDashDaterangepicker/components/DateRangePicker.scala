package typingsSlinky.reactDashBootstrapDashDaterangepicker.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.daterangepicker.daterangepickerMod.DateOrString
import typingsSlinky.daterangepicker.daterangepickerMod.Locale
import typingsSlinky.daterangepicker.daterangepickerStrings.center
import typingsSlinky.daterangepicker.daterangepickerStrings.down
import typingsSlinky.daterangepicker.daterangepickerStrings.left
import typingsSlinky.daterangepicker.daterangepickerStrings.right
import typingsSlinky.daterangepicker.daterangepickerStrings.up
import typingsSlinky.moment.momentMod.Duration
import typingsSlinky.moment.momentMod.MomentInput
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateRangePicker
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashBootstrapDashDaterangepicker.ReactBootstrapDaterangepicker.DateRangePicker
    ] {
  @JSGlobal("ReactBootstrapDaterangepicker.DateRangePicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    alwaysShowCalendars: js.UndefOr[Boolean] = js.undefined,
    applyButtonClasses: String = null,
    autoApply: js.UndefOr[Boolean] = js.undefined,
    autoUpdateInput: js.UndefOr[Boolean] = js.undefined,
    buttonClasses: js.Array[String] = null,
    cancelButtonClasses: String = null,
    containerClass: String = null,
    containerStyles: CSSProperties = null,
    drops: down | up = null,
    endDate: DateOrString = null,
    isCustomDate: /* date */ DateOrString => js.UndefOr[String | js.Array[String]] = null,
    isInvalidDate: (/* startDate */ DateOrString, /* endDate */ js.UndefOr[DateOrString]) => Boolean = null,
    linkedCalendars: js.UndefOr[Boolean] = js.undefined,
    locale: Locale = null,
    maxDate: DateOrString = null,
    maxSpan: MomentInput | Duration = null,
    maxYear: Int | Double = null,
    minDate: DateOrString = null,
    minYear: Int | Double = null,
    onApply: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any = null,
    onCancel: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any = null,
    onEvent: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any = null,
    onHide: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any = null,
    onHideCalendar: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any = null,
    onShow: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any = null,
    onShowCalendar: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any = null,
    opens: left | right | center = null,
    parentEl: String = null,
    ranges: StringDictionary[js.Tuple2[DateOrString, DateOrString]] = null,
    showCustomRangeLabel: js.UndefOr[Boolean] = js.undefined,
    showDropdowns: js.UndefOr[Boolean] = js.undefined,
    showISOWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    singleDatePicker: js.UndefOr[Boolean] = js.undefined,
    startDate: DateOrString = null,
    timePicker: js.UndefOr[Boolean] = js.undefined,
    timePicker24Hour: js.UndefOr[Boolean] = js.undefined,
    timePickerIncrement: Int | Double = null,
    timePickerSeconds: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBootstrapDashDaterangepicker.ReactBootstrapDaterangepicker.DateRangePicker
  ] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowCalendars)) __obj.updateDynamic("alwaysShowCalendars")(alwaysShowCalendars.asInstanceOf[js.Any])
    if (applyButtonClasses != null) __obj.updateDynamic("applyButtonClasses")(applyButtonClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(autoApply)) __obj.updateDynamic("autoApply")(autoApply.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpdateInput)) __obj.updateDynamic("autoUpdateInput")(autoUpdateInput.asInstanceOf[js.Any])
    if (buttonClasses != null) __obj.updateDynamic("buttonClasses")(buttonClasses.asInstanceOf[js.Any])
    if (cancelButtonClasses != null) __obj.updateDynamic("cancelButtonClasses")(cancelButtonClasses.asInstanceOf[js.Any])
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass.asInstanceOf[js.Any])
    if (containerStyles != null) __obj.updateDynamic("containerStyles")(containerStyles.asInstanceOf[js.Any])
    if (drops != null) __obj.updateDynamic("drops")(drops.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (isCustomDate != null) __obj.updateDynamic("isCustomDate")(js.Any.fromFunction1(isCustomDate))
    if (isInvalidDate != null) __obj.updateDynamic("isInvalidDate")(js.Any.fromFunction2(isInvalidDate))
    if (!js.isUndefined(linkedCalendars)) __obj.updateDynamic("linkedCalendars")(linkedCalendars.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxSpan != null) __obj.updateDynamic("maxSpan")(maxSpan.asInstanceOf[js.Any])
    if (maxYear != null) __obj.updateDynamic("maxYear")(maxYear.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minYear != null) __obj.updateDynamic("minYear")(minYear.asInstanceOf[js.Any])
    if (onApply != null) __obj.updateDynamic("onApply")(js.Any.fromFunction2(onApply))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction2(onCancel))
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction2(onEvent))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onHideCalendar != null) __obj.updateDynamic("onHideCalendar")(js.Any.fromFunction2(onHideCalendar))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction2(onShow))
    if (onShowCalendar != null) __obj.updateDynamic("onShowCalendar")(js.Any.fromFunction2(onShowCalendar))
    if (opens != null) __obj.updateDynamic("opens")(opens.asInstanceOf[js.Any])
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (!js.isUndefined(showCustomRangeLabel)) __obj.updateDynamic("showCustomRangeLabel")(showCustomRangeLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showDropdowns)) __obj.updateDynamic("showDropdowns")(showDropdowns.asInstanceOf[js.Any])
    if (!js.isUndefined(showISOWeekNumbers)) __obj.updateDynamic("showISOWeekNumbers")(showISOWeekNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(singleDatePicker)) __obj.updateDynamic("singleDatePicker")(singleDatePicker.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (!js.isUndefined(timePicker)) __obj.updateDynamic("timePicker")(timePicker.asInstanceOf[js.Any])
    if (!js.isUndefined(timePicker24Hour)) __obj.updateDynamic("timePicker24Hour")(timePicker24Hour.asInstanceOf[js.Any])
    if (timePickerIncrement != null) __obj.updateDynamic("timePickerIncrement")(timePickerIncrement.asInstanceOf[js.Any])
    if (!js.isUndefined(timePickerSeconds)) __obj.updateDynamic("timePickerSeconds")(timePickerSeconds.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBootstrapDashDaterangepicker.ReactBootstrapDaterangepicker.DateRangePicker
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashBootstrapDashDaterangepicker.ReactBootstrapDaterangepicker.DateRangePicker](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactDashBootstrapDashDaterangepicker.ReactBootstrapDaterangepicker.Props
}

