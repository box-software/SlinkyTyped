package typingsSlinky.dropboxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RememberUser extends js.Object {
  var rememberUser: Boolean
  var scope: String
}

object Anon_RememberUser {
  @scala.inline
  def apply(rememberUser: Boolean, scope: String): Anon_RememberUser = {
    val __obj = js.Dynamic.literal(rememberUser = rememberUser.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RememberUser]
  }
}

