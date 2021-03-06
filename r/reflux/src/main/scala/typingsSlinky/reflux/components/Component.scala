package typingsSlinky.reflux.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(P))) was not a @ScalaJSDefined trait */
object Component
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reflux.refluxMod.Component[js.Any, js.Any, js.Any]] {
  @JSImport("reflux", "Component")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

