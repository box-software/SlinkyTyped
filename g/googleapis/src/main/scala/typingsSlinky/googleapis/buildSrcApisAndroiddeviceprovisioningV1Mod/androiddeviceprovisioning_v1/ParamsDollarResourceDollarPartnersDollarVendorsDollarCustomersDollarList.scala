package typingsSlinky.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPartnersDollarVendorsDollarCustomersDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of results to be returned.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results returned by the server.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The resource name in the format
    * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
}

