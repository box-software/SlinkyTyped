package typingsSlinky.activexDashExcel.Excel

import typingsSlinky.activexDashOffice.Office.MsoCalloutAngleType
import typingsSlinky.activexDashOffice.Office.MsoCalloutDropType
import typingsSlinky.activexDashOffice.Office.MsoCalloutType
import typingsSlinky.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.CalloutFormat")
@js.native
class CalloutFormat protected () extends js.Object {
  var Accent: MsoTriState = js.native
  var Angle: MsoCalloutAngleType = js.native
  val Application: js.Any = js.native
  var AutoAttach: MsoTriState = js.native
  val AutoLength: MsoTriState = js.native
  var Border: MsoTriState = js.native
  val Creator: Double = js.native
  val Drop: Double = js.native
  val DropType: MsoCalloutDropType = js.native
  @JSName("Excel.CalloutFormat_typekey")
  var ExcelDotCalloutFormat_typekey: CalloutFormat = js.native
  var Gap: Double = js.native
  val Length: Double = js.native
  val Parent: js.Any = js.native
  var Type: MsoCalloutType = js.native
  def AutomaticLength(): Unit = js.native
  def CustomDrop(Drop: Double): Unit = js.native
  def CustomLength(Length: Double): Unit = js.native
  def PresetDrop(DropType: MsoCalloutDropType): Unit = js.native
}

