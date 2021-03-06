package typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation

import typingsSlinky.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payment
  extends BaseOperation[typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.Payment] {
  var amount: String
  var asset: Asset
  var destination: String
}

object Payment {
  @scala.inline
  def apply(
    amount: String,
    asset: Asset,
    destination: String,
    `type`: typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.Payment,
    source: String = null
  ): Payment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payment]
  }
}

@JSImport("stellar-base", "Operation.payment")
@js.native
object payment extends js.Object {
  def apply(options: typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.Payment): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[Payment] = js.native
}

