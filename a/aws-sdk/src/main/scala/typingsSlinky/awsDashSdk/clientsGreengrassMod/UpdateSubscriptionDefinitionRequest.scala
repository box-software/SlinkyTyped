package typingsSlinky.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSubscriptionDefinitionRequest extends js.Object {
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[__string] = js.native
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: __string = js.native
}

object UpdateSubscriptionDefinitionRequest {
  @scala.inline
  def apply(SubscriptionDefinitionId: __string, Name: __string = null): UpdateSubscriptionDefinitionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubscriptionDefinitionRequest]
  }
}

