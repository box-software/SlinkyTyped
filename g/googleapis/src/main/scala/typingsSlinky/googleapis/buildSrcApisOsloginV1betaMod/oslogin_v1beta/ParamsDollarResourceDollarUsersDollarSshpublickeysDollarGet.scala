package typingsSlinky.googleapis.buildSrcApisOsloginV1betaMod.oslogin_v1beta

import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarUsersDollarSshpublickeysDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The fingerprint of the public key to retrieve. Public keys are identified
    * by their SHA-256 fingerprint. The fingerprint of the public key is in
    * format `users/{user}/sshPublicKeys/{fingerprint}`.
    */
  var name: js.UndefOr[String] = js.native
}

