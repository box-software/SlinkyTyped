package typingsSlinky.reactDashSelect.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSelect.asyncMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashSelect), Name(srcAsyncMod), Name(Props))) was not a @ScalaJSDefined trait */
object Async
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-select/async", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = typingsSlinky.reactDashSelect.srcAsyncMod.Props[js.Any]
}

