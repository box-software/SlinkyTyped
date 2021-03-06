package typingsSlinky.sipDotJs.libApiSubscriptionDashOptionsMod

import typingsSlinky.sipDotJs.libApiSubscriptionDashDelegateMod.SubscriptionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionOptions extends js.Object {
  var delegate: js.UndefOr[SubscriptionDelegate] = js.undefined
}

object SubscriptionOptions {
  @scala.inline
  def apply(delegate: SubscriptionDelegate = null): SubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

