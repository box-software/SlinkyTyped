package typingsSlinky.meteorDashPrime8consultingDashOauth2.OAuth2Server

import typingsSlinky.meteor.Meteor.SubscriptionHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeTo extends js.Object {
  /**
    * Wrapper function to subscribe to the auth code subscription. Returns a standard subscription handle.
    */
  def authCode(): SubscriptionHandle
}

object SubscribeTo {
  @scala.inline
  def apply(authCode: () => SubscriptionHandle): SubscribeTo = {
    val __obj = js.Dynamic.literal(authCode = js.Any.fromFunction0(authCode))
  
    __obj.asInstanceOf[SubscribeTo]
  }
}

