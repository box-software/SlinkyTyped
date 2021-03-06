package typingsSlinky.googleapis.buildSrcApisPubsubV1beta2Mod.pubsub_v1beta2

import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarTopicsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Maximum number of topics to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value returned by the last `ListTopicsResponse`; indicates that this
    * is a continuation of a prior `ListTopics` call, and that the system
    * should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the cloud project that topics belong to.
    */
  var project: js.UndefOr[String] = js.native
}

