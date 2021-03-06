package typingsSlinky.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Remarketinglists")
@js.native
class Resource$Remarketinglists protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.remarketingLists.get
    * @desc Gets one remarketing list by ID.
    * @alias dfareporting.remarketingLists.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Remarketing list ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$RemarketingList] = js.native
  def get(callback: BodyResponseCallback[Schema$RemarketingList]): Unit = js.native
  def get(params: ParamsDollarResourceDollarRemarketinglistsDollarGet): GaxiosPromise[Schema$RemarketingList] = js.native
  def get(
    params: ParamsDollarResourceDollarRemarketinglistsDollarGet,
    callback: BodyResponseCallback[Schema$RemarketingList]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRemarketinglistsDollarGet,
    options: BodyResponseCallback[Schema$RemarketingList],
    callback: BodyResponseCallback[Schema$RemarketingList]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRemarketinglistsDollarGet, options: MethodOptions): GaxiosPromise[Schema$RemarketingList] = js.native
  def get(
    params: ParamsDollarResourceDollarRemarketinglistsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RemarketingList]
  ): Unit = js.native
  /**
    * dfareporting.remarketingLists.insert
    * @desc Inserts a new remarketing list.
    * @alias dfareporting.remarketingLists.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().RemarketingList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$RemarketingList] = js.native
  def insert(callback: BodyResponseCallback[Schema$RemarketingList]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRemarketinglistsDollarInsert): GaxiosPromise[Schema$RemarketingList] = js.native
  def insert(
    params: ParamsDollarResourceDollarRemarketinglistsDollarInsert,
    callback: BodyResponseCallback[Schema$RemarketingList]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarRemarketinglistsDollarInsert,
    options: BodyResponseCallback[Schema$RemarketingList],
    callback: BodyResponseCallback[Schema$RemarketingList]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRemarketinglistsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$RemarketingList] = js.native
  def insert(
    params: ParamsDollarResourceDollarRemarketinglistsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RemarketingList]
  ): Unit = js.native
  /**
    * dfareporting.remarketingLists.list
    * @desc Retrieves a list of remarketing lists, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.remarketingLists.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.active Select only active or only inactive remarketing lists.
    * @param {string} params.advertiserId Select only remarketing lists owned by this advertiser.
    * @param {string=} params.floodlightActivityId Select only remarketing lists that have this floodlight activity ID.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.name Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "remarketing list*2015" will return objects with names like "remarketing list June 2015", "remarketing list April 2015", or simply "remarketing list 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "remarketing list" will match objects with name "my remarketing list", "remarketing list 2015", or simply "remarketing list".
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$RemarketingListsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$RemarketingListsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarRemarketinglistsDollarList): GaxiosPromise[Schema$RemarketingListsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarRemarketinglistsDollarList,
    callback: BodyResponseCallback[Schema$RemarketingListsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarRemarketinglistsDollarList,
    options: BodyResponseCallback[Schema$RemarketingListsListResponse],
    callback: BodyResponseCallback[Schema$RemarketingListsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarRemarketinglistsDollarList, options: MethodOptions): GaxiosPromise[Schema$RemarketingListsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarRemarketinglistsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RemarketingListsListResponse]
  ): Unit = js.native
  /**
    * dfareporting.remarketingLists.patch
    * @desc Updates an existing remarketing list. This method supports patch
    * semantics.
    * @alias dfareporting.remarketingLists.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Remarketing list ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().RemarketingList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$RemarketingList] = js.native
  def patch(callback: BodyResponseCallback[Schema$RemarketingList]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarRemarketinglistsDollarPatch): GaxiosPromise[Schema$RemarketingList] = js.native
  def patch(
    params: ParamsDollarResourceDollarRemarketinglistsDollarPatch,
    callback: BodyResponseCallback[Schema$RemarketingList]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarRemarketinglistsDollarPatch,
    options: BodyResponseCallback[Schema$RemarketingList],
    callback: BodyResponseCallback[Schema$RemarketingList]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarRemarketinglistsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$RemarketingList] = js.native
  def patch(
    params: ParamsDollarResourceDollarRemarketinglistsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RemarketingList]
  ): Unit = js.native
  /**
    * dfareporting.remarketingLists.update
    * @desc Updates an existing remarketing list.
    * @alias dfareporting.remarketingLists.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().RemarketingList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$RemarketingList] = js.native
  def update(callback: BodyResponseCallback[Schema$RemarketingList]): Unit = js.native
  def update(params: ParamsDollarResourceDollarRemarketinglistsDollarUpdate): GaxiosPromise[Schema$RemarketingList] = js.native
  def update(
    params: ParamsDollarResourceDollarRemarketinglistsDollarUpdate,
    callback: BodyResponseCallback[Schema$RemarketingList]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarRemarketinglistsDollarUpdate,
    options: BodyResponseCallback[Schema$RemarketingList],
    callback: BodyResponseCallback[Schema$RemarketingList]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarRemarketinglistsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$RemarketingList] = js.native
  def update(
    params: ParamsDollarResourceDollarRemarketinglistsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RemarketingList]
  ): Unit = js.native
}

