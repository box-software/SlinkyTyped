package typingsSlinky.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationRequest extends js.Object {
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typingsSlinky.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName = js.native
}

object DeleteApplicationRequest {
  @scala.inline
  def apply(ResourceGroupName: ResourceGroupName): DeleteApplicationRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteApplicationRequest]
  }
}

