package typingsSlinky.uiDashGrid.uiDashGridMod.cellNav

import typingsSlinky.uiDashGrid.Anon_CLEAR
import typingsSlinky.uiDashGrid.Anon_DOWNLEFT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiGridCellNavConstants extends js.Object {
  var CELL_NAV_EVENT: String
  var EVENT_TYPE: Anon_CLEAR
  var FEATURE_NAME: String
  var direction: Anon_DOWNLEFT
}

object IUiGridCellNavConstants {
  @scala.inline
  def apply(CELL_NAV_EVENT: String, EVENT_TYPE: Anon_CLEAR, FEATURE_NAME: String, direction: Anon_DOWNLEFT): IUiGridCellNavConstants = {
    val __obj = js.Dynamic.literal(CELL_NAV_EVENT = CELL_NAV_EVENT.asInstanceOf[js.Any], EVENT_TYPE = EVENT_TYPE.asInstanceOf[js.Any], FEATURE_NAME = FEATURE_NAME.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUiGridCellNavConstants]
  }
}

