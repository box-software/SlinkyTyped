package typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreWriteRequestMod

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreDeleteRequestMod._DeleteRequest
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscorePutRequestMod._PutRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _WriteRequest extends js.Object {
  /**
    * <p>A request to perform a <code>DeleteItem</code> operation.</p>
    */
  var DeleteRequest: js.UndefOr[_DeleteRequest] = js.undefined
  /**
    * <p>A request to perform a <code>PutItem</code> operation.</p>
    */
  var PutRequest: js.UndefOr[_PutRequest] = js.undefined
}

object _WriteRequest {
  @scala.inline
  def apply(DeleteRequest: _DeleteRequest = null, PutRequest: _PutRequest = null): _WriteRequest = {
    val __obj = js.Dynamic.literal()
    if (DeleteRequest != null) __obj.updateDynamic("DeleteRequest")(DeleteRequest.asInstanceOf[js.Any])
    if (PutRequest != null) __obj.updateDynamic("PutRequest")(PutRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[_WriteRequest]
  }
}

