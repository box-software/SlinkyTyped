package typingsSlinky.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDefaultPatchBaselineRequest extends js.Object {
  /**
    * Returns the default patch baseline for the specified operating system.
    */
  var OperatingSystem: js.UndefOr[typingsSlinky.awsDashSdk.clientsSsmMod.OperatingSystem] = js.native
}

object GetDefaultPatchBaselineRequest {
  @scala.inline
  def apply(OperatingSystem: OperatingSystem = null): GetDefaultPatchBaselineRequest = {
    val __obj = js.Dynamic.literal()
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultPatchBaselineRequest]
  }
}

