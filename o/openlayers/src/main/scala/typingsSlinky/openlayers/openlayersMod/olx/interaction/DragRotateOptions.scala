package typingsSlinky.openlayers.openlayersMod.olx.interaction

import typingsSlinky.openlayers.openlayersMod.EventsConditionType
import typingsSlinky.openlayers.openlayersMod.MapBrowserEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragRotateOptions extends js.Object {
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object DragRotateOptions {
  @scala.inline
  def apply(condition: /* event */ MapBrowserEvent => Boolean = null, duration: Int | Double = null): DragRotateOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1(condition))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragRotateOptions]
  }
}

