package typingsSlinky.stripe

import typingsSlinky.stripe.stripeStrings.active
import typingsSlinky.stripe.stripeStrings.inactive
import typingsSlinky.stripe.stripeStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  /**
    * The status of the card payments capability of the account, or whether
    * the account can directly process credit and debit card charges.
    */
  var card_payments: js.UndefOr[active | inactive | pending] = js.undefined
  /**
    * The status of the legacy payments capability of the account.
    */
  var legacy_payments: js.UndefOr[active | inactive | pending] = js.undefined
  /**
    * The status of the transfers capability of the account, or whether your
    * platform can transfer funds to the account.
    */
  var transfers: js.UndefOr[active | inactive | pending] = js.undefined
}

object Anon_Active {
  @scala.inline
  def apply(
    card_payments: active | inactive | pending = null,
    legacy_payments: active | inactive | pending = null,
    transfers: active | inactive | pending = null
  ): Anon_Active = {
    val __obj = js.Dynamic.literal()
    if (card_payments != null) __obj.updateDynamic("card_payments")(card_payments.asInstanceOf[js.Any])
    if (legacy_payments != null) __obj.updateDynamic("legacy_payments")(legacy_payments.asInstanceOf[js.Any])
    if (transfers != null) __obj.updateDynamic("transfers")(transfers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Active]
  }
}

