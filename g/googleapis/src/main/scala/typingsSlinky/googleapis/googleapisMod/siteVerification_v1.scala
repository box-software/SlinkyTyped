package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "siteVerification_v1")
@js.native
object siteVerification_v1 extends js.Object {
  @js.native
  class Resource$Webresource protected ()
    extends typingsSlinky.googleapis.buildSrcApisSiteVerificationV1Mod.siteVerification_v1.Resource$Webresource {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Google Site Verification API
    *
    * Verifies ownership of websites or domains with Google.
    *
    * @example
    * const {google} = require('googleapis');
    * const siteVerification = google.siteVerification('v1');
    *
    * @namespace siteVerification
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Siteverification
    */
  @js.native
  class Siteverification protected ()
    extends typingsSlinky.googleapis.buildSrcApisSiteVerificationV1Mod.siteVerification_v1.Siteverification {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

