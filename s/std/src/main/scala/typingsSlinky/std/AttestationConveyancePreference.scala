package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.none
  - typings.std.stdStrings.indirect
  - typings.std.stdStrings.direct
*/
trait AttestationConveyancePreference extends js.Object

object AttestationConveyancePreference {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def direct: typingsSlinky.std.stdStrings.direct = this.cast("direct")
  @scala.inline
  def indirect: typingsSlinky.std.stdStrings.indirect = this.cast("indirect")
  @scala.inline
  def none: typingsSlinky.std.stdStrings.none = this.cast("none")
}

