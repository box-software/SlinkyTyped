package typingsSlinky.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAccountSettingsRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The Amazon Chime account settings to update.
    */
  var AccountSettings: typingsSlinky.awsDashSdk.clientsChimeMod.AccountSettings = js.native
}

object UpdateAccountSettingsRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, AccountSettings: AccountSettings): UpdateAccountSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], AccountSettings = AccountSettings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateAccountSettingsRequest]
  }
}

