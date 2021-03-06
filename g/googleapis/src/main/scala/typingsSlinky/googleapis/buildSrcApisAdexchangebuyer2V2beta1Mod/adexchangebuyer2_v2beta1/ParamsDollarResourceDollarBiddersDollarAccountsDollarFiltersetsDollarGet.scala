package typingsSlinky.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Full name of the resource being requested. For example:  - For a
    * bidder-level filter set for bidder 123:   `bidders/123/filterSets/abc`  -
    * For an account-level filter set for the buyer account representing bidder
    * 123: `bidders/123/accounts/123/filterSets/abc`  - For an account-level
    * filter set for the child seat buyer account 456   whose bidder is 123:
    * `bidders/123/accounts/456/filterSets/abc`
    */
  var name: js.UndefOr[String] = js.native
}

