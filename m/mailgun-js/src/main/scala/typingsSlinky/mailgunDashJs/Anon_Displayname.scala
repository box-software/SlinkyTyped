package typingsSlinky.mailgunDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Displayname extends js.Object {
  var display_name: String | Null
  var domain: String
  var local_part: String
}

object Anon_Displayname {
  @scala.inline
  def apply(domain: String, local_part: String, display_name: String = null): Anon_Displayname = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], local_part = local_part.asInstanceOf[js.Any])
    if (display_name != null) __obj.updateDynamic("display_name")(display_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Displayname]
  }
}

