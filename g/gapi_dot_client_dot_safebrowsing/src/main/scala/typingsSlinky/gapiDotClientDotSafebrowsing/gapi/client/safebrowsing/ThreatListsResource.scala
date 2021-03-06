package typingsSlinky.gapiDotClientDotSafebrowsing.gapi.client.safebrowsing

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotSafebrowsing.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatListsResource extends js.Object {
  /** Lists the Safe Browsing threat lists available for download. */
  def list(request: Anon_AccesstokenAlt): Request[ListThreatListsResponse]
}

object ThreatListsResource {
  @scala.inline
  def apply(list: Anon_AccesstokenAlt => Request[ListThreatListsResponse]): ThreatListsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ThreatListsResource]
  }
}

