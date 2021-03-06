package typingsSlinky.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProtectedResourcesInput extends js.Object {
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsDashSdk.clientsBackupMod.MaxResults] = js.native
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListProtectedResourcesInput {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: String = null): ListProtectedResourcesInput = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProtectedResourcesInput]
  }
}

