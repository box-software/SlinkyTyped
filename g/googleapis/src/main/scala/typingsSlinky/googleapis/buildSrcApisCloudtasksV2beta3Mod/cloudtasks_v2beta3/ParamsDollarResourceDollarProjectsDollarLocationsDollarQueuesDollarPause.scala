package typingsSlinky.googleapis.buildSrcApisCloudtasksV2beta3Mod.cloudtasks_v2beta3

import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarPause extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required.  The queue name. For example:
    * `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$PauseQueueRequest] = js.native
}

