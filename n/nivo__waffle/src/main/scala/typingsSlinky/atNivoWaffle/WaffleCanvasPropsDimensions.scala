package typingsSlinky.atNivoWaffle

import org.scalajs.dom.raw.HTMLCanvasElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.atNivoColors.atNivoColorsMod.InheritedColorProp
import typingsSlinky.atNivoCore.atNivoCoreMod.Box
import typingsSlinky.atNivoCore.atNivoCoreMod.Colors
import typingsSlinky.atNivoCore.atNivoCoreMod.GetColor
import typingsSlinky.atNivoCore.atNivoCoreMod.Theme
import typingsSlinky.atNivoWaffle.atNivoWaffleMod.ValueFormatter
import typingsSlinky.atNivoWaffle.atNivoWaffleMod.WaffleDatum
import typingsSlinky.atNivoWaffle.atNivoWaffleMod.WaffleFillDirection
import typingsSlinky.atNivoWaffle.atNivoWaffleMod.WaffleTooltipData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/waffle.@nivo/waffle.WaffleCanvasProps & @nivo/core.@nivo/core.Dimensions */
trait WaffleCanvasPropsDimensions extends js.Object {
  var borderColor: js.UndefOr[InheritedColorProp[WaffleDatum]] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var colorBy: js.UndefOr[String | GetColor[WaffleDatum]] = js.undefined
  var colors: js.UndefOr[Colors] = js.undefined
  var columns: Double
  var data: js.Array[js.Object]
  var emptyColor: js.UndefOr[String] = js.undefined
  var emptyOpacity: js.UndefOr[Double] = js.undefined
  var enableLabels: js.UndefOr[Boolean] = js.undefined
  var fillDirection: js.UndefOr[WaffleFillDirection] = js.undefined
  var height: Double
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* datum */ WaffleDatum, /* event */ SyntheticMouseEvent[HTMLCanvasElement], Unit]
  ] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var rows: Double
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltip: js.UndefOr[ReactComponentClass[WaffleTooltipData]] = js.undefined
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.undefined
  var total: Double
  var width: Double
}

object WaffleCanvasPropsDimensions {
  @scala.inline
  def apply(
    columns: Double,
    data: js.Array[js.Object],
    height: Double,
    rows: Double,
    total: Double,
    width: Double,
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
    tooltipFormat: String | ValueFormatter = null
  ): WaffleCanvasPropsDimensions = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[WaffleCanvasPropsDimensions]
  }
}

