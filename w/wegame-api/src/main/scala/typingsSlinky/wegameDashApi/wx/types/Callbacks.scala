package typingsSlinky.wegameDashApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callbacks extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Callbacks {
  @scala.inline
  def apply(complete: () => Unit = null, fail: () => Unit = null, success: () => Unit = null): Callbacks = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[Callbacks]
  }
}

