package typingsSlinky.atOracleOraclejet

import typingsSlinky.atOracleOraclejet.ojcolorMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorLabel extends js.Object {
  var color: ^
  var label: js.UndefOr[String] = js.undefined
}

object Anon_ColorLabel {
  @scala.inline
  def apply(color: ^, label: String = null): Anon_ColorLabel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorLabel]
  }
}

