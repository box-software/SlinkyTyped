package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.ltr
  - typings.std.stdStrings.rtl
  - typings.std.stdStrings.inherit
*/
trait CanvasDirection extends js.Object

object CanvasDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inherit: typingsSlinky.std.stdStrings.inherit = this.cast("inherit")
  @scala.inline
  def ltr: typingsSlinky.std.stdStrings.ltr = this.cast("ltr")
  @scala.inline
  def rtl: typingsSlinky.std.stdStrings.rtl = this.cast("rtl")
}

