package typingsSlinky.reactDashSelect.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSelect.srcStateManagerMod.StateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object StateManager
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashSelect.srcStateManagerMod.StateManager[js.Any, js.Any]
    ] {
  @JSImport("react-select/src/stateManager", "StateManager")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = StateProps[typingsSlinky.reactDashSelect.srcSelectMod.Props[js.Any]] with typingsSlinky.reactDashSelect.srcStateManagerMod.Props[js.Any] with typingsSlinky.reactDashSelect.srcSelectMod.Props[js.Any]
}

