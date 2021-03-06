package typingsSlinky.snapsvg.snapsvgMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var attr: StringDictionary[String | Double | Boolean | js.Any]
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var duration: Double
  var easing: js.UndefOr[js.Function1[/* num */ Double, Double]] = js.undefined
}

object Animation {
  @scala.inline
  def apply(
    attr: StringDictionary[String | Double | Boolean | js.Any],
    duration: Double,
    callback: () => Unit = null,
    easing: /* num */ Double => Double = null
  ): Animation = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    __obj.asInstanceOf[Animation]
  }
}

@JSImport("snapsvg", "animation")
@js.native
object animation extends js.Object {
  def apply(attr: js.Object, duration: Double): Animation = js.native
  def apply(attr: js.Object, duration: Double, easing: js.Function1[/* num */ Double, Double]): Animation = js.native
  def apply(
    attr: js.Object,
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): Animation = js.native
}

