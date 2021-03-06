package typingsSlinky.chrome.chrome.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chrome.chromeStrings.regular
  - typings.chrome.chromeStrings.incognito_session_only
*/
trait ScopeEnum extends js.Object

object ScopeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incognito_session_only: typingsSlinky.chrome.chromeStrings.incognito_session_only = this.cast("incognito_session_only")
  @scala.inline
  def regular: typingsSlinky.chrome.chromeStrings.regular = this.cast("regular")
}

