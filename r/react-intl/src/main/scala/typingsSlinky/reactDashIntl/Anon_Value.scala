package typingsSlinky.reactDashIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Value extends js.Object {
  var value: js.UndefOr[String | Double | js.Date] = js.undefined
}

object Anon_Value {
  @scala.inline
  def apply(value: String | Double | js.Date = null): Anon_Value = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Value]
  }
}

