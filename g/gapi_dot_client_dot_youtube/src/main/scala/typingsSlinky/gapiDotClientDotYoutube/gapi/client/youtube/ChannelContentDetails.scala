package typingsSlinky.gapiDotClientDotYoutube.gapi.client.youtube

import typingsSlinky.gapiDotClientDotYoutube.Anon_Favorites
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelContentDetails extends js.Object {
  var relatedPlaylists: js.UndefOr[Anon_Favorites] = js.undefined
}

object ChannelContentDetails {
  @scala.inline
  def apply(relatedPlaylists: Anon_Favorites = null): ChannelContentDetails = {
    val __obj = js.Dynamic.literal()
    if (relatedPlaylists != null) __obj.updateDynamic("relatedPlaylists")(relatedPlaylists.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelContentDetails]
  }
}

