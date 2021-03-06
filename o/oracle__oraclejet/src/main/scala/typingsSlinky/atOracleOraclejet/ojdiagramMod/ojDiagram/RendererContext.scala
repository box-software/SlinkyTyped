package typingsSlinky.atOracleOraclejet.ojdiagramMod.ojDiagram

import org.scalajs.dom.raw.Element
import typingsSlinky.atOracleOraclejet.Anon_Element
import typingsSlinky.atOracleOraclejet.Anon_Expanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RendererContext[K1, D1] extends js.Object {
  var componentElement: Element
  var content: Anon_Element
  var data: js.Object
  var id: K1
  var itemData: D1
  var parentElement: Element
  var previousState: Anon_Expanded
  var state: Anon_Expanded
  var `type`: String
  def renderDefaultFocus(): Unit
  def renderDefaultHover(): Unit
  def renderDefaultSelection(): Unit
}

object RendererContext {
  @scala.inline
  def apply[K1, D1](
    componentElement: Element,
    content: Anon_Element,
    data: js.Object,
    id: K1,
    itemData: D1,
    parentElement: Element,
    previousState: Anon_Expanded,
    renderDefaultFocus: () => Unit,
    renderDefaultHover: () => Unit,
    renderDefaultSelection: () => Unit,
    state: Anon_Expanded,
    `type`: String
  ): RendererContext[K1, D1] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any], renderDefaultFocus = js.Any.fromFunction0(renderDefaultFocus), renderDefaultHover = js.Any.fromFunction0(renderDefaultHover), renderDefaultSelection = js.Any.fromFunction0(renderDefaultSelection), state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererContext[K1, D1]]
  }
}

