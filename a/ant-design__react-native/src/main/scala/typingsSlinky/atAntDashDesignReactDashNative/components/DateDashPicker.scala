package typingsSlinky.atAntDashDesignReactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignReactDashNative.Anon_DatePickerLocale
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.date
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.datetime
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.month
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.time
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.year
import typingsSlinky.atAntDashDesignReactDashNative.libDateDashPickerMod.DatePickerProps
import typingsSlinky.atAntDashDesignReactDashNative.libDateDashPickerMod.default
import typingsSlinky.atAntDashDesignReactDashNative.libPickerStyleMod.PickerStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateDashPicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@ant-design/react-native/lib/date-picker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, onChange */
  def apply(
    date: js.Any = null,
    defaultDate: js.Date = null,
    dismissText: TagMod[Any] = null,
    extra: String = null,
    format: String | (js.Function1[/* value */ js.Date, String]) = null,
    formatDay: (/* day */ Double, /* date */ js.UndefOr[js.Any]) => _ = null,
    formatMonth: (/* month */ Double, /* date */ js.UndefOr[js.Any]) => _ = null,
    itemStyle: StyleProp[ViewStyle] = null,
    locale: Anon_DatePickerLocale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    minuteStep: Int | Double = null,
    mode: datetime | date | year | month | time = null,
    okText: TagMod[Any] = null,
    onDateChange: /* date */ js.Any => Unit = null,
    onDismiss: () => Unit = null,
    onScrollChange: (/* date */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Unit = null,
    rootNativeProps: js.Object = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[PickerStyle] = null,
    title: TagMod[Any] = null,
    triggerTypes: String = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: js.Date = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatDay != null) __obj.updateDynamic("formatDay")(js.Any.fromFunction2(formatDay))
    if (formatMonth != null) __obj.updateDynamic("formatMonth")(js.Any.fromFunction2(formatMonth))
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1(onDateChange))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction3(onScrollChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triggerTypes != null) __obj.updateDynamic("triggerTypes")(triggerTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atAntDashDesignReactDashNative.libDateDashPickerMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DatePickerProps
}

