package typingsSlinky.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopKeyPhrasesDetectionJobResponse extends js.Object {
  /**
    * The identifier of the key phrases detection job to stop.
    */
  var JobId: js.UndefOr[typingsSlinky.awsDashSdk.clientsComprehendMod.JobId] = js.native
  /**
    * Either STOP_REQUESTED if the job is currently running, or STOPPED if the job was previously stopped with the StopKeyPhrasesDetectionJob operation.
    */
  var JobStatus: js.UndefOr[typingsSlinky.awsDashSdk.clientsComprehendMod.JobStatus] = js.native
}

object StopKeyPhrasesDetectionJobResponse {
  @scala.inline
  def apply(JobId: JobId = null, JobStatus: JobStatus = null): StopKeyPhrasesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopKeyPhrasesDetectionJobResponse]
  }
}

