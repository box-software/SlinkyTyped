package typingsSlinky.tablesorter.parsingParserTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tablesorter.tablesorterStrings.text
  - typings.tablesorter.tablesorterStrings.numeric
*/
trait ParserType extends js.Object

object ParserType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def numeric: typingsSlinky.tablesorter.tablesorterStrings.numeric = this.cast("numeric")
  @scala.inline
  def text: typingsSlinky.tablesorter.tablesorterStrings.text = this.cast("text")
}

