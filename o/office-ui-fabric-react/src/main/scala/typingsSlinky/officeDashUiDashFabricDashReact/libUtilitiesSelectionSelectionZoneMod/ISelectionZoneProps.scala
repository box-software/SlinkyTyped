package typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesSelectionSelectionZoneMod

import org.scalajs.dom.raw.Event
import typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.IObjectWithKey
import typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.ISelection
import typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode
import typingsSlinky.react.reactMod.ClassAttributes
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionZoneProps extends ClassAttributes[SelectionZone] {
  /**
    * Reference to the component interface.
    */
  var componentRef: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If true, disables automatic selection on input elements.
    */
  var disableAutoSelectOnInputElements: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, modal selection is enabled on touch event.
    */
  var enterModalOnTouch: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines if an item is selected on focus.
    *
    * @defaultvalue true
    */
  var isSelectedOnFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated No longer in use, focus is now managed by {@link FocusZone}.
    */
  var layout: js.UndefOr[js.Object] = js.undefined
  /**
    * Optional callback for when an
    * item's contextual menu action occurs.
    */
  var onItemContextMenu: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event], 
      Unit | Boolean
    ]
  ] = js.undefined
  /**
    * Optional callback for when an item is
    * invoked via ENTER or double-click.
    */
  var onItemInvoked: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[IObjectWithKey], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event], 
      Unit
    ]
  ] = js.undefined
  /**
    * Required {@link ISelection} instance bound to the {@link SelectionZone}.
    */
  var selection: ISelection
  /**
    * The mode of Selection, where the value is one of
    * 'none', 'single', or 'multiple'.
    *
    * @defaultvalue {@link SelectionMode.multiple}
    */
  var selectionMode: js.UndefOr[SelectionMode] = js.undefined
  /**
    * If true, selection is preserved on outer click.
    */
  var selectionPreservedOnEmptyClick: js.UndefOr[Boolean] = js.undefined
}

object ISelectionZoneProps {
  @scala.inline
  def apply(
    selection: ISelection,
    componentRef: () => Unit = null,
    disableAutoSelectOnInputElements: js.UndefOr[Boolean] = js.undefined,
    enterModalOnTouch: js.UndefOr[Boolean] = js.undefined,
    isSelectedOnFocus: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    layout: js.Object = null,
    onItemContextMenu: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit | Boolean = null,
    onItemInvoked: (/* item */ js.UndefOr[IObjectWithKey], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit = null,
    ref: LegacyRef[SelectionZone] = null,
    selectionMode: SelectionMode = null,
    selectionPreservedOnEmptyClick: js.UndefOr[Boolean] = js.undefined
  ): ISelectionZoneProps = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(js.Any.fromFunction0(componentRef))
    if (!js.isUndefined(disableAutoSelectOnInputElements)) __obj.updateDynamic("disableAutoSelectOnInputElements")(disableAutoSelectOnInputElements.asInstanceOf[js.Any])
    if (!js.isUndefined(enterModalOnTouch)) __obj.updateDynamic("enterModalOnTouch")(enterModalOnTouch.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelectedOnFocus)) __obj.updateDynamic("isSelectedOnFocus")(isSelectedOnFocus.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction3(onItemContextMenu))
    if (onItemInvoked != null) __obj.updateDynamic("onItemInvoked")(js.Any.fromFunction3(onItemInvoked))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionPreservedOnEmptyClick)) __obj.updateDynamic("selectionPreservedOnEmptyClick")(selectionPreservedOnEmptyClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionZoneProps]
  }
}

