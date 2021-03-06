package typingsSlinky.atStorybookTheming.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.emotionDashTheming.emotionDashThemingMod.ThemeProviderProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@storybook/theming", "ThemeProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[Theme](theme: Partial[Theme] | (js.Function1[Theme, Theme]), _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object]]
  }
  type Props = ThemeProviderProps[js.Any]
}

