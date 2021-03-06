package typingsSlinky.async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var errorFilter: js.UndefOr[js.Function1[/* error */ js.Error, Boolean]] = js.undefined
  var interval: Double | (js.Function1[/* retryCount */ Double, Double])
  var times: Double
}

object Anon_Error {
  @scala.inline
  def apply(
    interval: Double | (js.Function1[/* retryCount */ Double, Double]),
    times: Double,
    errorFilter: /* error */ js.Error => Boolean = null
  ): Anon_Error = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    if (errorFilter != null) __obj.updateDynamic("errorFilter")(js.Any.fromFunction1(errorFilter))
    __obj.asInstanceOf[Anon_Error]
  }
}

