package typingsSlinky.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Clients$Users")
@js.native
class ResourceDollarAccountsDollarClientsDollarUsers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer2.accounts.clients.users.get
    * @desc Retrieves an existing client user.
    * @alias adexchangebuyer2.accounts.clients.users.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Numerical account ID of the client's sponsor buyer. (required)
    * @param {string} params.clientAccountId Numerical account ID of the client buyer that the user to be retrieved is associated with. (required)
    * @param {string} params.userId Numerical identifier of the user to retrieve. (required)
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ClientUser] = js.native
  def get(callback: BodyResponseCallback[Schema$ClientUser]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarGet): GaxiosPromise[Schema$ClientUser] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarGet,
    callback: BodyResponseCallback[Schema$ClientUser]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarGet,
    options: BodyResponseCallback[Schema$ClientUser],
    callback: BodyResponseCallback[Schema$ClientUser]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$ClientUser] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ClientUser]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.clients.users.list
    * @desc Lists all the known client users for a specified sponsor buyer
    * account ID.
    * @alias adexchangebuyer2.accounts.clients.users.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Numerical account ID of the sponsor buyer of the client to list users for. (required)
    * @param {string} params.clientAccountId The account ID of the client buyer to list users for. (required) You must specify either a string representation of a numerical account identifier or the `-` character to list all the client users for all the clients of a given sponsor buyer.
    * @param {integer=} params.pageSize Requested page size. The server may return fewer clients than requested. If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListClientUsersResponse.nextPageToken returned from the previous call to the accounts.clients.users.list method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListClientUsersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListClientUsersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarList): GaxiosPromise[Schema$ListClientUsersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarList,
    callback: BodyResponseCallback[Schema$ListClientUsersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarList,
    options: BodyResponseCallback[Schema$ListClientUsersResponse],
    callback: BodyResponseCallback[Schema$ListClientUsersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListClientUsersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListClientUsersResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.clients.users.update
    * @desc Updates an existing client user. Only the user status can be
    * changed on update.
    * @alias adexchangebuyer2.accounts.clients.users.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Numerical account ID of the client's sponsor buyer. (required)
    * @param {string} params.clientAccountId Numerical account ID of the client buyer that the user to be retrieved is associated with. (required)
    * @param {string} params.userId Numerical identifier of the user to retrieve. (required)
    * @param {().ClientUser} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ClientUser] = js.native
  def update(callback: BodyResponseCallback[Schema$ClientUser]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarUpdate): GaxiosPromise[Schema$ClientUser] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarUpdate,
    callback: BodyResponseCallback[Schema$ClientUser]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarUpdate,
    options: BodyResponseCallback[Schema$ClientUser],
    callback: BodyResponseCallback[Schema$ClientUser]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$ClientUser] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUsersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ClientUser]
  ): Unit = js.native
}

