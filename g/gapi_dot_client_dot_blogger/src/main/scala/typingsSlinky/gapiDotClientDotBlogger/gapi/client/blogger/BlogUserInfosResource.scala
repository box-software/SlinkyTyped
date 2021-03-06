package typingsSlinky.gapiDotClientDotBlogger.gapi.client.blogger

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotBlogger.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogUserInfosResource extends js.Object {
  /** Gets one blog and user info pair by blogId and userId. */
  def get(request: Anon_Alt): Request[BlogUserInfo]
}

object BlogUserInfosResource {
  @scala.inline
  def apply(get: Anon_Alt => Request[BlogUserInfo]): BlogUserInfosResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[BlogUserInfosResource]
  }
}

