package typingsSlinky.avoscloudDashSdk.avoscloudDashSdkMod.Object

import typingsSlinky.avoscloudDashSdk.avoscloudDashSdkMod.ErrorOption
import typingsSlinky.avoscloudDashSdk.avoscloudDashSdkMod.SuccessOption
import typingsSlinky.avoscloudDashSdk.avoscloudDashSdkMod.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyAllOptions
  extends SuccessOption
     with ErrorOption
     with UseMasterKeyOption

object DestroyAllOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    success: js.Function = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): DestroyAllOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestroyAllOptions]
  }
}

