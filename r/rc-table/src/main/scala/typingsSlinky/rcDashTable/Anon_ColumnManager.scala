package typingsSlinky.rcDashTable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcDashTable.libColumnManagerMod.default
import typingsSlinky.rcDashTable.libTableMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnManager[ValueType] extends js.Object {
  var columnManager: default
  var components: js.Any
  var props: TableProps[ValueType] with Anon_ChildrenReactNode
  def saveRef(name: String): js.Function1[/* node */ HTMLElement, Unit]
}

object Anon_ColumnManager {
  @scala.inline
  def apply[ValueType](
    columnManager: default,
    components: js.Any,
    props: TableProps[ValueType] with Anon_ChildrenReactNode,
    saveRef: String => js.Function1[/* node */ HTMLElement, Unit]
  ): Anon_ColumnManager[ValueType] = {
    val __obj = js.Dynamic.literal(columnManager = columnManager.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], saveRef = js.Any.fromFunction1(saveRef))
  
    __obj.asInstanceOf[Anon_ColumnManager[ValueType]]
  }
}

