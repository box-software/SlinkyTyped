package typingsSlinky.reactDashRange

import typingsSlinky.reactDashRange.libTypesMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowOverlap extends js.Object {
  var allowOverlap: Boolean
  var direction: Direction
  var disabled: Boolean
  var max: Double
  var min: Double
  var rtl: Boolean
  var step: Double
}

object Anon_AllowOverlap {
  @scala.inline
  def apply(
    allowOverlap: Boolean,
    direction: Direction,
    disabled: Boolean,
    max: Double,
    min: Double,
    rtl: Boolean,
    step: Double
  ): Anon_AllowOverlap = {
    val __obj = js.Dynamic.literal(allowOverlap = allowOverlap.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AllowOverlap]
  }
}

