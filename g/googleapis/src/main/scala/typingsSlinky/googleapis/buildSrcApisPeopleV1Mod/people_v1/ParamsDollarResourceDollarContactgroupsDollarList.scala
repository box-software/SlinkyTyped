package typingsSlinky.googleapis.buildSrcApisPeopleV1Mod.people_v1

import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarContactgroupsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of resources to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token value returned from a previous call to
    * [ListContactGroups](/people/api/rest/v1/contactgroups/list). Requests the
    * next page of resources.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * A sync token, returned by a previous call to `contactgroups.list`. Only
    * resources changed since the sync token was created will be returned.
    */
  var syncToken: js.UndefOr[String] = js.native
}

