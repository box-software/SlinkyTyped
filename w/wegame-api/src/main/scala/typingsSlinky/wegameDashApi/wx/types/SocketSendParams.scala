package typingsSlinky.wegameDashApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketSendParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var data: String | scala.scalajs.js.typedarray.ArrayBuffer
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SocketSendParams {
  @scala.inline
  def apply(
    data: String | scala.scalajs.js.typedarray.ArrayBuffer,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): SocketSendParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[SocketSendParams]
  }
}

