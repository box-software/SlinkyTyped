package typingsSlinky.officeDashJsDashPreview.Excel.Interfaces

import typingsSlinky.officeDashJsDashPreview.Excel.ConditionalRangeBorderLineStyle
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Continuous
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dash
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDotDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ConditionalRangeBorder object, for use in `conditionalRangeBorder.set({ ... })`. */
trait ConditionalRangeBorderUpdateData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    ConditionalRangeBorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot
  ] = js.undefined
}

object ConditionalRangeBorderUpdateData {
  @scala.inline
  def apply(
    color: String = null,
    style: ConditionalRangeBorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot = null
  ): ConditionalRangeBorderUpdateData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalRangeBorderUpdateData]
  }
}

