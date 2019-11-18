package typingsSlinky.expo.buildARMod

import typingsSlinky.reactDashNative.reactDashNativeMod.EmitterSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/AR", "onSessionWasInterrupted")
@js.native
object onSessionWasInterrupted extends js.Object {
  def apply(listener: js.Function1[/* event */ SessionWasInterruptedEvent, Unit]): EmitterSubscription = js.native
}

