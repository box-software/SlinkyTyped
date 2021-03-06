package typingsSlinky.chartmogulDashNode.chartmogulDashNodeMod.Metrics

import typingsSlinky.chartmogulDashNode.chartmogulDashNodeMod.Config
import typingsSlinky.chartmogulDashNode.commonMod.EntriesSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARPA extends js.Object {
  var arpa: Double
  var date: String
}

object ARPA {
  @scala.inline
  def apply(arpa: Double, date: String): ARPA = {
    val __obj = js.Dynamic.literal(arpa = arpa.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ARPA]
  }
}

@JSImport("chartmogul-node", "Metrics.arpa")
@js.native
object arpa extends js.Object {
  def apply(config: Config, params: Params): js.Promise[EntriesSummary[ARPA]] = js.native
}

