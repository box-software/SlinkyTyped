package typingsSlinky.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Auto-forwarding settings for an account.
  */
@js.native
trait Schema$AutoForwarding extends js.Object {
  /**
    * The state that a message should be left in after it has been forwarded.
    */
  var disposition: js.UndefOr[String] = js.native
  /**
    * Email address to which all incoming messages are forwarded. This email
    * address must be a verified member of the forwarding addresses.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Whether all incoming mail is automatically forwarded to another address.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object Schema$AutoForwarding {
  @scala.inline
  def apply(
    disposition: String = null,
    emailAddress: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): Schema$AutoForwarding = {
    val __obj = js.Dynamic.literal()
    if (disposition != null) __obj.updateDynamic("disposition")(disposition.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AutoForwarding]
  }
}

