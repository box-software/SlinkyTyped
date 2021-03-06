package typingsSlinky.googleapis.buildSrcApisLoggingV2beta1Mod.logging_v2beta1

import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarMetricsDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The resource name of the project in which to create the metric:
    * "projects/[PROJECT_ID]" The new metric must be provided in the request.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$LogMetric] = js.native
}

