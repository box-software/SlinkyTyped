package typingsSlinky.hapi.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapi.hapiStrings.onPreAuth
  - typings.hapi.hapiStrings.onCredentials
  - typings.hapi.hapiStrings.onPostAuth
  - typings.hapi.hapiStrings.onPreHandler
  - typings.hapi.hapiStrings.onPostHandler
  - typings.hapi.hapiStrings.onPreResponse
*/
trait RouteRequestExtType extends js.Object

object RouteRequestExtType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onCredentials: typingsSlinky.hapi.hapiStrings.onCredentials = this.cast("onCredentials")
  @scala.inline
  def onPostAuth: typingsSlinky.hapi.hapiStrings.onPostAuth = this.cast("onPostAuth")
  @scala.inline
  def onPostHandler: typingsSlinky.hapi.hapiStrings.onPostHandler = this.cast("onPostHandler")
  @scala.inline
  def onPreAuth: typingsSlinky.hapi.hapiStrings.onPreAuth = this.cast("onPreAuth")
  @scala.inline
  def onPreHandler: typingsSlinky.hapi.hapiStrings.onPreHandler = this.cast("onPreHandler")
  @scala.inline
  def onPreResponse: typingsSlinky.hapi.hapiStrings.onPreResponse = this.cast("onPreResponse")
}

