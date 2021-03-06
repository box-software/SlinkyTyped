package typingsSlinky.hasha.hashaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hasha.hashaStrings.buffer
  - typings.hasha.hashaStrings.hex
  - typings.hasha.hashaStrings.base64
  - typings.hasha.hashaStrings.latin1
*/
trait HashaEncoding extends js.Object

object HashaEncoding {
  @scala.inline
  def base64: typingsSlinky.hasha.hashaStrings.base64 = this.cast("base64")
  @scala.inline
  def buffer: typingsSlinky.hasha.hashaStrings.buffer = this.cast("buffer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsSlinky.hasha.hashaStrings.hex = this.cast("hex")
  @scala.inline
  def latin1: typingsSlinky.hasha.hashaStrings.latin1 = this.cast("latin1")
}

