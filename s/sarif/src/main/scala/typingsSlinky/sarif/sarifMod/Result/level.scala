package typingsSlinky.sarif.sarifMod.Result

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sarif.sarifStrings.none
  - typings.sarif.sarifStrings.note
  - typings.sarif.sarifStrings.warning
  - typings.sarif.sarifStrings.error
*/
trait level extends js.Object

object level {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.sarif.sarifStrings.error = this.cast("error")
  @scala.inline
  def none: typingsSlinky.sarif.sarifStrings.none = this.cast("none")
  @scala.inline
  def note: typingsSlinky.sarif.sarifStrings.note = this.cast("note")
  @scala.inline
  def warning: typingsSlinky.sarif.sarifStrings.warning = this.cast("warning")
}

