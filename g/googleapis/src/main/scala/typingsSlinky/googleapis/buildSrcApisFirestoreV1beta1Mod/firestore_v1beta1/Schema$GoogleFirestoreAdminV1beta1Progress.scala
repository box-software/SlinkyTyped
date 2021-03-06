package typingsSlinky.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Measures the progress of a particular metric.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1beta1Progress extends js.Object {
  /**
    * An estimate of how much work has been completed. Note that this may be
    * greater than `work_estimated`.
    */
  var workCompleted: js.UndefOr[String] = js.native
  /**
    * An estimate of how much work needs to be performed. Zero if the work
    * estimate is unavailable. May change as work progresses.
    */
  var workEstimated: js.UndefOr[String] = js.native
}

object Schema$GoogleFirestoreAdminV1beta1Progress {
  @scala.inline
  def apply(workCompleted: String = null, workEstimated: String = null): Schema$GoogleFirestoreAdminV1beta1Progress = {
    val __obj = js.Dynamic.literal()
    if (workCompleted != null) __obj.updateDynamic("workCompleted")(workCompleted.asInstanceOf[js.Any])
    if (workEstimated != null) __obj.updateDynamic("workEstimated")(workEstimated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1beta1Progress]
  }
}

