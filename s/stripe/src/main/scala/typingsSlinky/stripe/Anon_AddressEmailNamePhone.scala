package typingsSlinky.stripe

import typingsSlinky.stripe.stripeMod.IAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressEmailNamePhone extends js.Object {
  var address: js.UndefOr[IAddress | Null] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
}

object Anon_AddressEmailNamePhone {
  @scala.inline
  def apply(address: IAddress = null, email: String = null, name: String = null, phone: String = null): Anon_AddressEmailNamePhone = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddressEmailNamePhone]
  }
}

