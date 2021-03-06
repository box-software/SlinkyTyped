package typingsSlinky.catalog.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.catalog.catalogMod.HtmlSpecimenProps
import typingsSlinky.catalog.catalogMod.SpecimenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object HtmlSpecimen
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.catalog.catalogMod.HtmlSpecimen] {
  @JSImport("catalog", "HtmlSpecimen")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = SpecimenProps with HtmlSpecimenProps
}

