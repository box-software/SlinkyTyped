package typingsSlinky.reactDashToolbox.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashToolbox.libLayoutNavDrawerMod.NavDrawerProps
import typingsSlinky.reactDashToolbox.libLayoutNavDrawerMod.NavDrawerTheme
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.left
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.lg
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.lgTablet
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.md
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.right
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.sm
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.smTablet
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.xl
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.xxl
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.xxxl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavDrawer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashToolbox.libLayoutMod.NavDrawer] {
  @JSImport("react-toolbox/lib/layout", "NavDrawer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    clipped: js.UndefOr[Boolean] = js.undefined,
    insideTree: js.UndefOr[Boolean] = js.undefined,
    onOverlayClick: js.Function = null,
    permanentAt: sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    theme: NavDrawerTheme = null,
    `type`: left | right = null,
    withOverlay: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashToolbox.libLayoutMod.NavDrawer] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.asInstanceOf[js.Any])
    if (!js.isUndefined(insideTree)) __obj.updateDynamic("insideTree")(insideTree.asInstanceOf[js.Any])
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(onOverlayClick.asInstanceOf[js.Any])
    if (permanentAt != null) __obj.updateDynamic("permanentAt")(permanentAt.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(withOverlay)) __obj.updateDynamic("withOverlay")(withOverlay.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashToolbox.libLayoutMod.NavDrawer] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashToolbox.libLayoutMod.NavDrawer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = NavDrawerProps
}

