package typingsSlinky.lambdaDashLog.lambdaDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-log", "info")
@js.native
object info extends js.Object {
  def apply(msg: String): LogMessage = js.native
  def apply(msg: String, meta: js.Object): LogMessage = js.native
  def apply(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
}

