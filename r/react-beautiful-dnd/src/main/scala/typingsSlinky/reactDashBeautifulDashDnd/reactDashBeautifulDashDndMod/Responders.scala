package typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Responders extends js.Object {
  var onBeforeCapture: js.UndefOr[OnBeforeCaptureResponder] = js.undefined
  var onBeforeDragStart: js.UndefOr[OnBeforeDragStartResponder] = js.undefined
  var onDragEnd: OnDragEndResponder
  var onDragStart: js.UndefOr[OnDragStartResponder] = js.undefined
  var onDragUpdate: js.UndefOr[OnDragUpdateResponder] = js.undefined
}

object Responders {
  @scala.inline
  def apply(
    onDragEnd: (/* result */ DropResult, /* provided */ ResponderProvided) => Unit,
    onBeforeCapture: /* before */ BeforeCapture => Unit = null,
    onBeforeDragStart: /* start */ DragStart => Unit = null,
    onDragStart: (/* start */ DragStart, /* provided */ ResponderProvided) => Unit = null,
    onDragUpdate: (/* update */ DragUpdate, /* provided */ ResponderProvided) => Unit = null
  ): Responders = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    if (onBeforeCapture != null) __obj.updateDynamic("onBeforeCapture")(js.Any.fromFunction1(onBeforeCapture))
    if (onBeforeDragStart != null) __obj.updateDynamic("onBeforeDragStart")(js.Any.fromFunction1(onBeforeDragStart))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2(onDragStart))
    if (onDragUpdate != null) __obj.updateDynamic("onDragUpdate")(js.Any.fromFunction2(onDragUpdate))
    __obj.asInstanceOf[Responders]
  }
}

