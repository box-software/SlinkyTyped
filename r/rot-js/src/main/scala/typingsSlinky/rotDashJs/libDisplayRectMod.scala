package typingsSlinky.rotDashJs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.rotDashJs.libDisplayTypesMod.DisplayData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/display/rect", JSImport.Namespace)
@js.native
object libDisplayRectMod extends js.Object {
  @js.native
  trait Rect
    extends typingsSlinky.rotDashJs.libDisplayCanvasMod.default {
    var _canvasCache: StringDictionary[HTMLCanvasElement] = js.native
    var _spacingX: Double = js.native
    var _spacingY: Double = js.native
    def _drawNoCache(data: DisplayData, clearBefore: Boolean): Unit = js.native
    def _drawWithCache(data: DisplayData): Unit = js.native
  }
  
  @js.native
  class default () extends Rect
  
  /* static members */
  @js.native
  object default extends js.Object {
    var cache: Boolean = js.native
  }
  
}

