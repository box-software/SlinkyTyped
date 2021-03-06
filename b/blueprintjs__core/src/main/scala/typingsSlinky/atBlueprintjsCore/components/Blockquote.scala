package typingsSlinky.atBlueprintjsCore.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmComponentsHtmlHtmlMod.IElementRefProps
import typingsSlinky.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Blockquote
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@blueprintjs/core/lib/esm/components", "Blockquote")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]
}

