package typingsSlinky.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableSnapshotCopyResult extends js.Object {
  var Cluster: js.UndefOr[typingsSlinky.awsDashSdk.clientsRedshiftMod.Cluster] = js.native
}

object DisableSnapshotCopyResult {
  @scala.inline
  def apply(Cluster: Cluster = null): DisableSnapshotCopyResult = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableSnapshotCopyResult]
  }
}

