package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`thumb-drag`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.drag
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSliderThumbDragEvent extends js.Object {
  var index: Double
  var state: start | drag
  var `type`: `thumb-drag`
  var value: Double
}

object SizeSliderThumbDragEvent {
  @scala.inline
  def apply(index: Double, state: start | drag, `type`: `thumb-drag`, value: Double): SizeSliderThumbDragEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSliderThumbDragEvent]
  }
}

