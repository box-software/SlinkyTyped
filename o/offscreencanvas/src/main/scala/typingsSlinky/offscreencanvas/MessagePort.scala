package typingsSlinky.offscreencanvas

import typingsSlinky.std.EventTarget
import typingsSlinky.std.Transferable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePort extends EventTarget {
  def postMessage(message: js.Any): Unit = js.native
  def postMessage(message: js.Any, transfer: js.Array[Transferable | OffscreenCanvas]): Unit = js.native
}

