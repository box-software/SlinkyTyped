package typingsSlinky.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApiMappingsResponse extends js.Object {
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[__listOfApiMapping] = js.native
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsApigatewayv2Mod.NextToken] = js.native
}

object GetApiMappingsResponse {
  @scala.inline
  def apply(Items: __listOfApiMapping = null, NextToken: NextToken = null): GetApiMappingsResponse = {
    val __obj = js.Dynamic.literal()
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiMappingsResponse]
  }
}

