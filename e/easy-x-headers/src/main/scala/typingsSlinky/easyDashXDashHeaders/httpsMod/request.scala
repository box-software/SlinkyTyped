package typingsSlinky.easyDashXDashHeaders.httpsMod

import typingsSlinky.easyDashXDashHeaders.httpMod.ClientRequest
import typingsSlinky.easyDashXDashHeaders.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", "request")
@js.native
object request extends js.Object {
  def apply(options: RequestOptions): ClientRequest = js.native
  def apply(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
}

