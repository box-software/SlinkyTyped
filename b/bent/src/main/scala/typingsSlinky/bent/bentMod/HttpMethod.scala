package typingsSlinky.bent.bentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bent.bentStrings.GET
  - typings.bent.bentStrings.POST
  - typings.bent.bentStrings.DELETE
  - typings.bent.bentStrings.PUT
  - typings.bent.bentStrings.PATCH
  - typings.bent.bentStrings.HEAD
  - typings.bent.bentStrings.OPTIONS
  - typings.bent.bentStrings.CONNECT
  - typings.bent.bentStrings.TRACE
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def CONNECT: typingsSlinky.bent.bentStrings.CONNECT = this.cast("CONNECT")
  @scala.inline
  def DELETE: typingsSlinky.bent.bentStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.bent.bentStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typingsSlinky.bent.bentStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typingsSlinky.bent.bentStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typingsSlinky.bent.bentStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsSlinky.bent.bentStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsSlinky.bent.bentStrings.PUT = this.cast("PUT")
  @scala.inline
  def TRACE: typingsSlinky.bent.bentStrings.TRACE = this.cast("TRACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

