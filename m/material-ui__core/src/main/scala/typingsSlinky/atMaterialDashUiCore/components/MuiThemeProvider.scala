package typingsSlinky.atMaterialDashUiCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typingsSlinky.atMaterialDashUiCore.stylesMuiThemeProviderMod.MuiThemeProviderProps
import typingsSlinky.atMaterialDashUiCore.stylesMuiThemeProviderMod.SheetManagerTheme
import typingsSlinky.atMaterialDashUiCore.stylesMuiThemeProviderMod.default
import typingsSlinky.atMaterialDashUiCore.stylesWithStylesMod.StylesCreator
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MuiThemeProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@material-ui/core/styles/MuiThemeProvider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme]),
    disableStylesGeneration: js.UndefOr[Boolean] = js.undefined,
    sheetsManager: Map[StylesCreator, Map[Theme, SheetManagerTheme]] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration.asInstanceOf[js.Any])
    if (sheetsManager != null) __obj.updateDynamic("sheetsManager")(sheetsManager.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MuiThemeProviderProps
}

