package typingsSlinky.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterIamRolesResult extends js.Object {
  var Cluster: js.UndefOr[typingsSlinky.awsDashSdk.clientsRedshiftMod.Cluster] = js.native
}

object ModifyClusterIamRolesResult {
  @scala.inline
  def apply(Cluster: Cluster = null): ModifyClusterIamRolesResult = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterIamRolesResult]
  }
}

