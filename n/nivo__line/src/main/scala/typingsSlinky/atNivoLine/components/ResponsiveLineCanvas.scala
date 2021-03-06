package typingsSlinky.atNivoLine.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atNivoAxes.atNivoAxesMod.AxisProps
import typingsSlinky.atNivoColors.atNivoColorsMod.OrdinalColorsInstruction
import typingsSlinky.atNivoCore.atNivoCoreMod.Box
import typingsSlinky.atNivoCore.atNivoCoreMod.CartesianMarkerProps
import typingsSlinky.atNivoCore.atNivoCoreMod.Theme
import typingsSlinky.atNivoLegends.atNivoLegendsMod.LegendProps
import typingsSlinky.atNivoLine.atNivoLineBooleans.`false`
import typingsSlinky.atNivoLine.atNivoLineMod.DataFormatter
import typingsSlinky.atNivoLine.atNivoLineMod.Layer
import typingsSlinky.atNivoLine.atNivoLineMod.LineCanvasProps
import typingsSlinky.atNivoLine.atNivoLineMod.LineSerieData
import typingsSlinky.atNivoLine.atNivoLineMod.LineSliceData
import typingsSlinky.atNivoLine.atNivoLineMod.LineValue
import typingsSlinky.atNivoLine.atNivoLineMod.TooltipFormatter
import typingsSlinky.atNivoLine.atNivoLineMod.TooltipProp
import typingsSlinky.atNivoLine.atNivoLineStrings.linear
import typingsSlinky.atNivoLine.atNivoLineStrings.monotoneX
import typingsSlinky.atNivoLine.atNivoLineStrings.monotoneY
import typingsSlinky.atNivoLine.atNivoLineStrings.natural
import typingsSlinky.atNivoLine.atNivoLineStrings.step
import typingsSlinky.atNivoLine.atNivoLineStrings.stepAfter
import typingsSlinky.atNivoLine.atNivoLineStrings.stepBefore
import typingsSlinky.atNivoLine.atNivoLineStrings.x
import typingsSlinky.atNivoLine.atNivoLineStrings.y
import typingsSlinky.atNivoScales.atNivoScalesMod.Scale
import typingsSlinky.atNivoTooltip.atNivoTooltipMod.CrosshairType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveLineCanvas
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atNivoLine.atNivoLineMod.ResponsiveLineCanvas] {
  @JSImport("@nivo/line", "ResponsiveLineCanvas")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: js.Array[LineSerieData],
    areaBaselineValue: LineValue = null,
    areaOpacity: Int | Double = null,
    axisBottom: AxisProps = null,
    axisLeft: AxisProps = null,
    axisRight: AxisProps = null,
    axisTop: AxisProps = null,
    colors: OrdinalColorsInstruction[_] = null,
    crosshairType: CrosshairType = null,
    curve: linear | monotoneX | monotoneY | natural | stepBefore | step | stepAfter = null,
    debugMesh: js.UndefOr[Boolean] = js.undefined,
    debugSlices: js.UndefOr[Boolean] = js.undefined,
    enableArea: js.UndefOr[Boolean] = js.undefined,
    enableCrosshair: js.UndefOr[Boolean] = js.undefined,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enablePoints: js.UndefOr[Boolean] = js.undefined,
    enableSlices: x | y | `false` = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    layers: js.Array[Layer] = null,
    legends: js.Array[LegendProps] = null,
    lineWidth: Int | Double = null,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    pixelRatio: Int | Double = null,
    pointBorderColor: js.Any = null,
    pointBorderWidth: Int | Double = null,
    pointColor: js.Any = null,
    pointSize: Int | Double = null,
    sliceTooltip: /* data */ LineSliceData => TagMod[Any] = null,
    theme: Theme = null,
    tooltip: TooltipProp = null,
    tooltipFormat: TooltipFormatter | String = null,
    xFormat: String | DataFormatter = null,
    xScale: Scale = null,
    yFormat: String | DataFormatter = null,
    yScale: Scale = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atNivoLine.atNivoLineMod.ResponsiveLineCanvas] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (areaBaselineValue != null) __obj.updateDynamic("areaBaselineValue")(areaBaselineValue.asInstanceOf[js.Any])
    if (areaOpacity != null) __obj.updateDynamic("areaOpacity")(areaOpacity.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (crosshairType != null) __obj.updateDynamic("crosshairType")(crosshairType.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMesh)) __obj.updateDynamic("debugMesh")(debugMesh.asInstanceOf[js.Any])
    if (!js.isUndefined(debugSlices)) __obj.updateDynamic("debugSlices")(debugSlices.asInstanceOf[js.Any])
    if (!js.isUndefined(enableArea)) __obj.updateDynamic("enableArea")(enableArea.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCrosshair)) __obj.updateDynamic("enableCrosshair")(enableCrosshair.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePoints)) __obj.updateDynamic("enablePoints")(enablePoints.asInstanceOf[js.Any])
    if (enableSlices != null) __obj.updateDynamic("enableSlices")(enableSlices.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (pointBorderColor != null) __obj.updateDynamic("pointBorderColor")(pointBorderColor.asInstanceOf[js.Any])
    if (pointBorderWidth != null) __obj.updateDynamic("pointBorderWidth")(pointBorderWidth.asInstanceOf[js.Any])
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (sliceTooltip != null) __obj.updateDynamic("sliceTooltip")(js.Any.fromFunction1(sliceTooltip))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(xScale.asInstanceOf[js.Any])
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(yScale.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LineCanvasProps
}

