package typingsSlinky.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The definition of how a value in a pivot table should be calculated.
  */
@js.native
trait Schema$PivotValue extends js.Object {
  /**
    * If specified, indicates that pivot values should be displayed as the
    * result of a calculation with another pivot value. For example, if
    * calculated_display_type is specified as PERCENT_OF_GRAND_TOTAL, all the
    * pivot values are displayed as the percentage of the grand total. In the
    * Sheets UI, this is referred to as &quot;Show As&quot; in the value
    * section of a pivot table.
    */
  var calculatedDisplayType: js.UndefOr[String] = js.native
  /**
    * A custom formula to calculate the value.  The formula must start with an
    * `=` character.
    */
  var formula: js.UndefOr[String] = js.native
  /**
    * A name to use for the value.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The column offset of the source range that this value reads from.  For
    * example, if the source was `C10:E15`, a `sourceColumnOffset` of `0` means
    * this value refers to column `C`, whereas the offset `1` would refer to
    * column `D`.
    */
  var sourceColumnOffset: js.UndefOr[Double] = js.native
  /**
    * A function to summarize the value. If formula is set, the only supported
    * values are SUM and CUSTOM. If sourceColumnOffset is set, then `CUSTOM` is
    * not supported.
    */
  var summarizeFunction: js.UndefOr[String] = js.native
}

object Schema$PivotValue {
  @scala.inline
  def apply(
    calculatedDisplayType: String = null,
    formula: String = null,
    name: String = null,
    sourceColumnOffset: Int | Double = null,
    summarizeFunction: String = null
  ): Schema$PivotValue = {
    val __obj = js.Dynamic.literal()
    if (calculatedDisplayType != null) __obj.updateDynamic("calculatedDisplayType")(calculatedDisplayType.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sourceColumnOffset != null) __obj.updateDynamic("sourceColumnOffset")(sourceColumnOffset.asInstanceOf[js.Any])
    if (summarizeFunction != null) __obj.updateDynamic("summarizeFunction")(summarizeFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PivotValue]
  }
}

