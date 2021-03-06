package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.success
  - typings.std.stdStrings.fail
  - typings.std.stdStrings.unknown
*/
trait PaymentComplete extends js.Object

object PaymentComplete {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fail: typingsSlinky.std.stdStrings.fail = this.cast("fail")
  @scala.inline
  def success: typingsSlinky.std.stdStrings.success = this.cast("success")
  @scala.inline
  def unknown: typingsSlinky.std.stdStrings.unknown = this.cast("unknown")
}

