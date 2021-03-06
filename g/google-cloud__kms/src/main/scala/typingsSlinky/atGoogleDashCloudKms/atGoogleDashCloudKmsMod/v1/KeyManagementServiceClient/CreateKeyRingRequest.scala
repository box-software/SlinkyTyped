package typingsSlinky.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient

import typingsSlinky.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyRing
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateKeyRingRequest extends js.Object {
  var keyRing: js.UndefOr[Partial[KeyRing]] = js.undefined
  var keyRingId: String
  var parent: String
}

object CreateKeyRingRequest {
  @scala.inline
  def apply(keyRingId: String, parent: String, keyRing: Partial[KeyRing] = null): CreateKeyRingRequest = {
    val __obj = js.Dynamic.literal(keyRingId = keyRingId.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (keyRing != null) __obj.updateDynamic("keyRing")(keyRing.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyRingRequest]
  }
}

