package typingsSlinky.d3pie

import typingsSlinky.d3pie.d3pieStrings.back
import typingsSlinky.d3pie.d3pieStrings.bounce
import typingsSlinky.d3pie.d3pieStrings.elastic
import typingsSlinky.d3pie.d3pieStrings.linear
import typingsSlinky.d3pie.d3pieStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Back extends js.Object {
  var effect: js.UndefOr[none | linear | bounce | elastic | back] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object Anon_Back {
  @scala.inline
  def apply(
    effect: none | linear | bounce | elastic | back = null,
    size: Int | Double = null,
    speed: Int | Double = null
  ): Anon_Back = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Back]
  }
}

