package typingsSlinky.atOctokitRest

import typingsSlinky.atOctokitRest.atOctokitRestMod.Endpoint
import typingsSlinky.atOctokitRest.atOctokitRestMod.EndpointOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.RequestOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.Response
import typingsSlinky.atOctokitRest.atOctokitRestMod.TeamsCreateParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.TeamsCreateParamsDeprecatedPermission
import typingsSlinky.atOctokitRest.atOctokitRestMod.TeamsCreateResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsPromiseRequestOptionsResponseTeamsCreateParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[TeamsCreateResponse]] = js.native
  def apply(params: RequestOptions with (TeamsCreateParams | TeamsCreateParamsDeprecatedPermission)): js.Promise[Response[TeamsCreateResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

