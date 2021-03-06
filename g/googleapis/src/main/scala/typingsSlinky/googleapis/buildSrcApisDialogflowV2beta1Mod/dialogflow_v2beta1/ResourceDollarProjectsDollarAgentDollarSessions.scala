package typingsSlinky.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Agent$Sessions")
@js.native
class ResourceDollarProjectsDollarAgentDollarSessions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var contexts: ResourceDollarProjectsDollarAgentDollarSessionsDollarContexts = js.native
  var entityTypes: ResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypes = js.native
  /**
    * dialogflow.projects.agent.sessions.deleteContexts
    * @desc Deletes all active contexts in the specified session.
    * @alias dialogflow.projects.agent.sessions.deleteContexts
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the session to delete all contexts from. Format: `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>`. If `Environment ID` is not specified we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteContexts(): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def deleteContexts(callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]): Unit = js.native
  def deleteContexts(params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarDeletecontexts): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def deleteContexts(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarDeletecontexts,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def deleteContexts(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarDeletecontexts,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def deleteContexts(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarDeletecontexts,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def deleteContexts(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarDeletecontexts,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.sessions.detectIntent
    * @desc Processes a natural language query and returns structured,
    * actionable data as a result. This method is not idempotent, because it
    * may cause contexts and session entity types to be updated, which in turn
    * might affect results of future queries.
    * @alias dialogflow.projects.agent.sessions.detectIntent
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.session Required. The name of the session this query is sent to. Format: `projects/<Project ID>/agent/sessions/<Session ID>`, or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we are using "-". It’s up to the API caller to choose an appropriate `Session ID` and `User Id`. They can be a random numbers or some type of user and session identifiers (preferably hashed). The length of the `Session ID` and `User ID` must not exceed 36 characters.
    * @param {().GoogleCloudDialogflowV2beta1DetectIntentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def detectIntent(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse] = js.native
  def detectIntent(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse]): Unit = js.native
  def detectIntent(params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarDetectintent): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse] = js.native
  def detectIntent(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarDetectintent,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse]
  ): Unit = js.native
  def detectIntent(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarDetectintent,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse]
  ): Unit = js.native
  def detectIntent(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarDetectintent,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse] = js.native
  def detectIntent(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarDetectintent,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse]
  ): Unit = js.native
}

