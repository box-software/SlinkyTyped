package typingsSlinky.rcDashMentions.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.ConsumerProps
import typingsSlinky.rcDashMentions.libMentionsContextMod.MentionsContextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MentionsContextConsumer
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.rcDashMentions.libMentionsContextMod.MentionsContextConsumer
    ] {
  @JSImport("rc-mentions/lib/MentionsContext", "MentionsContextConsumer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(observedBits: Int | Double = null, overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.rcDashMentions.libMentionsContextMod.MentionsContextConsumer
  ] = {
    val __obj = js.Dynamic.literal()
    if (observedBits != null) __obj.updateDynamic("observedBits")(observedBits.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ConsumerProps[MentionsContextProps]
}

