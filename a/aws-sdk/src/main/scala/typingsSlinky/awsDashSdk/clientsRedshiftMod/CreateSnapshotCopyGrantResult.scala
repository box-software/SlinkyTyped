package typingsSlinky.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotCopyGrantResult extends js.Object {
  var SnapshotCopyGrant: js.UndefOr[typingsSlinky.awsDashSdk.clientsRedshiftMod.SnapshotCopyGrant] = js.native
}

object CreateSnapshotCopyGrantResult {
  @scala.inline
  def apply(SnapshotCopyGrant: SnapshotCopyGrant = null): CreateSnapshotCopyGrantResult = {
    val __obj = js.Dynamic.literal()
    if (SnapshotCopyGrant != null) __obj.updateDynamic("SnapshotCopyGrant")(SnapshotCopyGrant.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotCopyGrantResult]
  }
}

