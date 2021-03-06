package typingsSlinky.googleapis.buildSrcApisVideointelligenceV1p3beta1Mod.videointelligence_v1p3beta1

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/videointelligence/v1p3beta1", "videointelligence_v1p3beta1.Resource$Videos")
@js.native
class Resource$Videos protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * videointelligence.videos.annotate
    * @desc Performs asynchronous video annotation. Progress and results can be
    * retrieved through the `google.longrunning.Operations` interface.
    * `Operation.metadata` contains `AnnotateVideoProgress` (progress).
    * `Operation.response` contains `AnnotateVideoResponse` (results).
    * @alias videointelligence.videos.annotate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GoogleCloudVideointelligenceV1p3beta1_AnnotateVideoRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def annotate(): GaxiosPromise[Schema$GoogleLongrunning_Operation] = js.native
  def annotate(callback: BodyResponseCallback[Schema$GoogleLongrunning_Operation]): Unit = js.native
  def annotate(params: ParamsDollarResourceDollarVideosDollarAnnotate): GaxiosPromise[Schema$GoogleLongrunning_Operation] = js.native
  def annotate(
    params: ParamsDollarResourceDollarVideosDollarAnnotate,
    callback: BodyResponseCallback[Schema$GoogleLongrunning_Operation]
  ): Unit = js.native
  def annotate(
    params: ParamsDollarResourceDollarVideosDollarAnnotate,
    options: BodyResponseCallback[Schema$GoogleLongrunning_Operation],
    callback: BodyResponseCallback[Schema$GoogleLongrunning_Operation]
  ): Unit = js.native
  def annotate(params: ParamsDollarResourceDollarVideosDollarAnnotate, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunning_Operation] = js.native
  def annotate(
    params: ParamsDollarResourceDollarVideosDollarAnnotate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunning_Operation]
  ): Unit = js.native
}

