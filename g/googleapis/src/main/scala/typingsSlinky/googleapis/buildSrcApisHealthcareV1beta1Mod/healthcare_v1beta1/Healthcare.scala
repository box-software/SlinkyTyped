package typingsSlinky.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Healthcare API
  *
  * Manage, store, and access healthcare data in Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const healthcare = google.healthcare('v1beta1');
  *
  * @namespace healthcare
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Healthcare
  */
@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Healthcare")
@js.native
class Healthcare protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

