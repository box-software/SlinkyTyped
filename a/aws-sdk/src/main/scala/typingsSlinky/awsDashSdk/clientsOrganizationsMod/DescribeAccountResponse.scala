package typingsSlinky.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountResponse extends js.Object {
  /**
    * A structure that contains information about the requested account.
    */
  var Account: js.UndefOr[typingsSlinky.awsDashSdk.clientsOrganizationsMod.Account] = js.native
}

object DescribeAccountResponse {
  @scala.inline
  def apply(Account: Account = null): DescribeAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountResponse]
  }
}

