package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.microsoftDashAjax.Sys.UI.DomEvent
import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.SingleCellClick")
@js.native
class SingleCellClick protected () extends IEventArgs {
  def this(eventInfo: DomEvent, recordKey: Double, fieldKey: String) = this()
  var eventInfo: DomEvent = js.native
  var fieldKey: String = js.native
  var recordKey: Double = js.native
}

