package typingsSlinky.gapiDotPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  /**
    * List of arguments for the format string.
    */
  var args: js.Array[Anon_Type]
  /**
    * A localized format string with $N placeholders, where N is the 1-indexed argument number.
    */
  var format: String
}

object Anon_Args {
  @scala.inline
  def apply(args: js.Array[Anon_Type], format: String): Anon_Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Args]
  }
}

