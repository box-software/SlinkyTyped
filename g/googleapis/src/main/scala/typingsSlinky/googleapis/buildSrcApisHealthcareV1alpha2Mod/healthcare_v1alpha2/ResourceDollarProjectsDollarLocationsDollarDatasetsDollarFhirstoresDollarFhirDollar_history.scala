package typingsSlinky.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha2", "healthcare_v1alpha2.Resource$Projects$Locations$Datasets$Fhirstores$Fhir$_history")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_history protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir._history.get
    * @desc Gets a version (current or historical) of FHIR resource by version
    * id.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir._history.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the resource version to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$HttpBody] = js.native
  def get(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_historyDollarGet
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_historyDollarGet,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_historyDollarGet,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_historyDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_historyDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir._history.list
    * @desc Lists all the versions of a resource (including the current version
    * and deleted versions) from the FHIR store.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir._history.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.at Only include resource versions that were current at some point during the time period specified in the date time value. The date parameter format is yyyy-mm-ddThh:mm:ss[Z|(+|-)hh:mm] Clients may specify any of the following: An entire year: `_at=2019` An entire month: `_at=2019-01` A specific day: `_at=2019-01-20` A specific second: `_at=2018-12-31T23:59:58Z`
    * @param {integer=} params.count The maximum number of search results on a page.
    * @param {string} params.name The name of the resource to retrieve.
    * @param {string=} params.page Used to retrieve the first, previous, next, or last page of resource versions when using pagination. Value should be set to the value of the `link.url` field returned in the response to the previous request, where `link.relation` is "first", "previous", "next" or "last". Omit `page` if no previous request has been made.
    * @param {string=} params.since Only include resource versions that were created at or after the given instant in time. The instant in time uses the format YYYY-MM-DDThh:mm:ss.sss+zz:zz (for example 2015-02-07T13:28:17.239+02:00 or 2017-01-01T00:00:00Z). The time must be specified to the second and include a time zone.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$HttpBody] = js.native
  def list(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_historyDollarList
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_historyDollarList,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_historyDollarList,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_historyDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_historyDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
}

