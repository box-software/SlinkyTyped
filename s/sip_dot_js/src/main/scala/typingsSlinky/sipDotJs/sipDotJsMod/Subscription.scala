package typingsSlinky.sipDotJs.sipDotJsMod

import typingsSlinky.sipDotJs.libSubscriptionMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Subscription")
@js.native
class Subscription protected ()
  extends typingsSlinky.sipDotJs.libSubscriptionMod.Subscription {
  /**
    * Constructor.
    * @param ua User agent.
    * @param target Subscription target.
    * @param event Subscription event.
    * @param options Options bucket.
    */
  def this(ua: typingsSlinky.sipDotJs.libUAMod.UA, target: String, event: String) = this()
  def this(
    ua: typingsSlinky.sipDotJs.libUAMod.UA,
    target: typingsSlinky.sipDotJs.libCoreMod.URI,
    event: String
  ) = this()
  def this(
    ua: typingsSlinky.sipDotJs.libUAMod.UA,
    target: String,
    event: String,
    options: SubscriptionOptions
  ) = this()
  def this(
    ua: typingsSlinky.sipDotJs.libUAMod.UA,
    target: typingsSlinky.sipDotJs.libCoreMod.URI,
    event: String,
    options: SubscriptionOptions
  ) = this()
}

