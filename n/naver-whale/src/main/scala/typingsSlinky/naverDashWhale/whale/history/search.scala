package typingsSlinky.naverDashWhale.whale.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.history.search")
@js.native
object search extends js.Object {
  def apply(
    query: typingsSlinky.chrome.chrome.history.HistoryQuery,
    callback: js.Function1[/* results */ js.Array[typingsSlinky.chrome.chrome.history.HistoryItem], Unit]
  ): Unit = js.native
}

