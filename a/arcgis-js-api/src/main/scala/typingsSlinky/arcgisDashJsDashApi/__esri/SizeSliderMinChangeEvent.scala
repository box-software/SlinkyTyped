package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`min-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSliderMinChangeEvent extends js.Object {
  var oldValue: Double
  var `type`: `min-change`
  var value: Double
}

object SizeSliderMinChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: `min-change`, value: Double): SizeSliderMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSliderMinChangeEvent]
  }
}

