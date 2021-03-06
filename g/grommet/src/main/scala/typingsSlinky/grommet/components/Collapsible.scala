package typingsSlinky.grommet.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.grommet.componentsCollapsibleMod.CollapsibleProps
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Collapsible
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.grommet.grommetMod.Collapsible] {
  @JSImport("grommet", "Collapsible")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
}

