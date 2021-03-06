package typingsSlinky.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigquerydatatransfer/v1", "bigquerydatatransfer_v1.Resource$Projects$Transferconfigs$Runs$Transferlogs")
@js.native
class ResourceDollarProjectsDollarTransferconfigsDollarRunsDollarTransferlogs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * bigquerydatatransfer.projects.transferConfigs.runs.transferLogs.list
    * @desc Returns user facing log messages for the data transfer run.
    * @alias
    * bigquerydatatransfer.projects.transferConfigs.runs.transferLogs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.messageTypes Message types to return. If not populated - INFO, WARNING and ERROR messages are returned.
    * @param {integer=} params.pageSize Page size. The default page size is the maximum value of 1000 results.
    * @param {string=} params.pageToken Pagination token, which can be used to request a specific page of `ListTransferLogsRequest` list results. For multiple-page results, `ListTransferLogsResponse` outputs a `next_page` token, which can be used as the `page_token` value to request the next page of list results.
    * @param {string} params.parent Transfer run name in the form: `projects/{project_id}/transferConfigs/{config_Id}/runs/{run_id}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTransferLogsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTransferLogsResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarTransferlogsDollarList
  ): GaxiosPromise[Schema$ListTransferLogsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarTransferlogsDollarList,
    callback: BodyResponseCallback[Schema$ListTransferLogsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarTransferlogsDollarList,
    options: BodyResponseCallback[Schema$ListTransferLogsResponse],
    callback: BodyResponseCallback[Schema$ListTransferLogsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarTransferlogsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListTransferLogsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarTransferlogsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTransferLogsResponse]
  ): Unit = js.native
}

