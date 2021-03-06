package typingsSlinky.zrender

import typingsSlinky.zrender.zrender.ColorStops
import typingsSlinky.zrender.zrender.GlobalCoords
import typingsSlinky.zrender.zrender.X
import typingsSlinky.zrender.zrender.X2
import typingsSlinky.zrender.zrender.Y
import typingsSlinky.zrender.zrender.Y2
import typingsSlinky.zrender.zrenderStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddColorStop extends js.Object {
  var colorStops: ColorStops
  var globalCoord: GlobalCoords
  var `type`: linear
  var x: X
  var x2: X2
  var y: Y
  var y2: Y2
  def addColorStop(offset: Double, color: String): Unit
}

object Anon_AddColorStop {
  @scala.inline
  def apply(
    addColorStop: (Double, String) => Unit,
    colorStops: ColorStops,
    globalCoord: GlobalCoords,
    `type`: linear,
    x: X,
    x2: X2,
    y: Y,
    y2: Y2
  ): Anon_AddColorStop = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop), colorStops = colorStops.asInstanceOf[js.Any], globalCoord = globalCoord.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddColorStop]
  }
}

