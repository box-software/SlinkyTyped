package typingsSlinky.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGeoMatchSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the UpdateGeoMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsWafMod.ChangeToken] = js.native
}

object UpdateGeoMatchSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null): UpdateGeoMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGeoMatchSetResponse]
  }
}

