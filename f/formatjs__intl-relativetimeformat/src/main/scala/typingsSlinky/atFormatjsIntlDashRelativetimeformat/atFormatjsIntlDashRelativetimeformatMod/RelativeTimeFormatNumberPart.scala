package typingsSlinky.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod

import typingsSlinky.std.Intl.NumberFormatPart
import typingsSlinky.std.Intl.NumberFormatPartTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeFormatNumberPart extends NumberFormatPart {
  var unit: Unit
}

object RelativeTimeFormatNumberPart {
  @scala.inline
  def apply(`type`: NumberFormatPartTypes, unit: Unit, value: String): RelativeTimeFormatNumberPart = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeFormatNumberPart]
  }
}

