package typingsSlinky.googleapis.googleapisMod.jobs_v3

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Talent Solution API
  *
  * Cloud Talent Solution provides the capability to create, read, update, and
  * delete job postings, as well as search jobs based on keywords and filters.
  *
  * @example
  * const {google} = require('googleapis');
  * const jobs = google.jobs('v3');
  *
  * @namespace jobs
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Jobs
  */
@JSImport("googleapis", "jobs_v3.Jobs")
@js.native
class Jobs protected ()
  extends typingsSlinky.googleapis.buildSrcApisJobsV3Mod.jobs_v3.Jobs {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

