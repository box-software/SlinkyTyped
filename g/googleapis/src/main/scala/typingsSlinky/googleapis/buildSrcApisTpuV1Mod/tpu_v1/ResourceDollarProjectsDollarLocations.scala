package typingsSlinky.googleapis.buildSrcApisTpuV1Mod.tpu_v1

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tpu/v1", "tpu_v1.Resource$Projects$Locations")
@js.native
class ResourceDollarProjectsDollarLocations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var acceleratorTypes: ResourceDollarProjectsDollarLocationsDollarAcceleratortypes = js.native
  var context: APIRequestContext = js.native
  var nodes: ResourceDollarProjectsDollarLocationsDollarNodes = js.native
  var operations: ResourceDollarProjectsDollarLocationsDollarOperations = js.native
  var tensorflowVersions: ResourceDollarProjectsDollarLocationsDollarTensorflowversions = js.native
  /**
    * tpu.projects.locations.get
    * @desc Gets information about a location.
    * @alias tpu.projects.locations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name for the location.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Location] = js.native
  def get(callback: BodyResponseCallback[Schema$Location]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet): GaxiosPromise[Schema$Location] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet,
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet,
    options: BodyResponseCallback[Schema$Location],
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Location] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
  /**
    * tpu.projects.locations.list
    * @desc Lists information about the supported locations for this service.
    * @alias tpu.projects.locations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The standard list filter.
    * @param {string} params.name The resource that owns the locations collection, if applicable.
    * @param {integer=} params.pageSize The standard list page size.
    * @param {string=} params.pageToken The standard list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListLocationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListLocationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList): GaxiosPromise[Schema$ListLocationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList,
    callback: BodyResponseCallback[Schema$ListLocationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList,
    options: BodyResponseCallback[Schema$ListLocationsResponse],
    callback: BodyResponseCallback[Schema$ListLocationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListLocationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListLocationsResponse]
  ): Unit = js.native
}

