package typingsSlinky.atOracleOraclejet

import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoConverter extends js.Object {
  var converter: js.UndefOr[Converter[String]] = js.undefined
  var tooltipDisplay: js.UndefOr[off | auto] = js.undefined
  var tooltipLabel: js.UndefOr[String] = js.undefined
}

object Anon_AutoConverter {
  @scala.inline
  def apply(
    converter: Converter[String] = null,
    tooltipDisplay: off | auto = null,
    tooltipLabel: String = null
  ): Anon_AutoConverter = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (tooltipDisplay != null) __obj.updateDynamic("tooltipDisplay")(tooltipDisplay.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoConverter]
  }
}

