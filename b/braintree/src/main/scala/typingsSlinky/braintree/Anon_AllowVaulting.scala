package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowVaulting extends js.Object {
  var allowVaulting: js.UndefOr[Boolean] = js.undefined
  var includeBillingPostalCode: js.UndefOr[Boolean] = js.undefined
  var revokeAfter: js.UndefOr[js.Date] = js.undefined
}

object Anon_AllowVaulting {
  @scala.inline
  def apply(
    allowVaulting: js.UndefOr[Boolean] = js.undefined,
    includeBillingPostalCode: js.UndefOr[Boolean] = js.undefined,
    revokeAfter: js.Date = null
  ): Anon_AllowVaulting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowVaulting)) __obj.updateDynamic("allowVaulting")(allowVaulting.asInstanceOf[js.Any])
    if (!js.isUndefined(includeBillingPostalCode)) __obj.updateDynamic("includeBillingPostalCode")(includeBillingPostalCode.asInstanceOf[js.Any])
    if (revokeAfter != null) __obj.updateDynamic("revokeAfter")(revokeAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowVaulting]
  }
}

