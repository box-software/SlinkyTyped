package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PasswordUsername extends js.Object {
  var password: js.UndefOr[String] = js.undefined
  var username: String
}

object Anon_PasswordUsername {
  @scala.inline
  def apply(username: String, password: String = null): Anon_PasswordUsername = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PasswordUsername]
  }
}

