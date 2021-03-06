package typingsSlinky.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Targetingtemplates")
@js.native
class Resource$Targetingtemplates protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.targetingTemplates.get
    * @desc Gets one targeting template by ID.
    * @alias dfareporting.targetingTemplates.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Targeting template ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$TargetingTemplate] = js.native
  def get(callback: BodyResponseCallback[Schema$TargetingTemplate]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTargetingtemplatesDollarGet): GaxiosPromise[Schema$TargetingTemplate] = js.native
  def get(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarGet,
    callback: BodyResponseCallback[Schema$TargetingTemplate]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarGet,
    options: BodyResponseCallback[Schema$TargetingTemplate],
    callback: BodyResponseCallback[Schema$TargetingTemplate]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTargetingtemplatesDollarGet, options: MethodOptions): GaxiosPromise[Schema$TargetingTemplate] = js.native
  def get(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TargetingTemplate]
  ): Unit = js.native
  /**
    * dfareporting.targetingTemplates.insert
    * @desc Inserts a new targeting template.
    * @alias dfareporting.targetingTemplates.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().TargetingTemplate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$TargetingTemplate] = js.native
  def insert(callback: BodyResponseCallback[Schema$TargetingTemplate]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTargetingtemplatesDollarInsert): GaxiosPromise[Schema$TargetingTemplate] = js.native
  def insert(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarInsert,
    callback: BodyResponseCallback[Schema$TargetingTemplate]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarInsert,
    options: BodyResponseCallback[Schema$TargetingTemplate],
    callback: BodyResponseCallback[Schema$TargetingTemplate]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTargetingtemplatesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$TargetingTemplate] = js.native
  def insert(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TargetingTemplate]
  ): Unit = js.native
  /**
    * dfareporting.targetingTemplates.list
    * @desc Retrieves a list of targeting templates, optionally filtered. This
    * method supports paging.
    * @alias dfareporting.targetingTemplates.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserId Select only targeting templates with this advertiser ID.
    * @param {string=} params.ids Select only targeting templates with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "template*2015" will return objects with names like "template June 2015", "template April 2015", or simply "template 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "template" will match objects with name "my template", "template 2015", or simply "template".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$TargetingTemplatesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$TargetingTemplatesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTargetingtemplatesDollarList): GaxiosPromise[Schema$TargetingTemplatesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarList,
    callback: BodyResponseCallback[Schema$TargetingTemplatesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarList,
    options: BodyResponseCallback[Schema$TargetingTemplatesListResponse],
    callback: BodyResponseCallback[Schema$TargetingTemplatesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTargetingtemplatesDollarList, options: MethodOptions): GaxiosPromise[Schema$TargetingTemplatesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TargetingTemplatesListResponse]
  ): Unit = js.native
  /**
    * dfareporting.targetingTemplates.patch
    * @desc Updates an existing targeting template. This method supports patch
    * semantics.
    * @alias dfareporting.targetingTemplates.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Targeting template ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().TargetingTemplate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$TargetingTemplate] = js.native
  def patch(callback: BodyResponseCallback[Schema$TargetingTemplate]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTargetingtemplatesDollarPatch): GaxiosPromise[Schema$TargetingTemplate] = js.native
  def patch(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarPatch,
    callback: BodyResponseCallback[Schema$TargetingTemplate]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarPatch,
    options: BodyResponseCallback[Schema$TargetingTemplate],
    callback: BodyResponseCallback[Schema$TargetingTemplate]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTargetingtemplatesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$TargetingTemplate] = js.native
  def patch(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TargetingTemplate]
  ): Unit = js.native
  /**
    * dfareporting.targetingTemplates.update
    * @desc Updates an existing targeting template.
    * @alias dfareporting.targetingTemplates.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().TargetingTemplate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$TargetingTemplate] = js.native
  def update(callback: BodyResponseCallback[Schema$TargetingTemplate]): Unit = js.native
  def update(params: ParamsDollarResourceDollarTargetingtemplatesDollarUpdate): GaxiosPromise[Schema$TargetingTemplate] = js.native
  def update(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarUpdate,
    callback: BodyResponseCallback[Schema$TargetingTemplate]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarUpdate,
    options: BodyResponseCallback[Schema$TargetingTemplate],
    callback: BodyResponseCallback[Schema$TargetingTemplate]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarTargetingtemplatesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$TargetingTemplate] = js.native
  def update(
    params: ParamsDollarResourceDollarTargetingtemplatesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TargetingTemplate]
  ): Unit = js.native
}

