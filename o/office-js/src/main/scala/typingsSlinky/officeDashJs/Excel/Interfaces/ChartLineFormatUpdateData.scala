package typingsSlinky.officeDashJs.Excel.Interfaces

import typingsSlinky.officeDashJs.Excel.ChartLineStyle
import typingsSlinky.officeDashJs.officeDashJsStrings.Automatic
import typingsSlinky.officeDashJs.officeDashJsStrings.Continuous
import typingsSlinky.officeDashJs.officeDashJsStrings.Dash
import typingsSlinky.officeDashJs.officeDashJsStrings.DashDot
import typingsSlinky.officeDashJs.officeDashJsStrings.DashDotDot
import typingsSlinky.officeDashJs.officeDashJsStrings.Dot
import typingsSlinky.officeDashJs.officeDashJsStrings.Grey25
import typingsSlinky.officeDashJs.officeDashJsStrings.Grey50
import typingsSlinky.officeDashJs.officeDashJsStrings.Grey75
import typingsSlinky.officeDashJs.officeDashJsStrings.None
import typingsSlinky.officeDashJs.officeDashJsStrings.RoundDot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartLineFormat object, for use in `chartLineFormat.set({ ... })`. */
trait ChartLineFormatUpdateData extends js.Object {
  /**
    *
    * HTML color code representing the color of lines in the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the line style. See Excel.ChartLineStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var lineStyle: js.UndefOr[
    ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot
  ] = js.undefined
  /**
    *
    * Represents weight of the line, in points.
    *
    * [Api set: ExcelApi 1.7]
    */
  var weight: js.UndefOr[Double] = js.undefined
}

object ChartLineFormatUpdateData {
  @scala.inline
  def apply(
    color: String = null,
    lineStyle: ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot = null,
    weight: Int | Double = null
  ): ChartLineFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLineFormatUpdateData]
  }
}

