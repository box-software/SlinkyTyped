package typingsSlinky.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.SlicerCacheLevel")
@js.native
class SlicerCacheLevel protected () extends js.Object {
  val Application: typingsSlinky.activexDashExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  var CrossFilterType: XlSlicerCrossFilterType = js.native
  @JSName("Excel.SlicerCacheLevel_typekey")
  var ExcelDotSlicerCacheLevel_typekey: SlicerCacheLevel = js.native
  val Name: String = js.native
  val Ordinal: Double = js.native
  val Parent: js.Any = js.native
  @JSName("SlicerItems")
  val SlicerItems_Original: SlicerItems = js.native
  var SortItems: XlSlicerSort = js.native
  val VisibleSlicerItemsList: js.Any = js.native
  def SlicerItems(Index: String): SlicerItem = js.native
  def SlicerItems(Index: Double): SlicerItem = js.native
}

