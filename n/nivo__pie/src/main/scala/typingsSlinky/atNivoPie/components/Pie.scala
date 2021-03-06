package typingsSlinky.atNivoPie.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGPathElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atNivoColors.atNivoColorsMod.InheritedColorProp
import typingsSlinky.atNivoColors.atNivoColorsMod.OrdinalColorsInstruction
import typingsSlinky.atNivoCore.Anon_
import typingsSlinky.atNivoCore.Anon_Id
import typingsSlinky.atNivoCore.atNivoCoreMod.Box
import typingsSlinky.atNivoCore.atNivoCoreMod.Theme
import typingsSlinky.atNivoLegends.atNivoLegendsMod.LegendProps
import typingsSlinky.atNivoPie.PieSvgPropsDimensions
import typingsSlinky.atNivoPie.atNivoPieMod.AccessorFunc
import typingsSlinky.atNivoPie.atNivoPieMod.PieDatum
import typingsSlinky.atNivoPie.atNivoPieMod.PieDatumWithColor
import typingsSlinky.atNivoPie.atNivoPieMod.ValueFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pie
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atNivoPie.atNivoPieMod.Pie] {
  @JSImport("@nivo/pie", "Pie")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: js.Array[PieDatum],
    height: Double,
    width: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    borderColor: InheritedColorProp[PieDatum] = null,
    borderWidth: Int | Double = null,
    colors: OrdinalColorsInstruction[PieDatum] = null,
    cornerRadius: Int | Double = null,
    defs: js.Array[Anon_Id] = null,
    enableRadialLabels: js.UndefOr[Boolean] = js.undefined,
    enableSlicesLabels: js.UndefOr[Boolean] = js.undefined,
    endAngle: Int | Double = null,
    fill: js.Array[Anon_[PieDatum]] = null,
    fit: js.UndefOr[Boolean] = js.undefined,
    innerRadius: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    legends: js.Array[LegendProps] = null,
    margin: Box = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    onClick: (/* datum */ PieDatum, /* event */ SyntheticMouseEvent[SVGPathElement]) => Unit = null,
    padAngle: Int | Double = null,
    radialLabel: String | AccessorFunc = null,
    radialLabelsLinkColor: InheritedColorProp[PieDatumWithColor] = null,
    radialLabelsLinkDiagonalLength: Int | Double = null,
    radialLabelsLinkHorizontalLength: Int | Double = null,
    radialLabelsLinkOffset: Int | Double = null,
    radialLabelsLinkStrokeWidth: Int | Double = null,
    radialLabelsSkipAngle: Int | Double = null,
    radialLabelsTextColor: InheritedColorProp[PieDatumWithColor] = null,
    radialLabelsTextXOffset: Int | Double = null,
    sliceLabel: String | AccessorFunc = null,
    slicesLabelsSkipAngle: Int | Double = null,
    slicesLabelsTextColor: InheritedColorProp[PieDatumWithColor] = null,
    sortByValue: js.UndefOr[Boolean] = js.undefined,
    startAngle: Int | Double = null,
    theme: Theme = null,
    tooltip: ReactComponentClass[PieDatumWithColor] = null,
    tooltipFormat: String | ValueFormatter = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atNivoPie.atNivoPieMod.Pie] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRadialLabels)) __obj.updateDynamic("enableRadialLabels")(enableRadialLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSlicesLabels)) __obj.updateDynamic("enableSlicesLabels")(enableSlicesLabels.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    if (radialLabel != null) __obj.updateDynamic("radialLabel")(radialLabel.asInstanceOf[js.Any])
    if (radialLabelsLinkColor != null) __obj.updateDynamic("radialLabelsLinkColor")(radialLabelsLinkColor.asInstanceOf[js.Any])
    if (radialLabelsLinkDiagonalLength != null) __obj.updateDynamic("radialLabelsLinkDiagonalLength")(radialLabelsLinkDiagonalLength.asInstanceOf[js.Any])
    if (radialLabelsLinkHorizontalLength != null) __obj.updateDynamic("radialLabelsLinkHorizontalLength")(radialLabelsLinkHorizontalLength.asInstanceOf[js.Any])
    if (radialLabelsLinkOffset != null) __obj.updateDynamic("radialLabelsLinkOffset")(radialLabelsLinkOffset.asInstanceOf[js.Any])
    if (radialLabelsLinkStrokeWidth != null) __obj.updateDynamic("radialLabelsLinkStrokeWidth")(radialLabelsLinkStrokeWidth.asInstanceOf[js.Any])
    if (radialLabelsSkipAngle != null) __obj.updateDynamic("radialLabelsSkipAngle")(radialLabelsSkipAngle.asInstanceOf[js.Any])
    if (radialLabelsTextColor != null) __obj.updateDynamic("radialLabelsTextColor")(radialLabelsTextColor.asInstanceOf[js.Any])
    if (radialLabelsTextXOffset != null) __obj.updateDynamic("radialLabelsTextXOffset")(radialLabelsTextXOffset.asInstanceOf[js.Any])
    if (sliceLabel != null) __obj.updateDynamic("sliceLabel")(sliceLabel.asInstanceOf[js.Any])
    if (slicesLabelsSkipAngle != null) __obj.updateDynamic("slicesLabelsSkipAngle")(slicesLabelsSkipAngle.asInstanceOf[js.Any])
    if (slicesLabelsTextColor != null) __obj.updateDynamic("slicesLabelsTextColor")(slicesLabelsTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(sortByValue)) __obj.updateDynamic("sortByValue")(sortByValue.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PieSvgPropsDimensions
}

