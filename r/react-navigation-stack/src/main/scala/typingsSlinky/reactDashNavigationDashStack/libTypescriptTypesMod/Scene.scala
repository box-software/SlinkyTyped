package typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod

import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationDescriptor
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  var descriptor: NavigationDescriptor[
    NavigationParams, 
    NavigationStackOptions, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ]
  var index: Double
  var isActive: Boolean
  var isStale: Boolean
  var key: String
  var route: NavigationRoute[NavigationParams]
}

object Scene {
  @scala.inline
  def apply(
    descriptor: NavigationDescriptor[
      NavigationParams, 
      NavigationStackOptions, 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
    ],
    index: Double,
    isActive: Boolean,
    isStale: Boolean,
    key: String,
    route: NavigationRoute[NavigationParams]
  ): Scene = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isStale = isStale.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Scene]
  }
}

