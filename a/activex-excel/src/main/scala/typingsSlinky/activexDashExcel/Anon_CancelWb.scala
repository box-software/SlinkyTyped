package typingsSlinky.activexDashExcel

import typingsSlinky.activexDashExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelWb extends js.Object {
  var Cancel: Boolean
  val Wb: Workbook
}

object Anon_CancelWb {
  @scala.inline
  def apply(Cancel: Boolean, Wb: Workbook): Anon_CancelWb = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CancelWb]
  }
}

