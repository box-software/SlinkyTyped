package typingsSlinky.meteor.meteorMeteorMod.Meteor

import typingsSlinky.meteor.Anon_LoginStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", "Meteor.loginWith")
@js.native
object loginWith extends js.Object {
  def apply[ExternalService](): Unit = js.native
  def apply[ExternalService](options: Anon_LoginStyle): Unit = js.native
  def apply[ExternalService](
    options: Anon_LoginStyle,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = js.native
}

