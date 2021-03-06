package typingsSlinky.wouter.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.wouter.wouterMod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(wouter), Name(wouterMod), Name(LinkProps))) was not a @ScalaJSDefined trait */
object Link
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("wouter", "Link")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = LinkProps
}

