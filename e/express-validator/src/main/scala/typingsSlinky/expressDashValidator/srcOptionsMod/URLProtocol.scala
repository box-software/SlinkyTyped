package typingsSlinky.expressDashValidator.srcOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expressDashValidator.expressDashValidatorStrings.http
  - typings.expressDashValidator.expressDashValidatorStrings.https
  - typings.expressDashValidator.expressDashValidatorStrings.ftp
*/
trait URLProtocol extends js.Object

object URLProtocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ftp: typingsSlinky.expressDashValidator.expressDashValidatorStrings.ftp = this.cast("ftp")
  @scala.inline
  def http: typingsSlinky.expressDashValidator.expressDashValidatorStrings.http = this.cast("http")
  @scala.inline
  def https: typingsSlinky.expressDashValidator.expressDashValidatorStrings.https = this.cast("https")
}

