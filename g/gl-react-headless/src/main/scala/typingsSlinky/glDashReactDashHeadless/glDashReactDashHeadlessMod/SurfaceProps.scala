package typingsSlinky.glDashReactDashHeadless.glDashReactDashHeadlessMod

import org.scalajs.dom.raw.WebGLContextAttributes
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.glDashReact.glDashReactMod.Visitor
import typingsSlinky.glDashReactDashHeadless.gLViewHeadlessMod.GLViewHeadlessProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceProps
  extends typingsSlinky.glDashReact.glDashReactMod.SurfaceProps
     with GLViewHeadlessProps

object SurfaceProps {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    children: js.Any = null,
    onContextCreate: /* gl */ WebGLRenderingContext => Unit = null,
    onContextFailure: /* e */ js.Error => Unit = null,
    onContextLost: () => Unit = null,
    onContextRestored: /* gl */ WebGLRenderingContext => Unit = null,
    onLoad: () => Unit = null,
    onLoadError: /* e */ js.Error => Unit = null,
    pixelRatio: Int | Double = null,
    preload: js.Array[_] = null,
    style: js.Any = null,
    visitor: Visitor = null,
    webglContextAttributes: WebGLContextAttributes = null
  ): SurfaceProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1(onContextCreate))
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(js.Any.fromFunction1(onContextFailure))
    if (onContextLost != null) __obj.updateDynamic("onContextLost")(js.Any.fromFunction0(onContextLost))
    if (onContextRestored != null) __obj.updateDynamic("onContextRestored")(js.Any.fromFunction1(onContextRestored))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (visitor != null) __obj.updateDynamic("visitor")(visitor.asInstanceOf[js.Any])
    if (webglContextAttributes != null) __obj.updateDynamic("webglContextAttributes")(webglContextAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceProps]
  }
}

