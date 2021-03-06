package typingsSlinky.qDashRetry.qDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var longStackSupport: Boolean = js.native
  var onerror: js.Function1[/* reason */ js.Any, Unit] = js.native
  /**
    * Calling with nothing at all creates a void promise
    */
  def apply(): typingsSlinky.q.qMod.Promise[Unit] = js.native
  def apply[T](promise: T): typingsSlinky.q.qMod.Promise[T] = js.native
  /**
    * If value is a Q promise, returns the promise.
    * If value is a promise from another library it is coerced into a Q promise (where possible).
    * If value is not a promise, returns a promise that is fulfilled with value.
    */
  def apply[T](promise: js.Thenable[T]): typingsSlinky.q.qMod.Promise[T] = js.native
}

