package typingsSlinky.reactDashQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForceIncludeInactive extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var includeInactive: Boolean
}

object Anon_ForceIncludeInactive {
  @scala.inline
  def apply(includeInactive: Boolean, force: js.UndefOr[Boolean] = js.undefined): Anon_ForceIncludeInactive = {
    val __obj = js.Dynamic.literal(includeInactive = includeInactive.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForceIncludeInactive]
  }
}

