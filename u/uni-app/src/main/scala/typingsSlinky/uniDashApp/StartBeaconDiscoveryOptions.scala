package typingsSlinky.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartBeaconDiscoveryOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * iBeacon设备广播的 uuids
    */
  var uuids: js.UndefOr[js.Array[_]] = js.undefined
}

object StartBeaconDiscoveryOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null,
    uuids: js.Array[_] = null
  ): StartBeaconDiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (uuids != null) __obj.updateDynamic("uuids")(uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBeaconDiscoveryOptions]
  }
}

