package typingsSlinky.atPollyjsCore.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends HTTPBase {
  val ok: Boolean = js.native
  var statusCode: Double = js.native
  val statusText: String = js.native
  def end(): this.type = js.native
  def sendStatus(status: Double): this.type = js.native
  def status(status: Double): this.type = js.native
}

