package typingsSlinky.rcDashTable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcDashTable.libInterfaceMod.CustomizeComponent
import typingsSlinky.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cell extends js.Object {
  var cell: js.UndefOr[CustomizeComponent[HTMLAttributes[HTMLElement]]] = js.undefined
  var row: js.UndefOr[CustomizeComponent[HTMLAttributes[HTMLElement]]] = js.undefined
  var wrapper: js.UndefOr[CustomizeComponent[HTMLAttributes[HTMLElement]]] = js.undefined
}

object Anon_Cell {
  @scala.inline
  def apply(
    cell: CustomizeComponent[HTMLAttributes[HTMLElement]] = null,
    row: CustomizeComponent[HTMLAttributes[HTMLElement]] = null,
    wrapper: CustomizeComponent[HTMLAttributes[HTMLElement]] = null
  ): Anon_Cell = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cell]
  }
}

