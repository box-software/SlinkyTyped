package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.input.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.Anon_Input
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.IBasePicker
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.IBasePickerStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.IBasePickerStyles
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.IBasePickerSuggestionsProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.IInputProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerMod.IPeoplePickerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersPickerItemDotTypesMod.IPickerItemProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionModel
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsItemDotTypesMod.ISuggestionItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IPeoplePickerProps_1197075780[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, disabled, onBlur, onChange, onFocus */
  def apply(
    onResolveSuggestions: (String, js.UndefOr[js.Array[IPersonaProps]]) => js.Array[IPersonaProps] | js.Thenable[js.Array[IPersonaProps]],
    componentRef: IRefObject[IBasePicker[IPersonaProps]] = null,
    createGenericItem: (/* input */ String, /* ValidationState */ ValidationState) => ISuggestionModel[IPersonaProps] | IPersonaProps = null,
    defaultSelectedItems: js.Array[IPersonaProps] = null,
    enableSelectedSuggestionAlert: js.UndefOr[Boolean] = js.undefined,
    getTextFromItem: (IPersonaProps, /* currentValue */ js.UndefOr[String]) => String = null,
    inputProps: IInputProps = null,
    itemLimit: Int | Double = null,
    onDismiss: (/* ev */ js.UndefOr[js.Any], /* selectedItem */ js.UndefOr[IPersonaProps]) => Unit = null,
    onEmptyInputFocus: /* selectedItems */ js.UndefOr[js.Array[IPersonaProps]] => js.Array[IPersonaProps] | js.Thenable[js.Array[IPersonaProps]] = null,
    onEmptyResolveSuggestions: /* selectedItems */ js.UndefOr[js.Array[IPersonaProps]] => js.Array[IPersonaProps] | js.Thenable[js.Array[IPersonaProps]] = null,
    onGetMoreResults: (/* filter */ String, /* selectedItems */ js.UndefOr[js.Array[IPersonaProps]]) => js.Array[IPersonaProps] | js.Thenable[js.Array[IPersonaProps]] = null,
    onInputChange: /* input */ String => String = null,
    onItemSelected: /* selectedItem */ js.UndefOr[IPersonaProps] => IPersonaProps | js.Thenable[IPersonaProps] | Null = null,
    onRemoveSuggestion: IPersonaProps => Unit = null,
    onRenderItem: /* props */ IPickerItemProps[IPersonaProps] => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    onRenderSuggestionsItem: (IPersonaProps, /* itemProps */ ISuggestionItemProps[IPersonaProps]) => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    onValidateInput: /* input */ String => ValidationState = null,
    pickerCalloutProps: ICalloutProps = null,
    pickerSuggestionsProps: IBasePickerSuggestionsProps[_] = null,
    removeButtonAriaLabel: String = null,
    resolveDelay: Int | Double = null,
    searchingText: (js.Function1[/* props */ Anon_Input, String]) | String = null,
    selectedItems: js.Array[IPersonaProps] = null,
    styles: IStyleFunctionOrObject[IBasePickerStyleProps, IBasePickerStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(onResolveSuggestions = js.Any.fromFunction2(onResolveSuggestions))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (createGenericItem != null) __obj.updateDynamic("createGenericItem")(js.Any.fromFunction2(createGenericItem))
    if (defaultSelectedItems != null) __obj.updateDynamic("defaultSelectedItems")(defaultSelectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSelectedSuggestionAlert)) __obj.updateDynamic("enableSelectedSuggestionAlert")(enableSelectedSuggestionAlert.asInstanceOf[js.Any])
    if (getTextFromItem != null) __obj.updateDynamic("getTextFromItem")(js.Any.fromFunction2(getTextFromItem))
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (itemLimit != null) __obj.updateDynamic("itemLimit")(itemLimit.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction2(onDismiss))
    if (onEmptyInputFocus != null) __obj.updateDynamic("onEmptyInputFocus")(js.Any.fromFunction1(onEmptyInputFocus))
    if (onEmptyResolveSuggestions != null) __obj.updateDynamic("onEmptyResolveSuggestions")(js.Any.fromFunction1(onEmptyResolveSuggestions))
    if (onGetMoreResults != null) __obj.updateDynamic("onGetMoreResults")(js.Any.fromFunction2(onGetMoreResults))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction1(onInputChange))
    if (onItemSelected != null) __obj.updateDynamic("onItemSelected")(js.Any.fromFunction1(onItemSelected))
    if (onRemoveSuggestion != null) __obj.updateDynamic("onRemoveSuggestion")(js.Any.fromFunction1(onRemoveSuggestion))
    if (onRenderItem != null) __obj.updateDynamic("onRenderItem")(js.Any.fromFunction1(onRenderItem))
    if (onRenderSuggestionsItem != null) __obj.updateDynamic("onRenderSuggestionsItem")(js.Any.fromFunction2(onRenderSuggestionsItem))
    if (onValidateInput != null) __obj.updateDynamic("onValidateInput")(js.Any.fromFunction1(onValidateInput))
    if (pickerCalloutProps != null) __obj.updateDynamic("pickerCalloutProps")(pickerCalloutProps.asInstanceOf[js.Any])
    if (pickerSuggestionsProps != null) __obj.updateDynamic("pickerSuggestionsProps")(pickerSuggestionsProps.asInstanceOf[js.Any])
    if (removeButtonAriaLabel != null) __obj.updateDynamic("removeButtonAriaLabel")(removeButtonAriaLabel.asInstanceOf[js.Any])
    if (resolveDelay != null) __obj.updateDynamic("resolveDelay")(resolveDelay.asInstanceOf[js.Any])
    if (searchingText != null) __obj.updateDynamic("searchingText")(searchingText.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IPeoplePickerProps
}

