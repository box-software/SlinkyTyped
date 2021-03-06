package typingsSlinky.meteor.HTTP

import typingsSlinky.meteor.Anon_Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HTTP.call")
@js.native
object call extends js.Object {
  def apply(method: String, url: String): HTTPResponse = js.native
  def apply(method: String, url: String, options: Anon_Auth): HTTPResponse = js.native
  def apply(method: String, url: String, options: Anon_Auth, asyncCallback: js.Function): HTTPResponse = js.native
  def apply(method: String, url: String, options: HTTPRequest): HTTPResponse = js.native
  def apply(method: String, url: String, options: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
}

