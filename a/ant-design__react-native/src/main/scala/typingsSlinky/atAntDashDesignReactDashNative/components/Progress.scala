package typingsSlinky.atAntDashDesignReactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.fixed
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.normal
import typingsSlinky.atAntDashDesignReactDashNative.libProgressMod.ProgressProps
import typingsSlinky.atAntDashDesignReactDashNative.libProgressMod.default
import typingsSlinky.atAntDashDesignReactDashNative.libProgressStyleMod.ProgressStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Progress
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@ant-design/react-native/lib/progress", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    appearTransition: js.UndefOr[Boolean] = js.undefined,
    barStyle: StyleProp[ViewStyle] = null,
    percent: Int | Double = null,
    position: fixed | normal = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[ProgressStyle] = null,
    unfilled: js.UndefOr[Boolean] = js.undefined,
    wrapWidth: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appearTransition)) __obj.updateDynamic("appearTransition")(appearTransition.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(unfilled)) __obj.updateDynamic("unfilled")(unfilled.asInstanceOf[js.Any])
    if (wrapWidth != null) __obj.updateDynamic("wrapWidth")(wrapWidth.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atAntDashDesignReactDashNative.libProgressMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ProgressProps
}

