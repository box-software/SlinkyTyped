package typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsFooterDotTypesMod

import typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.ISelection
import typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IColumn
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.ICellStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsItemProps
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsFooterProps extends IDetailsItemProps {
  /**
    * Column metadata
    */
  @JSName("columns")
  var columns_IDetailsFooterProps: js.Array[IColumn]
  /**
    * Selection mode
    */
  @JSName("selectionMode")
  var selectionMode_IDetailsFooterProps: SelectionMode
  /**
    * Selection from utilities
    */
  @JSName("selection")
  var selection_IDetailsFooterProps: ISelection
}

object IDetailsFooterProps {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    selection: ISelection,
    selectionMode: SelectionMode,
    cellStyleProps: ICellStyleProps = null,
    checkboxVisibility: CheckboxVisibility = null,
    groupNestingDepth: Int | Double = null,
    indentWidth: Int | Double = null,
    rowWidth: Int | Double = null,
    viewport: IViewport = null
  ): IDetailsFooterProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility.asInstanceOf[js.Any])
    if (groupNestingDepth != null) __obj.updateDynamic("groupNestingDepth")(groupNestingDepth.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (rowWidth != null) __obj.updateDynamic("rowWidth")(rowWidth.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsFooterProps]
  }
}

