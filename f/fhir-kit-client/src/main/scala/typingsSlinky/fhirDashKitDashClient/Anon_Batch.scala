package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.batch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Batch extends js.Object {
  var `type`: batch
}

object Anon_Batch {
  @scala.inline
  def apply(`type`: batch): Anon_Batch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Batch]
  }
}

