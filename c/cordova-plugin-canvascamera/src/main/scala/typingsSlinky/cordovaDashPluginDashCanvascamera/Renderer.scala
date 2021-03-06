package typingsSlinky.cordovaDashPluginDashCanvascamera

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.cordovaDashPluginDashCanvascamera.cordovaDashPluginDashCanvascameraStrings.data
import typingsSlinky.cordovaDashPluginDashCanvascamera.cordovaDashPluginDashCanvascameraStrings.file
import typingsSlinky.cordovaDashPluginDashCanvascamera.cordovaDashPluginDashCanvascameraStrings.landscape
import typingsSlinky.cordovaDashPluginDashCanvascamera.cordovaDashPluginDashCanvascameraStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Renderer")
@js.native
class Renderer protected () extends js.Object {
  var available: Boolean = js.native
  var buffer: js.Array[_] = js.native
  var context: CanvasRenderingContext2D = js.native
  var element: HTMLCanvasElement = js.native
  var fullscreen: Boolean = js.native
  var image: HTMLImageElement = js.native
  var orientation: portrait | landscape = js.native
  var parent: CanvasCamera = js.native
  var size: Anon_Height = js.native
  var `type`: file | data = js.native
  @JSName("bufferize")
  def bufferize_data(data: js.Any, `type`: data): Renderer = js.native
  @JSName("bufferize")
  def bufferize_file(data: js.Any, `type`: file): Renderer = js.native
  def clear(): Renderer = js.native
  def disable(): Renderer = js.native
  def disabled(): Boolean = js.native
  def draw(frame: Frame): Renderer = js.native
  def enable(): Renderer = js.native
  def enabled(): Boolean = js.native
  def initialize(): Renderer = js.native
  def invert(): Renderer = js.native
  def onAfterDraw(): Unit = js.native
  def onAfterDraw(frame: Frame): Unit = js.native
  def onBeforeDraw(): Unit = js.native
  def onBeforeDraw(frame: Frame): Unit = js.native
  def onOrientationChange(): Unit = js.native
  @JSName("render")
  def render_data(data: js.Any, `type`: data): Renderer = js.native
  @JSName("render")
  def render_file(data: js.Any, `type`: file): Renderer = js.native
  def resize(): Renderer = js.native
  def run(): Renderer = js.native
  def setOnAfterDraw(onAfterDraw: js.Function1[/* frame */ js.UndefOr[Frame], Unit]): Renderer = js.native
  def setOnBeforeDraw(onBeforeDraw: js.Function1[/* frame */ js.UndefOr[Frame], Unit]): Renderer = js.native
  def setSize(size: Anon_Height): Renderer = js.native
  def setSize(size: Anon_Height, auto: Boolean): Renderer = js.native
}

