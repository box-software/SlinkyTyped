package typingsSlinky.antdDashMobileDashRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.lg
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.md
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.sm
import typingsSlinky.antdDashMobileDashRn.libWingDashBlankIndexDotNativeMod.WingBlankProps
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WingBlank
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.WingBlank] {
  @JSImport("antd-mobile-rn", "WingBlank")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    size: sm | md | lg = null,
    style: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.WingBlank] = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.WingBlank] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.WingBlank](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = WingBlankProps
}

