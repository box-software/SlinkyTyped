package typingsSlinky.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnLockEvent extends TreeListEvent {
  var column: js.UndefOr[js.Any] = js.undefined
}

object TreeListColumnLockEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    column: js.Any = null
  ): TreeListColumnLockEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumnLockEvent]
  }
}

