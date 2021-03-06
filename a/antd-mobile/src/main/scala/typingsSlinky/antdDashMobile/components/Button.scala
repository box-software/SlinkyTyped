package typingsSlinky.antdDashMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.a.tag
import typingsSlinky.antdDashMobile.antdDashMobileStrings.ghost
import typingsSlinky.antdDashMobile.antdDashMobileStrings.large
import typingsSlinky.antdDashMobile.antdDashMobileStrings.primary
import typingsSlinky.antdDashMobile.antdDashMobileStrings.small
import typingsSlinky.antdDashMobile.antdDashMobileStrings.warning
import typingsSlinky.antdDashMobile.libButtonMod.ButtonProps
import typingsSlinky.antdDashMobile.libButtonMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/button", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, onClick */
  def apply(
    activeClassName: String = null,
    activeStyle: Boolean | CSSProperties = null,
    icon: TagMod[Any] = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    role: String = null,
    size: large | small = null,
    style: CSSProperties = null,
    `type`: primary | warning | ghost = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName.asInstanceOf[js.Any])
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.a.tag.type, typingsSlinky.antdDashMobile.libButtonMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ButtonProps
}

