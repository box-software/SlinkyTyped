package typingsSlinky.googleapis.buildSrcApisVaultV1Mod.vault_v1

import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarMattersDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The number of matters to return in the response. Default and maximum are
    * 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The pagination token as returned in the response.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * If set, list only matters with that specific state. The default is
    * listing matters of all states.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Specifies which parts of the matter to return in response.
    */
  var view: js.UndefOr[String] = js.native
}

