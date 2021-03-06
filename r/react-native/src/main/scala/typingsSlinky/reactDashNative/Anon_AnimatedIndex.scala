package typingsSlinky.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimatedIndex extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var index: Double
  var viewOffset: js.UndefOr[Double] = js.undefined
  var viewPosition: js.UndefOr[Double] = js.undefined
}

object Anon_AnimatedIndex {
  @scala.inline
  def apply(
    index: Double,
    animated: js.UndefOr[Boolean] = js.undefined,
    viewOffset: Int | Double = null,
    viewPosition: Int | Double = null
  ): Anon_AnimatedIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (viewOffset != null) __obj.updateDynamic("viewOffset")(viewOffset.asInstanceOf[js.Any])
    if (viewPosition != null) __obj.updateDynamic("viewPosition")(viewPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimatedIndex]
  }
}

