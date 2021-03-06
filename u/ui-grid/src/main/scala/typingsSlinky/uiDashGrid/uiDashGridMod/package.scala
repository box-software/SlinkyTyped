package typingsSlinky.uiDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uiDashGridMod {
  import typingsSlinky.angular.JQueryMouseEventObject
  import typingsSlinky.angular.angularMod.IScope

  type ICellClassGetter[TEntity] = js.Function5[
    /* grid */ js.UndefOr[IGridInstanceOf[TEntity]], 
    /* gridRow */ js.UndefOr[IGridRowOf[TEntity]], 
    /* gridCol */ js.UndefOr[IGridColumnOf[TEntity]], 
    /* rowRenderIndex */ js.UndefOr[Double], 
    /* colRenderIndex */ js.UndefOr[Double], 
    String
  ]
  type ICellTooltipGetter[TEntity] = js.Function2[/* gridRow */ IGridRowOf[TEntity], /* gridCol */ IGridColumnOf[TEntity], String]
  type IColumnBuilder[TEntity] = js.Function3[
    /* colDef */ IColumnDefOf[TEntity], 
    /* col */ IGridColumnOf[TEntity], 
    /* gridOptions */ IGridOptionsOf[TEntity], 
    Unit
  ]
  type IColumnDef = IColumnDefOf[js.Any]
  type IColumnProcessor[TEntity] = js.Function2[
    /* renderedColumnsToProcess */ js.Array[IGridColumnOf[TEntity]], 
    /* rows */ js.Array[IGridRowOf[TEntity]], 
    js.Array[IGridColumnOf[TEntity]]
  ]
  type IGridApi = IGridApiOf[js.Any]
  type IGridColumn = IGridColumnOf[js.Any]
  type IGridInstance = IGridInstanceOf[js.Any]
  type IGridOptions = IGridOptionsOf[js.Any]
  type IGridRow = IGridRowOf[js.Any]
  type IHeaderFooterCellClassGetter[TEntity] = js.Function5[
    /* grid */ IGridInstanceOf[TEntity], 
    /* gridRow */ IGridRowOf[TEntity], 
    /* gridCol */ IGridColumnOf[TEntity], 
    /* rowRenderIndex */ Double, 
    /* colRenderIndex */ Double, 
    String
  ]
  type IHeaderTooltipGetter[TEntity] = js.Function1[/* gridCol */ IGridColumnOf[TEntity], String]
  type IRowBuilder[TEntity] = js.Function2[/* row */ IGridRowOf[TEntity], /* gridOptions */ IGridOptionsOf[TEntity], Unit]
  type IRowProcessor[TEntity] = js.Function2[
    /* renderedRowsToProcess */ js.Array[IGridRowOf[TEntity]], 
    /* columns */ js.Array[IGridColumnOf[TEntity]], 
    js.Array[IGridRowOf[TEntity]]
  ]
  type IStyleComputation = js.Function1[/* $scope */ IScope, String]
  type canvasHeightChangedHandler = js.Function2[/* oldHeight */ Double, /* newHeight */ Double, Unit]
  type columnVisibilityChangedHandler[TEntity] = js.Function1[/* column */ IGridColumnOf[TEntity], Unit]
  type filterChangedHandler[TEntity] = js.Function1[/* gridApi */ IGridApiOf[TEntity], Unit]
  type rowsRenderedHandler[TEntity] = js.Function1[/* gridApi */ IGridApiOf[TEntity], Unit]
  type rowsVisibleChangedHandler[TEntity] = js.Function1[/* gridApi */ IGridApiOf[TEntity], Unit]
  type scrollBeginHandler = js.Function1[/* scrollEvent */ JQueryMouseEventObject, Unit]
  type scrollEndHandler = js.Function1[/* scrollEvent */ JQueryMouseEventObject, Unit]
  type sortChangedHandler[TEntity] = js.Function2[
    /* grid */ IGridInstanceOf[TEntity], 
    /* columns */ js.Array[IGridColumnOf[TEntity]], 
    Unit
  ]
}
