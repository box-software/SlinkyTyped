package typingsSlinky.falcorDashRouter.falcorDashRouterMod

import typingsSlinky.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.JSONGraph
import typingsSlinky.rxDashLiteDashAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.falcorDashRouter.falcorDashRouterMod.GetRoute
  - typings.falcorDashRouter.falcorDashRouterMod.SetRoute
  - typings.falcorDashRouter.falcorDashRouterMod.CallRoute
*/
trait RouteDefinition extends js.Object

object RouteDefinition {
  @scala.inline
  def GetRoute(
    get: RoutePathSet => RouteResult | js.Promise[RouteResult] | Observable[RouteResult],
    route: String
  ): RouteDefinition = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteDefinition]
  }
  @scala.inline
  def SetRoute(route: String, set: JSONGraph => RouteResult | js.Promise[RouteResult] | Observable[RouteResult]): RouteDefinition = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[RouteDefinition]
  }
  @scala.inline
  def CallRoute(
    call: (RoutePathSet, js.Array[_]) => CallRouteResult | js.Promise[CallRouteResult] | Observable[CallRouteResult],
    route: String
  ): RouteDefinition = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call), route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteDefinition]
  }
}

