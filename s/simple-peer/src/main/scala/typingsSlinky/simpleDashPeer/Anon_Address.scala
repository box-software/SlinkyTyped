package typingsSlinky.simpleDashPeer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: String
  var family: String
  var port: String
}

object Anon_Address {
  @scala.inline
  def apply(address: String, family: String, port: String): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Address]
  }
}

