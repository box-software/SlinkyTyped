package typingsSlinky.screeps

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  var amount: Double
  var components: Record[DepositConstant | CommodityConstant | MineralConstant | RESOURCE_GHODIUM, Double]
  var cooldown: Double
}

object Anon_Amount {
  @scala.inline
  def apply(
    amount: Double,
    components: Record[DepositConstant | CommodityConstant | MineralConstant | RESOURCE_GHODIUM, Double],
    cooldown: Double
  ): Anon_Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Amount]
  }
}

