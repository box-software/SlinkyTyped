package typingsSlinky.nodeDashZopfli.nodeDashZopfliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashZopfli.nodeDashZopfliStrings.deflate
  - typings.nodeDashZopfli.nodeDashZopfliStrings.gzip
  - typings.nodeDashZopfli.nodeDashZopfliStrings.zlib
*/
trait Format extends js.Object

object Format {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deflate: typingsSlinky.nodeDashZopfli.nodeDashZopfliStrings.deflate = this.cast("deflate")
  @scala.inline
  def gzip: typingsSlinky.nodeDashZopfli.nodeDashZopfliStrings.gzip = this.cast("gzip")
  @scala.inline
  def zlib: typingsSlinky.nodeDashZopfli.nodeDashZopfliStrings.zlib = this.cast("zlib")
}

