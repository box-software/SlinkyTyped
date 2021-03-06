package typingsSlinky.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * Reserved for future use.
    */
  var Limit: js.UndefOr[typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.Limit] = js.native
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.native
  /**
    * Identifier (ID) of the directory for which you want to retrieve tags.
    */
  var ResourceId: typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.ResourceId = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, Limit: Int | Double = null, NextToken: NextToken = null): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

