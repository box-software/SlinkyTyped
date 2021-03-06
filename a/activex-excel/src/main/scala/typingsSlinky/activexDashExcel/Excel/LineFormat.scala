package typingsSlinky.activexDashExcel.Excel

import typingsSlinky.activexDashOffice.Office.MsoArrowheadLength
import typingsSlinky.activexDashOffice.Office.MsoArrowheadStyle
import typingsSlinky.activexDashOffice.Office.MsoArrowheadWidth
import typingsSlinky.activexDashOffice.Office.MsoLineDashStyle
import typingsSlinky.activexDashOffice.Office.MsoLineStyle
import typingsSlinky.activexDashOffice.Office.MsoPatternType
import typingsSlinky.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.LineFormat")
@js.native
class LineFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var BackColor: ColorFormat = js.native
  var BeginArrowheadLength: MsoArrowheadLength = js.native
  var BeginArrowheadStyle: MsoArrowheadStyle = js.native
  var BeginArrowheadWidth: MsoArrowheadWidth = js.native
  val Creator: Double = js.native
  var DashStyle: MsoLineDashStyle = js.native
  var EndArrowheadLength: MsoArrowheadLength = js.native
  var EndArrowheadStyle: MsoArrowheadStyle = js.native
  var EndArrowheadWidth: MsoArrowheadWidth = js.native
  @JSName("Excel.LineFormat_typekey")
  var ExcelDotLineFormat_typekey: LineFormat = js.native
  var ForeColor: ColorFormat = js.native
  var InsetPen: MsoTriState = js.native
  val Parent: js.Any = js.native
  var Pattern: MsoPatternType = js.native
  var Style: MsoLineStyle = js.native
  var Transparency: Double = js.native
  var Visible: MsoTriState = js.native
  var Weight: Double = js.native
}

