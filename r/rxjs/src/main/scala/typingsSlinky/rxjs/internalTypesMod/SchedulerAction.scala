package typingsSlinky.rxjs.internalTypesMod

import typingsSlinky.rxjs.internalSubscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerAction[T] extends Subscription {
  def schedule(): Subscription = js.native
  def schedule(state: T): Subscription = js.native
  def schedule(state: T, delay: Double): Subscription = js.native
}

