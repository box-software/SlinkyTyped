package typingsSlinky.reactDashSelect.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSelect.Anon_Event
import typingsSlinky.reactDashSelect.srcComponentsMultiValueMod.MultiValueProps
import typingsSlinky.reactDashSelect.srcTypesMod.ActionTypes
import typingsSlinky.reactDashSelect.srcTypesMod.ClassNamesState
import typingsSlinky.reactDashSelect.srcTypesMod.OptionsType
import typingsSlinky.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsMultiValue
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-select", "components.MultiValue")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    clearValue: () => Unit,
    components: js.Any,
    cropWithEllipsis: Boolean,
    cx: (js.UndefOr[Null | String], js.UndefOr[ClassNamesState], js.UndefOr[String]) => String | Unit,
    data: js.Any,
    getStyles: (String, js.Any) => js.Object,
    getValue: () => ValueType[js.Any],
    hasValue: Boolean,
    innerProps: js.Any,
    isDisabled: Boolean,
    isFocused: Boolean,
    isMulti: Boolean,
    options: OptionsType[js.Any],
    removeProps: Anon_Event,
    selectOption: js.Any => Unit,
    selectProps: typingsSlinky.reactDashSelect.srcSelectMod.Props[js.Any],
    setValue: (ValueType[js.Any], ActionTypes) => Unit,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(clearValue = js.Any.fromFunction0(clearValue), components = components.asInstanceOf[js.Any], cropWithEllipsis = cropWithEllipsis.asInstanceOf[js.Any], cx = js.Any.fromFunction3(cx), data = data.asInstanceOf[js.Any], getStyles = js.Any.fromFunction2(getStyles), getValue = js.Any.fromFunction0(getValue), hasValue = hasValue.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], removeProps = removeProps.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MultiValueProps[js.Any]
}

