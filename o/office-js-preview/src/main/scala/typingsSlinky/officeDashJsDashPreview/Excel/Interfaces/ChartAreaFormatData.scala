package typingsSlinky.officeDashJsDashPreview.Excel.Interfaces

import typingsSlinky.officeDashJsDashPreview.Excel.ChartColorScheme
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ColorfulPalette1
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ColorfulPalette2
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ColorfulPalette3
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ColorfulPalette4
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette1
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette10
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette11
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette12
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette13
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette2
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette3
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette4
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette5
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette6
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette7
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette8
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette9
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartAreaFormat.toJSON()`. */
trait ChartAreaFormatData extends js.Object {
  /**
    *
    * Represents the border format of chart area, which includes color, linestyle, and weight. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  /**
    *
    * Returns or sets color scheme of the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: js.UndefOr[
    ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13
  ] = js.undefined
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for the current object. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
  /**
    *
    * Specifies whether or not chart area of the chart has rounded corners. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: js.UndefOr[Boolean] = js.undefined
}

object ChartAreaFormatData {
  @scala.inline
  def apply(
    border: ChartBorderData = null,
    colorScheme: ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13 = null,
    font: ChartFontData = null,
    roundedCorners: js.UndefOr[Boolean] = js.undefined
  ): ChartAreaFormatData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (colorScheme != null) __obj.updateDynamic("colorScheme")(colorScheme.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(roundedCorners)) __obj.updateDynamic("roundedCorners")(roundedCorners.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAreaFormatData]
  }
}

