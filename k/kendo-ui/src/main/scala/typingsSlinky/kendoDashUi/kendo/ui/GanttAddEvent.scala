package typingsSlinky.kendoDashUi.kendo.ui

import typingsSlinky.kendoDashUi.kendo.data.GanttDependency
import typingsSlinky.kendoDashUi.kendo.data.GanttTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttAddEvent extends GanttEvent {
  var dependency: js.UndefOr[GanttDependency] = js.undefined
  var task: js.UndefOr[GanttTask] = js.undefined
}

object GanttAddEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Gantt,
    dependency: GanttDependency = null,
    task: GanttTask = null
  ): GanttAddEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (dependency != null) __obj.updateDynamic("dependency")(dependency.asInstanceOf[js.Any])
    if (task != null) __obj.updateDynamic("task")(task.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttAddEvent]
  }
}

