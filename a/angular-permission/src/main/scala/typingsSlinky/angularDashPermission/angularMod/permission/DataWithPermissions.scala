package typingsSlinky.angularDashPermission.angularMod.permission

import typingsSlinky.angularDashPermission.Anon_Except
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataWithPermissions extends js.Object {
  var permissions: js.UndefOr[Anon_Except] = js.undefined
}

object DataWithPermissions {
  @scala.inline
  def apply(permissions: Anon_Except = null): DataWithPermissions = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataWithPermissions]
  }
}

