package typingsSlinky.reactDashBreadcrumbs.reactDashBreadcrumbsMod

import typingsSlinky.history.historyMod.LocationDescriptor
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashBreadcrumbs.Anon_Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps extends js.Object {
  var data: LocationDescriptor[LocationState] with Anon_Title
  var hidden: js.UndefOr[Boolean] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(
    data: LocationDescriptor[LocationState] with Anon_Title,
    hidden: js.UndefOr[Boolean] = js.undefined
  ): BreadcrumbProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

