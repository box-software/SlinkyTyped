package typingsSlinky.naverDashWhale.whale.tabCapture

import org.scalajs.dom.experimental.mediastream.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabCapture.capture")
@js.native
object capture extends js.Object {
  def apply(
    options: typingsSlinky.chrome.chrome.tabCapture.CaptureOptions,
    callback: js.Function1[/* stream */ MediaStream | Null, Unit]
  ): Unit = js.native
}

