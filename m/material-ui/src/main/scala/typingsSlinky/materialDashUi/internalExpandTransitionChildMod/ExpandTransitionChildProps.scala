package typingsSlinky.materialDashUi.internalExpandTransitionChildMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.LegacyRef
import typingsSlinky.react.reactMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandTransitionChildProps extends Props[ExpandTransitionChild] {
  var enterDelay: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionDelay: js.UndefOr[Double] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
}

object ExpandTransitionChildProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    enterDelay: Int | Double = null,
    key: Key = null,
    ref: LegacyRef[ExpandTransitionChild] = null,
    style: CSSProperties = null,
    transitionDelay: Int | Double = null,
    transitionDuration: Int | Double = null
  ): ExpandTransitionChildProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionDelay != null) __obj.updateDynamic("transitionDelay")(transitionDelay.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandTransitionChildProps]
  }
}

