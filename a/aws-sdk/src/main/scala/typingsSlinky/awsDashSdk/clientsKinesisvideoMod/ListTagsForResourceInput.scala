package typingsSlinky.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceInput extends js.Object {
  /**
    * If you specify this parameter and the result of a ListTagsForResource call is truncated, the response includes a token that you can use in the next request to fetch the next batch of tags. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsKinesisvideoMod.NextToken] = js.native
  /**
    * The ARN of the signaling channel for which you want to list tags.
    */
  var ResourceARN: typingsSlinky.awsDashSdk.clientsKinesisvideoMod.ResourceARN = js.native
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, NextToken: NextToken = null): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

