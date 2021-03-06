package typingsSlinky.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Firebase Rules API
  *
  * Creates and manages rules that determine when a Firebase Rules-enabled
  * service should permit a request.
  *
  * @example
  * const {google} = require('googleapis');
  * const firebaserules = google.firebaserules('v1');
  *
  * @namespace firebaserules
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Firebaserules
  */
@JSImport("googleapis/build/src/apis/firebaserules/v1", "firebaserules_v1.Firebaserules")
@js.native
class Firebaserules protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

