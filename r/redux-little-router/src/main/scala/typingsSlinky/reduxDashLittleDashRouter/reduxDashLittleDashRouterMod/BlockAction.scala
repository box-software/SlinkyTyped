package typingsSlinky.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import typingsSlinky.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_BLOCK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockAction extends RouterActions {
  var payload: BlockCallback
  var `type`: ROUTER_BLOCK
}

object BlockAction {
  @scala.inline
  def apply(
    payload: (/* location */ Location, /* action */ js.UndefOr[HistoryAction]) => String,
    `type`: ROUTER_BLOCK
  ): BlockAction = {
    val __obj = js.Dynamic.literal(payload = js.Any.fromFunction2(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockAction]
  }
}

