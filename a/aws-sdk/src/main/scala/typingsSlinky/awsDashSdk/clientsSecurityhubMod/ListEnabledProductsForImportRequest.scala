package typingsSlinky.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEnabledProductsForImportRequest extends js.Object {
  /**
    * The maximum number of items that you want in the response.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsDashSdk.clientsSecurityhubMod.MaxResults] = js.native
  /**
    * Paginates results. On your first call to the ListEnabledProductsForImport operation, set the value of this parameter to NULL. For subsequent calls to the operation, fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsSecurityhubMod.NextToken] = js.native
}

object ListEnabledProductsForImportRequest {
  @scala.inline
  def apply(MaxResults: Int | scala.Double = null, NextToken: NextToken = null): ListEnabledProductsForImportRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnabledProductsForImportRequest]
  }
}

