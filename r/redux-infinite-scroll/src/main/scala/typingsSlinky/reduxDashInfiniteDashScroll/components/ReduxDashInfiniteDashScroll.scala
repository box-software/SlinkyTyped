package typingsSlinky.reduxDashInfiniteDashScroll.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.HTMLProps
import typingsSlinky.reduxDashInfiniteDashScroll.reduxDashInfiniteDashScrollMod.InfiniteScrollerProps
import typingsSlinky.reduxDashInfiniteDashScroll.reduxDashInfiniteDashScrollMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object ReduxDashInfiniteDashScroll
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("redux-infinite-scroll", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = InfiniteScrollerProps with HTMLProps[HTMLDivElement]
}

