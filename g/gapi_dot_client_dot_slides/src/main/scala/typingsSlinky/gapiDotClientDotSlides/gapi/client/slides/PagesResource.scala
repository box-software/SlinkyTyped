package typingsSlinky.gapiDotClientDotSlides.gapi.client.slides

import typingsSlinky.gapiDotClientDotSlides.Anon_Accesstoken
import typingsSlinky.gapiDotClientDotSlides.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesResource extends js.Object {
  /** Gets the latest version of the specified page in the presentation. */
  def get(request: Anon_Accesstoken): typingsSlinky.gapiDotClient.gapi.client.Request[Page]
  /**
    * Generates a thumbnail of the latest version of the specified page in the
    * presentation and returns a URL to the thumbnail image.
    */
  def getThumbnail(request: Anon_AccesstokenAlt): typingsSlinky.gapiDotClient.gapi.client.Request[Thumbnail]
}

object PagesResource {
  @scala.inline
  def apply(
    get: Anon_Accesstoken => typingsSlinky.gapiDotClient.gapi.client.Request[Page],
    getThumbnail: Anon_AccesstokenAlt => typingsSlinky.gapiDotClient.gapi.client.Request[Thumbnail]
  ): PagesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getThumbnail = js.Any.fromFunction1(getThumbnail))
  
    __obj.asInstanceOf[PagesResource]
  }
}

