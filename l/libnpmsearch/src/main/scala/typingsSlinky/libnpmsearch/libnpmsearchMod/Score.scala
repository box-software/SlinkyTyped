package typingsSlinky.libnpmsearch.libnpmsearchMod

import typingsSlinky.libnpmsearch.Anon_Maintenance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Score extends js.Object {
  var detail: Anon_Maintenance
  var `final`: Double
}

object Score {
  @scala.inline
  def apply(detail: Anon_Maintenance, `final`: Double): Score = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any])
    __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Score]
  }
}

