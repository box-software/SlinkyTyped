package typingsSlinky.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the format properties for chart gridlines.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartGridlinesFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents chart line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatLoadOptions] = js.native
}

