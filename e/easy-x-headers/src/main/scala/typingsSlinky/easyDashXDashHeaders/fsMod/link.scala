package typingsSlinky.easyDashXDashHeaders.fsMod

import typingsSlinky.easyDashXDashHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "link")
@js.native
object link extends js.Object {
  def apply(srcpath: String, dstpath: String): Unit = js.native
  def apply(
    srcpath: String,
    dstpath: String,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
}

