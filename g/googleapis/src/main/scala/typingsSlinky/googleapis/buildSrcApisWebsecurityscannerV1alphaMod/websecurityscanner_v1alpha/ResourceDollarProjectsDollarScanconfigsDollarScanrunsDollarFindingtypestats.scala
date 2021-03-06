package typingsSlinky.googleapis.buildSrcApisWebsecurityscannerV1alphaMod.websecurityscanner_v1alpha

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/websecurityscanner/v1alpha", "websecurityscanner_v1alpha.Resource$Projects$Scanconfigs$Scanruns$Findingtypestats")
@js.native
class ResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingtypestats protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.findingTypeStats.list
    * @desc List all FindingTypeStats under a given ScanRun.
    * @alias
    * websecurityscanner.projects.scanConfigs.scanRuns.findingTypeStats.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListFindingTypeStatsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListFindingTypeStatsResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingtypestatsDollarList
  ): GaxiosPromise[Schema$ListFindingTypeStatsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingtypestatsDollarList,
    callback: BodyResponseCallback[Schema$ListFindingTypeStatsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingtypestatsDollarList,
    options: BodyResponseCallback[Schema$ListFindingTypeStatsResponse],
    callback: BodyResponseCallback[Schema$ListFindingTypeStatsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingtypestatsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListFindingTypeStatsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingtypestatsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListFindingTypeStatsResponse]
  ): Unit = js.native
}

