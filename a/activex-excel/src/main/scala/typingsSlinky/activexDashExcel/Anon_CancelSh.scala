package typingsSlinky.activexDashExcel

import typingsSlinky.activexDashExcel.Excel.Range
import typingsSlinky.activexDashExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CancelSh extends js.Object {
  var Cancel: Boolean = js.native
  val Sh: Worksheet = js.native
  @JSName("Target")
  val Target_Original: Range = js.native
  def Target(Address: String): Range = js.native
  def Target(RowIndex: Double): Range = js.native
  def Target(RowIndex: Double, ColumnIndex: Double): Range = js.native
}

