package typingsSlinky.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIntegrationResponsesRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * The integration ID.
    */
  var IntegrationId: __string = js.native
  /**
    * The maximum number of elements to be returned for this resource.
    */
  var MaxResults: js.UndefOr[__string] = js.native
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object GetIntegrationResponsesRequest {
  @scala.inline
  def apply(ApiId: __string, IntegrationId: __string, MaxResults: __string = null, NextToken: __string = null): GetIntegrationResponsesRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], IntegrationId = IntegrationId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntegrationResponsesRequest]
  }
}

