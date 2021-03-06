package typingsSlinky.atNivoWaffle.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atNivoColors.atNivoColorsMod.InheritedColorProp
import typingsSlinky.atNivoCore.atNivoCoreMod.Box
import typingsSlinky.atNivoCore.atNivoCoreMod.Colors
import typingsSlinky.atNivoCore.atNivoCoreMod.GetColor
import typingsSlinky.atNivoCore.atNivoCoreMod.Theme
import typingsSlinky.atNivoWaffle.atNivoWaffleMod.ValueFormatter
import typingsSlinky.atNivoWaffle.atNivoWaffleMod.WaffleCanvasProps
import typingsSlinky.atNivoWaffle.atNivoWaffleMod.WaffleDatum
import typingsSlinky.atNivoWaffle.atNivoWaffleMod.WaffleFillDirection
import typingsSlinky.atNivoWaffle.atNivoWaffleMod.WaffleTooltipData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveWaffleCanvas
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atNivoWaffle.atNivoWaffleMod.ResponsiveWaffleCanvas] {
  @JSImport("@nivo/waffle", "ResponsiveWaffleCanvas")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    columns: Double,
    data: js.Array[js.Object],
    rows: Double,
    total: Double,
    borderColor: InheritedColorProp[WaffleDatum] = null,
    borderWidth: Int | Double = null,
    colorBy: String | GetColor[WaffleDatum] = null,
    colors: Colors = null,
    emptyColor: String = null,
    emptyOpacity: Int | Double = null,
    enableLabels: js.UndefOr[Boolean] = js.undefined,
    fillDirection: WaffleFillDirection = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    margin: Box = null,
    onClick: (/* datum */ WaffleDatum, /* event */ SyntheticMouseEvent[HTMLCanvasElement]) => Unit = null,
    padding: Int | Double = null,
    pixelRatio: Int | Double = null,
    theme: Theme = null,
    tooltip: ReactComponentClass[WaffleTooltipData] = null,
    tooltipFormat: String | ValueFormatter = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atNivoWaffle.atNivoWaffleMod.ResponsiveWaffleCanvas] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colorBy != null) __obj.updateDynamic("colorBy")(colorBy.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (emptyColor != null) __obj.updateDynamic("emptyColor")(emptyColor.asInstanceOf[js.Any])
    if (emptyOpacity != null) __obj.updateDynamic("emptyOpacity")(emptyOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabels)) __obj.updateDynamic("enableLabels")(enableLabels.asInstanceOf[js.Any])
    if (fillDirection != null) __obj.updateDynamic("fillDirection")(fillDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = WaffleCanvasProps
}

