package typingsSlinky.reactDashBootstrap.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashBootstrap.libCarouselMod.CarouselProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashBootstrap), Name(libCarouselMod), Name(CarouselProps))) was not a @ScalaJSDefined trait */
object Carousel
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashBootstrap.libMod.Carousel] {
  @JSImport("react-bootstrap/lib", "Carousel")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = CarouselProps
}

