package typingsSlinky.zchatDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Department extends js.Object {
  var department: js.UndefOr[Double] = js.undefined
  var email: String
  var message: String
  var name: String
  var phone: js.UndefOr[String] = js.undefined
}

object Anon_Department {
  @scala.inline
  def apply(
    email: String,
    message: String,
    name: String,
    department: Int | Double = null,
    phone: String = null
  ): Anon_Department = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (department != null) __obj.updateDynamic("department")(department.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Department]
  }
}

