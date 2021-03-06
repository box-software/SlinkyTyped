package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "reseller_v1")
@js.native
object reseller_v1 extends js.Object {
  /**
    * Enterprise Apps Reseller API
    *
    * Creates and manages your customers and their subscriptions.
    *
    * @example
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * @namespace reseller
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Reseller
    */
  @js.native
  class Reseller protected ()
    extends typingsSlinky.googleapis.buildSrcApisResellerV1Mod.reseller_v1.Reseller {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Customers protected ()
    extends typingsSlinky.googleapis.buildSrcApisResellerV1Mod.reseller_v1.Resource$Customers {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Resellernotify protected ()
    extends typingsSlinky.googleapis.buildSrcApisResellerV1Mod.reseller_v1.Resource$Resellernotify {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Subscriptions protected ()
    extends typingsSlinky.googleapis.buildSrcApisResellerV1Mod.reseller_v1.Resource$Subscriptions {
    def this(context: APIRequestContext) = this()
  }
  
}

