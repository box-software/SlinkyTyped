package typingsSlinky.baseui.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.popoverMod.StatefulPopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(baseui), Name(popoverMod), Name(StatefulPopoverProps))) was not a @ScalaJSDefined trait */
object StatefulPopover
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("baseui/popover", "StatefulPopover")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = StatefulPopoverProps
}

