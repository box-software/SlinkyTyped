package typingsSlinky.agDashGrid.agDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "ColumnGroup")
@js.native
class ColumnGroup protected ()
  extends typingsSlinky.agDashGrid.distLibEntitiesColumnGroupMod.ColumnGroup {
  def this(
    originalColumnGroup: typingsSlinky.agDashGrid.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup,
    groupId: String,
    instanceId: Double
  ) = this()
}

/* static members */
@JSImport("ag-grid", "ColumnGroup")
@js.native
object ColumnGroup extends js.Object {
  var EVENT_DISPLAYED_CHILDREN_CHANGED: String = js.native
  var EVENT_LEFT_CHANGED: String = js.native
  var HEADER_GROUP_SHOW_CLOSED: String = js.native
  var HEADER_GROUP_SHOW_OPEN: String = js.native
  def createUniqueId(groupId: String, instanceId: Double): String = js.native
}

