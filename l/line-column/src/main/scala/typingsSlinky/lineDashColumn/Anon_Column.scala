package typingsSlinky.lineDashColumn

import typingsSlinky.lineDashColumn.lineDashColumnMod.LineColumnObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends LineColumnObject {
  var column: Double
  var line: Double
}

object Anon_Column {
  @scala.inline
  def apply(column: Double, line: Double): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Column]
  }
}

