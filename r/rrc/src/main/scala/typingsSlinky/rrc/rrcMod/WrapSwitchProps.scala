package typingsSlinky.rrc.rrcMod

import typingsSlinky.history.historyMod.Location
import typingsSlinky.history.historyMod.LocationDescriptorObject
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashRouter.reactDashRouterMod.`match`
import typingsSlinky.rrc.Anon_Pathname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapSwitchProps[Params] extends SwitchProps {
  var getKey: js.UndefOr[GetKeyFunction[Params]] = js.undefined
}

object WrapSwitchProps {
  @scala.inline
  def apply[Params](
    location: LocationDescriptorObject[LocationState] with Anon_Pathname,
    routes: js.Array[RouteConfiguration],
    getKey: (/* match */ `match`[Params], /* route */ RouteConfiguration, /* location */ Location[LocationState]) => String = null
  ): WrapSwitchProps[Params] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction3(getKey))
    __obj.asInstanceOf[WrapSwitchProps[Params]]
  }
}

