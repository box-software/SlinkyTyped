package typingsSlinky.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemasResponse extends js.Object {
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[__string] = js.native
  /**
    * An array of schema summaries.
    */
  var Schemas: js.UndefOr[__listOfSchemaSummary] = js.native
}

object ListSchemasResponse {
  @scala.inline
  def apply(NextToken: __string = null, Schemas: __listOfSchemaSummary = null): ListSchemasResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Schemas != null) __obj.updateDynamic("Schemas")(Schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemasResponse]
  }
}

