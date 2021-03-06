package typingsSlinky.convict.convictMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convict.convictStrings.strict
  - typings.convict.convictStrings.warn
*/
trait ValidationMethod extends js.Object

object ValidationMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def strict: typingsSlinky.convict.convictStrings.strict = this.cast("strict")
  @scala.inline
  def warn: typingsSlinky.convict.convictStrings.warn = this.cast("warn")
}

