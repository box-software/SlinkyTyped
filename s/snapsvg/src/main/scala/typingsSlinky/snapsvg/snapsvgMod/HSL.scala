package typingsSlinky.snapsvg.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSL extends js.Object {
  var h: Double
  var l: Double
  var s: Double
}

object HSL {
  @scala.inline
  def apply(h: Double, l: Double, s: Double): HSL = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HSL]
  }
}

@JSImport("snapsvg", "hsl")
@js.native
object hsl extends js.Object {
  def apply(h: Double, s: Double, l: Double): HSL = js.native
}

