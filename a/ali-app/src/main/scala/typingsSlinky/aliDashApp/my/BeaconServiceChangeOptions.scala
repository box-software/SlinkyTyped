package typingsSlinky.aliDashApp.my

import typingsSlinky.aliDashApp.Anon_Available
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeaconServiceChangeOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_BeaconServiceChangeOptions: js.UndefOr[js.Function1[/* res */ Anon_Available, Unit]] = js.undefined
}

object BeaconServiceChangeOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ Anon_Available => Unit = null
  ): BeaconServiceChangeOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[BeaconServiceChangeOptions]
  }
}

