package typingsSlinky.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteRequest extends js.Object {
  /**
    * A request to perform a DeleteItem operation.
    */
  var DeleteRequest: js.UndefOr[typingsSlinky.awsDashSdk.clientsDynamodbMod.DeleteRequest] = js.native
  /**
    * A request to perform a PutItem operation.
    */
  var PutRequest: js.UndefOr[typingsSlinky.awsDashSdk.clientsDynamodbMod.PutRequest] = js.native
}

object WriteRequest {
  @scala.inline
  def apply(DeleteRequest: DeleteRequest = null, PutRequest: PutRequest = null): WriteRequest = {
    val __obj = js.Dynamic.literal()
    if (DeleteRequest != null) __obj.updateDynamic("DeleteRequest")(DeleteRequest.asInstanceOf[js.Any])
    if (PutRequest != null) __obj.updateDynamic("PutRequest")(PutRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteRequest]
  }
}

