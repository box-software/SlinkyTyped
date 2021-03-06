package typingsSlinky.googleapis.buildSrcApisCloudtasksV2beta2Mod.cloudtasks_v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for renewing a lease using RenewLease.
  */
@js.native
trait Schema$RenewLeaseRequest extends js.Object {
  /**
    * Required.  The desired new lease duration, starting from now.   The
    * maximum lease duration is 1 week. `lease_duration` will be truncated to
    * the nearest second.
    */
  var leaseDuration: js.UndefOr[String] = js.native
  /**
    * The response_view specifies which subset of the Task will be returned. By
    * default response_view is BASIC; not all information is retrieved by
    * default because some data, such as payloads, might be desirable to return
    * only when needed because of its large size or because of the sensitivity
    * of data that it contains.  Authorization for FULL requires
    * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    * permission on the Task resource.
    */
  var responseView: js.UndefOr[String] = js.native
  /**
    * Required.  The task&#39;s current schedule time, available in the
    * schedule_time returned by LeaseTasks response or RenewLease response.
    * This restriction is to ensure that your worker currently holds the lease.
    */
  var scheduleTime: js.UndefOr[String] = js.native
}

object Schema$RenewLeaseRequest {
  @scala.inline
  def apply(leaseDuration: String = null, responseView: String = null, scheduleTime: String = null): Schema$RenewLeaseRequest = {
    val __obj = js.Dynamic.literal()
    if (leaseDuration != null) __obj.updateDynamic("leaseDuration")(leaseDuration.asInstanceOf[js.Any])
    if (responseView != null) __obj.updateDynamic("responseView")(responseView.asInstanceOf[js.Any])
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RenewLeaseRequest]
  }
}

