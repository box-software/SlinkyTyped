package typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import typingsSlinky.react.reactMod.ClassAttributes
import typingsSlinky.react.reactMod.SVGAttributes
import typingsSlinky.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraticuleProps
  extends SVGAttributes[SVGPathElement]
     with ClassAttributes[SVGPathElement] {
  /**
    * @default [10, 10]
    */
  var step: js.UndefOr[Point] = js.undefined
}

object GraticuleProps {
  @scala.inline
  def apply(
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.SVGPathElement] = null,
    SVGAttributes: SVGAttributes[org.scalajs.dom.raw.SVGPathElement] = null,
    step: Point = null
  ): GraticuleProps = {
    val __obj = js.Dynamic.literal()
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraticuleProps]
  }
}

