package typingsSlinky.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartJobRequest extends js.Object {
  /**
    * The unique identifier for a job.
    */
  var JobId: __string = js.native
}

object StartJobRequest {
  @scala.inline
  def apply(JobId: __string): StartJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartJobRequest]
  }
}

