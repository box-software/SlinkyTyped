package typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.history
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.initialRoute
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationDrawerRouterConfig extends js.Object {
  var backBehavior: js.UndefOr[none | initialRoute | history] = js.undefined
  var contentComponent: js.UndefOr[ReactComponentClass[DrawerContentComponentProps]] = js.undefined
  var contentOptions: js.UndefOr[js.Object] = js.undefined
  var initialRouteName: js.UndefOr[String] = js.undefined
  var resetOnBlur: js.UndefOr[Boolean] = js.undefined
  var unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
}

object NavigationDrawerRouterConfig {
  @scala.inline
  def apply(
    backBehavior: none | initialRoute | history = null,
    contentComponent: ReactComponentClass[DrawerContentComponentProps] = null,
    contentOptions: js.Object = null,
    initialRouteName: String = null,
    resetOnBlur: js.UndefOr[Boolean] = js.undefined,
    unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
  ): NavigationDrawerRouterConfig = {
    val __obj = js.Dynamic.literal()
    if (backBehavior != null) __obj.updateDynamic("backBehavior")(backBehavior.asInstanceOf[js.Any])
    if (contentComponent != null) __obj.updateDynamic("contentComponent")(contentComponent.asInstanceOf[js.Any])
    if (contentOptions != null) __obj.updateDynamic("contentOptions")(contentOptions.asInstanceOf[js.Any])
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnBlur)) __obj.updateDynamic("resetOnBlur")(resetOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountInactiveRoutes)) __obj.updateDynamic("unmountInactiveRoutes")(unmountInactiveRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerRouterConfig]
  }
}

