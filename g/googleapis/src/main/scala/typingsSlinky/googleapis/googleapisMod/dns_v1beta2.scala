package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "dns_v1beta2")
@js.native
object dns_v1beta2 extends js.Object {
  /**
    * Google Cloud DNS API
    *
    * Configures and serves authoritative DNS records.
    *
    * @example
    * const {google} = require('googleapis');
    * const dns = google.dns('v1beta2');
    *
    * @namespace dns
    * @type {Function}
    * @version v1beta2
    * @variation v1beta2
    * @param {object=} options Options for Dns
    */
  @js.native
  class Dns protected ()
    extends typingsSlinky.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2.Dns {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Changes protected ()
    extends typingsSlinky.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2.Resource$Changes {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Dnskeys protected ()
    extends typingsSlinky.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2.Resource$Dnskeys {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Managedzoneoperations protected ()
    extends typingsSlinky.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2.Resource$Managedzoneoperations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Managedzones protected ()
    extends typingsSlinky.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2.Resource$Managedzones {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Policies protected ()
    extends typingsSlinky.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2.Resource$Policies {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Projects protected ()
    extends typingsSlinky.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2.Resource$Projects {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Resourcerecordsets protected ()
    extends typingsSlinky.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2.Resource$Resourcerecordsets {
    def this(context: APIRequestContext) = this()
  }
  
}

