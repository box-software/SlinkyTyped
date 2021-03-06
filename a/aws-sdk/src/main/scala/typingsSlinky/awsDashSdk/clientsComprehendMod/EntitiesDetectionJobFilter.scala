package typingsSlinky.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntitiesDetectionJobFilter extends js.Object {
  /**
    * Filters on the name of the job.
    */
  var JobName: js.UndefOr[typingsSlinky.awsDashSdk.clientsComprehendMod.JobName] = js.native
  /**
    * Filters the list of jobs based on job status. Returns only jobs with the specified status.
    */
  var JobStatus: js.UndefOr[typingsSlinky.awsDashSdk.clientsComprehendMod.JobStatus] = js.native
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
    */
  var SubmitTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
    */
  var SubmitTimeBefore: js.UndefOr[js.Date] = js.native
}

object EntitiesDetectionJobFilter {
  @scala.inline
  def apply(
    JobName: JobName = null,
    JobStatus: JobStatus = null,
    SubmitTimeAfter: js.Date = null,
    SubmitTimeBefore: js.Date = null
  ): EntitiesDetectionJobFilter = {
    val __obj = js.Dynamic.literal()
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (SubmitTimeAfter != null) __obj.updateDynamic("SubmitTimeAfter")(SubmitTimeAfter.asInstanceOf[js.Any])
    if (SubmitTimeBefore != null) __obj.updateDynamic("SubmitTimeBefore")(SubmitTimeBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitiesDetectionJobFilter]
  }
}

