package typingsSlinky.atNivoLine.atNivoLineMod

import slinky.core.TagMod
import typingsSlinky.atNivoAxes.atNivoAxesMod.AxisProps
import typingsSlinky.atNivoColors.atNivoColorsMod.OrdinalColorsInstruction
import typingsSlinky.atNivoCore.atNivoCoreMod.Box
import typingsSlinky.atNivoCore.atNivoCoreMod.CartesianMarkerProps
import typingsSlinky.atNivoCore.atNivoCoreMod.Theme
import typingsSlinky.atNivoLegends.atNivoLegendsMod.LegendProps
import typingsSlinky.atNivoLine.atNivoLineBooleans.`false`
import typingsSlinky.atNivoLine.atNivoLineStrings.linear
import typingsSlinky.atNivoLine.atNivoLineStrings.monotoneX
import typingsSlinky.atNivoLine.atNivoLineStrings.monotoneY
import typingsSlinky.atNivoLine.atNivoLineStrings.natural
import typingsSlinky.atNivoLine.atNivoLineStrings.step
import typingsSlinky.atNivoLine.atNivoLineStrings.stepAfter
import typingsSlinky.atNivoLine.atNivoLineStrings.stepBefore
import typingsSlinky.atNivoLine.atNivoLineStrings.x
import typingsSlinky.atNivoLine.atNivoLineStrings.y
import typingsSlinky.atNivoScales.atNivoScalesMod.ScaleFunc
import typingsSlinky.atNivoTooltip.atNivoTooltipMod.CrosshairType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @nivo/line.Omit<@nivo/line.@nivo/line.LineSvgProps, 'xScale' | 'yScale'> */
trait LineCustomLayerProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var areaBaselineValue: js.UndefOr[LineValue] = js.undefined
  var areaBlendMode: js.UndefOr[String] = js.undefined
  var areaOpacity: js.UndefOr[Double] = js.undefined
  var axisBottom: js.UndefOr[AxisProps] = js.undefined
  var axisLeft: js.UndefOr[AxisProps] = js.undefined
  var axisRight: js.UndefOr[AxisProps] = js.undefined
  var axisTop: js.UndefOr[AxisProps] = js.undefined
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.undefined
  var crosshairType: js.UndefOr[CrosshairType] = js.undefined
  var curve: js.UndefOr[linear | monotoneX | monotoneY | natural | stepBefore | step | stepAfter] = js.undefined
  var data: js.Array[LineSerieData]
  var debugMesh: js.UndefOr[Boolean] = js.undefined
  var debugSlices: js.UndefOr[Boolean] = js.undefined
  var enableArea: js.UndefOr[Boolean] = js.undefined
  var enableCrosshair: js.UndefOr[Boolean] = js.undefined
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  var enablePointLabel: js.UndefOr[Boolean] = js.undefined
  var enablePoints: js.UndefOr[Boolean] = js.undefined
  var enableSlices: js.UndefOr[x | y | `false`] = js.undefined
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var markers: js.UndefOr[js.Array[CartesianMarkerProps]] = js.undefined
  var motionDamping: js.UndefOr[Double] = js.undefined
  var motionStiffness: js.UndefOr[Double] = js.undefined
  var pointBorderColor: js.UndefOr[js.Any] = js.undefined
  var pointBorderWidth: js.UndefOr[Double] = js.undefined
  var pointColor: js.UndefOr[js.Any] = js.undefined
  var pointLabel: js.UndefOr[String] = js.undefined
  var pointLabelYOffset: js.UndefOr[Double] = js.undefined
  var pointSize: js.UndefOr[Double] = js.undefined
  var sliceTooltip: js.UndefOr[js.Function1[/* data */ LineSliceData, TagMod[Any]]] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltip: js.UndefOr[TooltipProp] = js.undefined
  var tooltipFormat: js.UndefOr[TooltipFormatter | String] = js.undefined
  var useMesh: js.UndefOr[Boolean] = js.undefined
  var xFormat: js.UndefOr[String | DataFormatter] = js.undefined
  var xScale: ScaleFunc
  var yFormat: js.UndefOr[String | DataFormatter] = js.undefined
  var yScale: ScaleFunc
}

object LineCustomLayerProps {
  @scala.inline
  def apply(
    data: js.Array[LineSerieData],
    xScale: /* value */ String | Double | js.Date => Double,
    yScale: /* value */ String | Double | js.Date => Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    areaBaselineValue: LineValue = null,
    areaBlendMode: String = null,
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
    enablePointLabel: js.UndefOr[Boolean] = js.undefined,
    enablePoints: js.UndefOr[Boolean] = js.undefined,
    enableSlices: x | y | `false` = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    layers: js.Array[Layer] = null,
    legends: js.Array[LegendProps] = null,
    lineWidth: Int | Double = null,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    pointBorderColor: js.Any = null,
    pointBorderWidth: Int | Double = null,
    pointColor: js.Any = null,
    pointLabel: String = null,
    pointLabelYOffset: Int | Double = null,
    pointSize: Int | Double = null,
    sliceTooltip: /* data */ LineSliceData => TagMod[Any] = null,
    theme: Theme = null,
    tooltip: TooltipProp = null,
    tooltipFormat: TooltipFormatter | String = null,
    useMesh: js.UndefOr[Boolean] = js.undefined,
    xFormat: String | DataFormatter = null,
    yFormat: String | DataFormatter = null
  ): LineCustomLayerProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xScale = js.Any.fromFunction1(xScale), yScale = js.Any.fromFunction1(yScale))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (areaBaselineValue != null) __obj.updateDynamic("areaBaselineValue")(areaBaselineValue.asInstanceOf[js.Any])
    if (areaBlendMode != null) __obj.updateDynamic("areaBlendMode")(areaBlendMode.asInstanceOf[js.Any])
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
    if (!js.isUndefined(enablePointLabel)) __obj.updateDynamic("enablePointLabel")(enablePointLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePoints)) __obj.updateDynamic("enablePoints")(enablePoints.asInstanceOf[js.Any])
    if (enableSlices != null) __obj.updateDynamic("enableSlices")(enableSlices.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (pointBorderColor != null) __obj.updateDynamic("pointBorderColor")(pointBorderColor.asInstanceOf[js.Any])
    if (pointBorderWidth != null) __obj.updateDynamic("pointBorderWidth")(pointBorderWidth.asInstanceOf[js.Any])
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor.asInstanceOf[js.Any])
    if (pointLabel != null) __obj.updateDynamic("pointLabel")(pointLabel.asInstanceOf[js.Any])
    if (pointLabelYOffset != null) __obj.updateDynamic("pointLabelYOffset")(pointLabelYOffset.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (sliceTooltip != null) __obj.updateDynamic("sliceTooltip")(js.Any.fromFunction1(sliceTooltip))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(useMesh)) __obj.updateDynamic("useMesh")(useMesh.asInstanceOf[js.Any])
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineCustomLayerProps]
  }
}

