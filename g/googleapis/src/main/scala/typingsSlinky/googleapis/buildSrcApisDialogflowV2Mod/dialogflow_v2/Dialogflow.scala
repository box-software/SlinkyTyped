package typingsSlinky.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dialogflow API
  *
  * Builds conversational interfaces (for example, chatbots, and voice-powered
  * apps and devices).
  *
  * @example
  * const {google} = require('googleapis');
  * const dialogflow = google.dialogflow('v2');
  *
  * @namespace dialogflow
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Dialogflow
  */
@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Dialogflow")
@js.native
class Dialogflow protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

