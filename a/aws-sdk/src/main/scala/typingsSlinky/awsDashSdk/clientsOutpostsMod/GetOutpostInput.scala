package typingsSlinky.awsDashSdk.clientsOutpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOutpostInput extends js.Object {
  var OutpostId: typingsSlinky.awsDashSdk.clientsOutpostsMod.OutpostId = js.native
}

object GetOutpostInput {
  @scala.inline
  def apply(OutpostId: OutpostId): GetOutpostInput = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetOutpostInput]
  }
}

