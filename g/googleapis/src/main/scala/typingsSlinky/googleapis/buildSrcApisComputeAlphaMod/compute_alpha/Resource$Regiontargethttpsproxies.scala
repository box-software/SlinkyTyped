package typingsSlinky.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Regiontargethttpsproxies")
@js.native
class Resource$Regiontargethttpsproxies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.regionTargetHttpsProxies.delete
    * @desc Deletes the specified TargetHttpsProxy resource.
    * @alias compute.regionTargetHttpsProxies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpsProxies.get
    * @desc Returns the specified TargetHttpsProxy resource in the specified
    * region. Gets a list of available target HTTP proxies by making a list()
    * request.
    * @alias compute.regionTargetHttpsProxies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$TargetHttpsProxy] = js.native
  def get(callback: BodyResponseCallback[Schema$TargetHttpsProxy]): Unit = js.native
  def get(params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarGet): GaxiosPromise[Schema$TargetHttpsProxy] = js.native
  def get(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarGet,
    callback: BodyResponseCallback[Schema$TargetHttpsProxy]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarGet,
    options: BodyResponseCallback[Schema$TargetHttpsProxy],
    callback: BodyResponseCallback[Schema$TargetHttpsProxy]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarGet, options: MethodOptions): GaxiosPromise[Schema$TargetHttpsProxy] = js.native
  def get(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TargetHttpsProxy]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpsProxies.insert
    * @desc Creates a TargetHttpsProxy resource in the specified project and
    * region using the data included in the request.
    * @alias compute.regionTargetHttpsProxies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().TargetHttpsProxy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpsProxies.list
    * @desc Retrieves the list of TargetHttpsProxy resources available to the
    * specified project in the specified region.
    * @alias compute.regionTargetHttpsProxies.list
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
  def list(): GaxiosPromise[Schema$TargetHttpsProxyList] = js.native
  def list(callback: BodyResponseCallback[Schema$TargetHttpsProxyList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarList): GaxiosPromise[Schema$TargetHttpsProxyList] = js.native
  def list(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarList,
    callback: BodyResponseCallback[Schema$TargetHttpsProxyList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarList,
    options: BodyResponseCallback[Schema$TargetHttpsProxyList],
    callback: BodyResponseCallback[Schema$TargetHttpsProxyList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarList, options: MethodOptions): GaxiosPromise[Schema$TargetHttpsProxyList] = js.native
  def list(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TargetHttpsProxyList]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpsProxies.setSslCertificates
    * @desc Replaces SslCertificates for TargetHttpsProxy.
    * @alias compute.regionTargetHttpsProxies.setSslCertificates
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource to set an SslCertificates resource for.
    * @param {().RegionTargetHttpsProxiesSetSslCertificatesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setSslCertificates(): GaxiosPromise[Schema$Operation] = js.native
  def setSslCertificates(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setSslCertificates(params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarSetsslcertificates): GaxiosPromise[Schema$Operation] = js.native
  def setSslCertificates(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarSetsslcertificates,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setSslCertificates(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarSetsslcertificates,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setSslCertificates(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarSetsslcertificates,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setSslCertificates(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarSetsslcertificates,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpsProxies.setUrlMap
    * @desc Changes the URL map for TargetHttpsProxy.
    * @alias compute.regionTargetHttpsProxies.setUrlMap
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy to set a URL map for.
    * @param {().UrlMapReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setUrlMap(): GaxiosPromise[Schema$Operation] = js.native
  def setUrlMap(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setUrlMap(params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarSeturlmap): GaxiosPromise[Schema$Operation] = js.native
  def setUrlMap(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarSeturlmap,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setUrlMap(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarSeturlmap,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setUrlMap(params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarSeturlmap, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setUrlMap(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarSeturlmap,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpsProxies.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.regionTargetHttpsProxies.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegiontargethttpsproxiesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
}

