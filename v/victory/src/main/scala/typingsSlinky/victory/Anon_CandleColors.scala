package typingsSlinky.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CandleColors extends js.Object {
  var candleColors: js.UndefOr[Anon_Negative] = js.undefined
  var style: js.UndefOr[Anon_Data] = js.undefined
}

object Anon_CandleColors {
  @scala.inline
  def apply(candleColors: Anon_Negative = null, style: Anon_Data = null): Anon_CandleColors = {
    val __obj = js.Dynamic.literal()
    if (candleColors != null) __obj.updateDynamic("candleColors")(candleColors.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CandleColors]
  }
}

