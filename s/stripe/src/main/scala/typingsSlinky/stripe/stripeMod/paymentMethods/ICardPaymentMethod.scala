package typingsSlinky.stripe.stripeMod.paymentMethods

import typingsSlinky.stripe.Anon_AddressEmail
import typingsSlinky.stripe.Anon_BrandChecks
import typingsSlinky.stripe.stripeMod.IMetadata
import typingsSlinky.stripe.stripeMod.customers.ICustomer
import typingsSlinky.stripe.stripeStrings.card
import typingsSlinky.stripe.stripeStrings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardPaymentMethod
  extends IBasePaymentMethod
     with IPaymentMethod {
  var card: Anon_BrandChecks
  var `type`: card
}

object ICardPaymentMethod {
  @scala.inline
  def apply(
    card: Anon_BrandChecks,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card,
    billing_details: Anon_AddressEmail = null,
    customer: String | ICustomer = null
  ): ICardPaymentMethod = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPaymentMethod]
  }
}

