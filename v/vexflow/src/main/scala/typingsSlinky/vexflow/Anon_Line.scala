package typingsSlinky.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Line extends js.Object {
  var line: Double
  var `type`: String
}

object Anon_Line {
  @scala.inline
  def apply(line: Double, `type`: String): Anon_Line = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Line]
  }
}

