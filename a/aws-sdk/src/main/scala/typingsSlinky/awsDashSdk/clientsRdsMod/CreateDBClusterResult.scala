package typingsSlinky.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBClusterResult extends js.Object {
  var DBCluster: js.UndefOr[typingsSlinky.awsDashSdk.clientsRdsMod.DBCluster] = js.native
}

object CreateDBClusterResult {
  @scala.inline
  def apply(DBCluster: DBCluster = null): CreateDBClusterResult = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterResult]
  }
}

