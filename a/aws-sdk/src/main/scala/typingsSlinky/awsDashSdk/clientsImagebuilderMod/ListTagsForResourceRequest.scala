package typingsSlinky.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the resource whose tags you wish to retrieve. 
    */
  var resourceArn: ImageBuilderArn = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(resourceArn: ImageBuilderArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

