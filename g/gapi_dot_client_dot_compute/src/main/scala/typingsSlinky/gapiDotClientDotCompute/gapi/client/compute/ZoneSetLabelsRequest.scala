package typingsSlinky.gapiDotClientDotCompute.gapi.client.compute

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneSetLabelsRequest extends js.Object {
  /**
    * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The fingerprint is initially generated by Compute Engine and
    * changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels.
    * Make a get() request to the resource to get the latest fingerprint.
    */
  var labelFingerprint: js.UndefOr[String] = js.undefined
  /** The labels to set for this resource. */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
}

object ZoneSetLabelsRequest {
  @scala.inline
  def apply(labelFingerprint: String = null, labels: Record[String, String] = null): ZoneSetLabelsRequest = {
    val __obj = js.Dynamic.literal()
    if (labelFingerprint != null) __obj.updateDynamic("labelFingerprint")(labelFingerprint.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneSetLabelsRequest]
  }
}

