package typingsSlinky.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootDBInstanceResult extends js.Object {
  var DBInstance: js.UndefOr[typingsSlinky.awsDashSdk.clientsNeptuneMod.DBInstance] = js.native
}

object RebootDBInstanceResult {
  @scala.inline
  def apply(DBInstance: DBInstance = null): RebootDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (DBInstance != null) __obj.updateDynamic("DBInstance")(DBInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootDBInstanceResult]
  }
}

