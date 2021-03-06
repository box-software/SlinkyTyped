package typingsSlinky.googleapis.buildSrcApisYoutubeAnalyticsV1Mod.youtubeAnalytics_v1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * YouTube Analytics API
  *
  * Retrieves your YouTube Analytics data.
  *
  * @example
  * const {google} = require('googleapis');
  * const youtubeAnalytics = google.youtubeAnalytics('v1');
  *
  * @namespace youtubeAnalytics
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Youtubeanalytics
  */
@JSImport("googleapis/build/src/apis/youtubeAnalytics/v1", "youtubeAnalytics_v1.Youtubeanalytics")
@js.native
class Youtubeanalytics protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var groupItems: Resource$Groupitems = js.native
  var groups: Resource$Groups = js.native
  var reports: Resource$Reports = js.native
}

