package typingsSlinky.when.When

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred[T] extends js.Object {
  var promise: Promise[T] = js.native
  def notify(update: js.Any): Unit = js.native
  def reject(reason: js.Any): Unit = js.native
  def resolve(): Unit = js.native
  def resolve(value: T): Unit = js.native
  def resolve(value: Promise[T]): Unit = js.native
}

