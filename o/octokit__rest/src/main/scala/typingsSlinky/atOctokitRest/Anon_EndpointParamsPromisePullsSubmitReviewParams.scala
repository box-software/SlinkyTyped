package typingsSlinky.atOctokitRest

import typingsSlinky.atOctokitRest.atOctokitRestMod.Endpoint
import typingsSlinky.atOctokitRest.atOctokitRestMod.EndpointOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.PullsSubmitReviewParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.PullsSubmitReviewParamsDeprecatedNumber
import typingsSlinky.atOctokitRest.atOctokitRestMod.PullsSubmitReviewResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.RequestOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsPromisePullsSubmitReviewParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[PullsSubmitReviewResponse]] = js.native
  def apply(params: RequestOptions with (PullsSubmitReviewParams | PullsSubmitReviewParamsDeprecatedNumber)): js.Promise[Response[PullsSubmitReviewResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

