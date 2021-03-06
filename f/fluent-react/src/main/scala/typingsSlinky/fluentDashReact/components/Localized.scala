package typingsSlinky.fluentDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.fluentDashReact.fluentDashReactMod.LocalizedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Localized
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.fluentDashReact.fluentDashReactMod.Localized] {
  @JSImport("fluent-react", "Localized")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(id: String, attrs: js.Object = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.fluentDashReact.fluentDashReactMod.Localized] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LocalizedProps
}

