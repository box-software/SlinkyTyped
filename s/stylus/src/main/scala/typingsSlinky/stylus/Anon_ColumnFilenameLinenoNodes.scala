package typingsSlinky.stylus

import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoNodes extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var nodes: js.Array[Node]
  var scope: Boolean
}

object Anon_ColumnFilenameLinenoNodes {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    nodes: js.Array[Node],
    scope: Boolean
  ): Anon_ColumnFilenameLinenoNodes = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoNodes]
  }
}

