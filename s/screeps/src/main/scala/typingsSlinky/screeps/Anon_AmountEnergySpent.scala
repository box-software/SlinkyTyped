package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountEnergySpent extends js.Object {
  var amount: Double
  var energySpent: Double
  var targetId: String
}

object Anon_AmountEnergySpent {
  @scala.inline
  def apply(amount: Double, energySpent: Double, targetId: String): Anon_AmountEnergySpent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], energySpent = energySpent.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AmountEnergySpent]
  }
}

