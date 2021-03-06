package typingsSlinky.domDashClipboardDashApi

import org.scalajs.dom.raw.DataTransfer
import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clipboard extends EventTarget {
  def read(): js.Promise[DataTransfer] = js.native
  def readText(): js.Promise[String] = js.native
  def write(data: DataTransfer): js.Promise[Unit] = js.native
  def writeText(data: String): js.Promise[Unit] = js.native
}

