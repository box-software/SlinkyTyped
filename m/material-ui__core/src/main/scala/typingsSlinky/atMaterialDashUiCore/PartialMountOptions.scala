package typingsSlinky.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/test-utils/createMount.MountOptions> */
@js.native
trait PartialMountOptions extends js.Object {
  var mount: js.UndefOr[Fn_Mount] = js.native
}

object PartialMountOptions {
  @scala.inline
  def apply(mount: Fn_Mount = null): PartialMountOptions = {
    val __obj = js.Dynamic.literal()
    if (mount != null) __obj.updateDynamic("mount")(mount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMountOptions]
  }
}

