package typingsSlinky.reactstrap.libCarouselItemMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.AllHTMLAttributes
import typingsSlinky.react.reactMod.ClassAttributes
import typingsSlinky.reactstrap.reactstrapMod.CSSModule
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselItemProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var in: js.UndefOr[Boolean] = js.undefined
  var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEntered: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEntering: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExited: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExiting: js.UndefOr[js.Function0[Unit]] = js.undefined
  var slide: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String | ReactComponentClass[_]] = js.undefined
}

object CarouselItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    cssModule: CSSModule = null,
    in: js.UndefOr[Boolean] = js.undefined,
    onEnter: () => Unit = null,
    onEntered: () => Unit = null,
    onEntering: () => Unit = null,
    onExit: () => Unit = null,
    onExited: () => Unit = null,
    onExiting: () => Unit = null,
    slide: js.UndefOr[Boolean] = js.undefined,
    tag: String | ReactComponentClass[_] = null
  ): CarouselItemProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction0(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction0(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction0(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction0(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction0(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction0(onExiting))
    if (!js.isUndefined(slide)) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselItemProps]
  }
}

