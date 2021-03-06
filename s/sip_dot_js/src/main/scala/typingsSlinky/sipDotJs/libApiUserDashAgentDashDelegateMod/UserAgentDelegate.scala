package typingsSlinky.sipDotJs.libApiUserDashAgentDashDelegateMod

import typingsSlinky.sipDotJs.libApiInvitationMod.Invitation
import typingsSlinky.sipDotJs.libApiMessageMod.Message
import typingsSlinky.sipDotJs.libApiNotificationMod.Notification
import typingsSlinky.sipDotJs.libApiReferralMod.Referral
import typingsSlinky.sipDotJs.libApiSubscriptionMod.Subscription
import typingsSlinky.sipDotJs.libCoreMessagesMethodsRegisterMod.IncomingRegisterRequest
import typingsSlinky.sipDotJs.libCoreMessagesMethodsSubscribeMod.IncomingSubscribeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentDelegate extends js.Object {
  /**
    * Called upon transport transitioning to connected state.
    */
  var onConnect: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called upon transport transitioning from connected state.
    * @param error - An error if disconnect triggered by transport. Otherwise undefined.
    */
  var onDisconnect: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Error], Unit]] = js.undefined
  /**
    * Called upon receipt of an invitation.
    * @remarks
    * Handler for incoming out of dialog INVITE requests.
    * @param invitation - The invitation.
    */
  var onInvite: js.UndefOr[js.Function1[/* invitation */ Invitation, Unit]] = js.undefined
  /**
    * Called upon receipt of a message.
    * @remarks
    * Handler for incoming out of dialog MESSAGE requests.
    * @param message - The message.
    */
  var onMessage: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.undefined
  /**
    * Called upon receipt of a notification.
    * @remarks
    * Handler for incoming out of dialog NOTIFY requests.
    * @param notification - The notification.
    */
  var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.undefined
  /**
    * Called upon receipt of a referral.
    * @remarks
    * Handler for incoming out of dialog REFER requests.
    * @param referral - The referral.
    */
  var onRefer: js.UndefOr[js.Function1[/* referral */ Referral, Unit]] = js.undefined
  /**
    * @internal
    * Called upon receipt of a registration request. Used by test suite.
    * @param request - The request.
    */
  var onRegisterRequest: js.UndefOr[js.Function1[/* request */ IncomingRegisterRequest, Unit]] = js.undefined
  /**
    * Called upon receipt of a subscription.
    * @remarks
    * Handler for incoming out of dialog SUBSCRIBE requests.
    * @param subscription - The subscription.
    */
  var onSubscribe: js.UndefOr[js.Function1[/* subscription */ Subscription, Unit]] = js.undefined
  /**
    * @internal
    * Called upon receipt of a subscription request. Used by test suite.
    * @param request - The request.
    */
  var onSubscribeRequest: js.UndefOr[js.Function1[/* request */ IncomingSubscribeRequest, Unit]] = js.undefined
}

object UserAgentDelegate {
  @scala.inline
  def apply(
    onConnect: () => Unit = null,
    onDisconnect: /* error */ js.UndefOr[js.Error] => Unit = null,
    onInvite: /* invitation */ Invitation => Unit = null,
    onMessage: /* message */ Message => Unit = null,
    onNotify: /* notification */ Notification => Unit = null,
    onRefer: /* referral */ Referral => Unit = null,
    onRegisterRequest: /* request */ IncomingRegisterRequest => Unit = null,
    onSubscribe: /* subscription */ Subscription => Unit = null,
    onSubscribeRequest: /* request */ IncomingSubscribeRequest => Unit = null
  ): UserAgentDelegate = {
    val __obj = js.Dynamic.literal()
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction0(onConnect))
    if (onDisconnect != null) __obj.updateDynamic("onDisconnect")(js.Any.fromFunction1(onDisconnect))
    if (onInvite != null) __obj.updateDynamic("onInvite")(js.Any.fromFunction1(onInvite))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction1(onNotify))
    if (onRefer != null) __obj.updateDynamic("onRefer")(js.Any.fromFunction1(onRefer))
    if (onRegisterRequest != null) __obj.updateDynamic("onRegisterRequest")(js.Any.fromFunction1(onRegisterRequest))
    if (onSubscribe != null) __obj.updateDynamic("onSubscribe")(js.Any.fromFunction1(onSubscribe))
    if (onSubscribeRequest != null) __obj.updateDynamic("onSubscribeRequest")(js.Any.fromFunction1(onSubscribeRequest))
    __obj.asInstanceOf[UserAgentDelegate]
  }
}

