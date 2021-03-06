package typingsSlinky.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Clusters")
@js.native
class ResourceDollarProjectsDollarHistoriesDollarExecutionsDollarClusters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * toolresults.projects.histories.executions.clusters.get
    * @desc Retrieves a single screenshot cluster by its ID
    * @alias toolresults.projects.histories.executions.clusters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId A Cluster id  Required.
    * @param {string} params.executionId An Execution id.  Required.
    * @param {string} params.historyId A History id.  Required.
    * @param {string} params.projectId A Project id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ScreenshotCluster] = js.native
  def get(callback: BodyResponseCallback[Schema$ScreenshotCluster]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarClustersDollarGet): GaxiosPromise[Schema$ScreenshotCluster] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarClustersDollarGet,
    callback: BodyResponseCallback[Schema$ScreenshotCluster]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarClustersDollarGet,
    options: BodyResponseCallback[Schema$ScreenshotCluster],
    callback: BodyResponseCallback[Schema$ScreenshotCluster]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarClustersDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$ScreenshotCluster] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarClustersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ScreenshotCluster]
  ): Unit = js.native
  /**
    * toolresults.projects.histories.executions.clusters.list
    * @desc Lists Screenshot Clusters  Returns the list of screenshot clusters
    * corresponding to an execution. Screenshot clusters are created after the
    * execution is finished. Clusters are created from a set of screenshots.
    * Between any two screenshots, a matching score is calculated based off
    * their metadata that determines how similar they are. Screenshots are
    * placed in the cluster that has screens which have the highest matching
    * scores.
    * @alias toolresults.projects.histories.executions.clusters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId An Execution id.  Required.
    * @param {string} params.historyId A History id.  Required.
    * @param {string} params.projectId A Project id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListScreenshotClustersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListScreenshotClustersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarClustersDollarList): GaxiosPromise[Schema$ListScreenshotClustersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarClustersDollarList,
    callback: BodyResponseCallback[Schema$ListScreenshotClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarClustersDollarList,
    options: BodyResponseCallback[Schema$ListScreenshotClustersResponse],
    callback: BodyResponseCallback[Schema$ListScreenshotClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarClustersDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListScreenshotClustersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarClustersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListScreenshotClustersResponse]
  ): Unit = js.native
}

