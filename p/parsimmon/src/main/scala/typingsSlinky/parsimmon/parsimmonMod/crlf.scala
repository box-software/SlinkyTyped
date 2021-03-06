package typingsSlinky.parsimmon.parsimmonMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Equivalent to Parsimmon.string("\r\n").
	 *
	 * This parser checks for the "carriage return" character followed by the "line
	 * feed" character, which is used as the line terminator for Windows text files
	 * and HTTP headers.
	 */
@JSImport("parsimmon", "crlf")
@js.native
object crlf extends TopLevel[Parser[String]]

