package typingsSlinky.officeDashUiDashFabricDashReact.libComponentsOverflowSetOverflowSetDotTypesMod

import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.IFocusZoneProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsOverflowSetOverflowSetDotBaseMod.OverflowSetBase
import typingsSlinky.react.reactMod.ClassAttributes
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.LegacyRef
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverflowSetProps extends ClassAttributes[OverflowSetBase] {
  /**
    * Class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IOverflowSet]] = js.undefined
  /**
    * If true do not contain the OverflowSet inside of a FocusZone,
    * otherwise the OverflowSet will contain a FocusZone.
    * If this is set to true focusZoneProps will be ignored.
    * Use one or the other.
    */
  var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom properties for OverflowSet's FocusZone.
    * If doNotContainWithinFocusZone is set to true focusZoneProps will be ignored.
    * Use one or the other.
    */
  var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.undefined
  /**
    * Function that will take in an IOverflowSetItemProps and return the subMenu for that item.
    * If not provided, will use 'item.subMenuProps.items' by default.
    * This is only used if your overflow set has keytips.
    */
  var itemSubMenuProvider: js.UndefOr[js.Function1[/* item */ IOverflowSetItemProps, js.UndefOr[js.Array[_]]]] = js.undefined
  /**
    * An array of items to be rendered by your onRenderItem function in the primary content area
    */
  var items: js.UndefOr[js.Array[IOverflowSetItemProps]] = js.undefined
  /**
    * Optional full keytip sequence for the overflow button, if it will have a keytip.
    */
  var keytipSequences: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Rendering method for overflow button and contextual menu. The argument to the function is
    * the overflowItems passed in as props to this function.
    */
  var onRenderOverflowButton: IRenderFunction[js.Array[_]]
  /**
    * An array of items to be passed to overflow contextual menu
    */
  var overflowItems: js.UndefOr[js.Array[IOverflowSetItemProps]] = js.undefined
  /**
    * The role for the OverflowSet.
    * @defaultvalue 'menubar'
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles]] = js.undefined
  /**
    * Change item layout direction to vertical/stacked.
    * Setting vertical to true also changes default role to "menu".
    * @defaultvalue false
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
  /**
    * Method to call when trying to render an item.
    */
  def onRenderItem(item: IOverflowSetItemProps): js.Any
}

object IOverflowSetProps {
  @scala.inline
  def apply(
    onRenderItem: IOverflowSetItemProps => js.Any,
    onRenderOverflowButton: (/* props */ js.UndefOr[js.Array[_]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Array[_]], Element | Null]]) => Element | Null,
    className: String = null,
    componentRef: IRefObject[IOverflowSet] = null,
    doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined,
    focusZoneProps: IFocusZoneProps = null,
    itemSubMenuProvider: /* item */ IOverflowSetItemProps => js.UndefOr[js.Array[_]] = null,
    items: js.Array[IOverflowSetItemProps] = null,
    key: Key = null,
    keytipSequences: js.Array[String] = null,
    overflowItems: js.Array[IOverflowSetItemProps] = null,
    ref: LegacyRef[OverflowSetBase] = null,
    role: String = null,
    styles: IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles] = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): IOverflowSetProps = {
    val __obj = js.Dynamic.literal(onRenderItem = js.Any.fromFunction1(onRenderItem), onRenderOverflowButton = js.Any.fromFunction2(onRenderOverflowButton))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotContainWithinFocusZone)) __obj.updateDynamic("doNotContainWithinFocusZone")(doNotContainWithinFocusZone.asInstanceOf[js.Any])
    if (focusZoneProps != null) __obj.updateDynamic("focusZoneProps")(focusZoneProps.asInstanceOf[js.Any])
    if (itemSubMenuProvider != null) __obj.updateDynamic("itemSubMenuProvider")(js.Any.fromFunction1(itemSubMenuProvider))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keytipSequences != null) __obj.updateDynamic("keytipSequences")(keytipSequences.asInstanceOf[js.Any])
    if (overflowItems != null) __obj.updateDynamic("overflowItems")(overflowItems.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverflowSetProps]
  }
}

