package typingsSlinky.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Forwardingrules")
@js.native
class Resource$Forwardingrules protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.forwardingRules.aggregatedList
    * @desc Retrieves an aggregated list of forwarding rules.
    * @alias compute.forwardingRules.aggregatedList
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def aggregatedList(): GaxiosPromise[Schema$ForwardingRuleAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[Schema$ForwardingRuleAggregatedList]): Unit = js.native
  def aggregatedList(params: ParamsDollarResourceDollarForwardingrulesDollarAggregatedlist): GaxiosPromise[Schema$ForwardingRuleAggregatedList] = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarForwardingrulesDollarAggregatedlist,
    callback: BodyResponseCallback[Schema$ForwardingRuleAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarForwardingrulesDollarAggregatedlist,
    options: BodyResponseCallback[Schema$ForwardingRuleAggregatedList],
    callback: BodyResponseCallback[Schema$ForwardingRuleAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsDollarResourceDollarForwardingrulesDollarAggregatedlist, options: MethodOptions): GaxiosPromise[Schema$ForwardingRuleAggregatedList] = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarForwardingrulesDollarAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ForwardingRuleAggregatedList]
  ): Unit = js.native
  /**
    * compute.forwardingRules.delete
    * @desc Deletes the specified ForwardingRule resource.
    * @alias compute.forwardingRules.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.forwardingRule Name of the ForwardingRule resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarForwardingrulesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarForwardingrulesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarForwardingrulesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarForwardingrulesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarForwardingrulesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.forwardingRules.get
    * @desc Returns the specified ForwardingRule resource.
    * @alias compute.forwardingRules.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.forwardingRule Name of the ForwardingRule resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ForwardingRule] = js.native
  def get(callback: BodyResponseCallback[Schema$ForwardingRule]): Unit = js.native
  def get(params: ParamsDollarResourceDollarForwardingrulesDollarGet): GaxiosPromise[Schema$ForwardingRule] = js.native
  def get(
    params: ParamsDollarResourceDollarForwardingrulesDollarGet,
    callback: BodyResponseCallback[Schema$ForwardingRule]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarForwardingrulesDollarGet,
    options: BodyResponseCallback[Schema$ForwardingRule],
    callback: BodyResponseCallback[Schema$ForwardingRule]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarForwardingrulesDollarGet, options: MethodOptions): GaxiosPromise[Schema$ForwardingRule] = js.native
  def get(
    params: ParamsDollarResourceDollarForwardingrulesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ForwardingRule]
  ): Unit = js.native
  /**
    * compute.forwardingRules.insert
    * @desc Creates a ForwardingRule resource in the specified project and
    * region using the data included in the request.
    * @alias compute.forwardingRules.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().ForwardingRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarForwardingrulesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarForwardingrulesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarForwardingrulesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarForwardingrulesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarForwardingrulesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.forwardingRules.list
    * @desc Retrieves a list of ForwardingRule resources available to the
    * specified project and region.
    * @alias compute.forwardingRules.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ForwardingRuleList] = js.native
  def list(callback: BodyResponseCallback[Schema$ForwardingRuleList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarForwardingrulesDollarList): GaxiosPromise[Schema$ForwardingRuleList] = js.native
  def list(
    params: ParamsDollarResourceDollarForwardingrulesDollarList,
    callback: BodyResponseCallback[Schema$ForwardingRuleList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarForwardingrulesDollarList,
    options: BodyResponseCallback[Schema$ForwardingRuleList],
    callback: BodyResponseCallback[Schema$ForwardingRuleList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarForwardingrulesDollarList, options: MethodOptions): GaxiosPromise[Schema$ForwardingRuleList] = js.native
  def list(
    params: ParamsDollarResourceDollarForwardingrulesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ForwardingRuleList]
  ): Unit = js.native
  /**
    * compute.forwardingRules.patch
    * @desc Updates the specified forwarding rule with the data included in the
    * request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules. Currently, you can only patch the
    * network_tier field.
    * @alias compute.forwardingRules.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.forwardingRule Name of the ForwardingRule resource to patch.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().ForwardingRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarForwardingrulesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarForwardingrulesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarForwardingrulesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarForwardingrulesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarForwardingrulesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.forwardingRules.setLabels
    * @desc Sets the labels on the specified resource. To learn more about
    * labels, read the Labeling Resources documentation.
    * @alias compute.forwardingRules.setLabels
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region The region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().RegionSetLabelsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setLabels(): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setLabels(params: ParamsDollarResourceDollarForwardingrulesDollarSetlabels): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(
    params: ParamsDollarResourceDollarForwardingrulesDollarSetlabels,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLabels(
    params: ParamsDollarResourceDollarForwardingrulesDollarSetlabels,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLabels(params: ParamsDollarResourceDollarForwardingrulesDollarSetlabels, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(
    params: ParamsDollarResourceDollarForwardingrulesDollarSetlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.forwardingRules.setTarget
    * @desc Changes target URL for forwarding rule. The new target should be of
    * the same type as the old target.
    * @alias compute.forwardingRules.setTarget
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.forwardingRule Name of the ForwardingRule resource in which target is to be set.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().TargetReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setTarget(): GaxiosPromise[Schema$Operation] = js.native
  def setTarget(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setTarget(params: ParamsDollarResourceDollarForwardingrulesDollarSettarget): GaxiosPromise[Schema$Operation] = js.native
  def setTarget(
    params: ParamsDollarResourceDollarForwardingrulesDollarSettarget,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setTarget(
    params: ParamsDollarResourceDollarForwardingrulesDollarSettarget,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setTarget(params: ParamsDollarResourceDollarForwardingrulesDollarSettarget, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setTarget(
    params: ParamsDollarResourceDollarForwardingrulesDollarSettarget,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.forwardingRules.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.forwardingRules.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region The name of the region for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarForwardingrulesDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarForwardingrulesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarForwardingrulesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarForwardingrulesDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarForwardingrulesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
}

