package typingsSlinky.atOnfleetNodeDashOnfleet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Organization extends js.Object {
  var organization: String
  var `type`: String
}

object Anon_Organization {
  @scala.inline
  def apply(organization: String, `type`: String): Anon_Organization = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Organization]
  }
}

