package typingsSlinky.zchatDashBrowser

import typingsSlinky.zchatDashBrowser.zchatDashBrowserStrings.chatDotrating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chatrating extends js.Object {
  var new_rating: js.UndefOr[String] = js.undefined
  var rating: js.UndefOr[String] = js.undefined
  var `type`: chatDotrating
}

object Anon_Chatrating {
  @scala.inline
  def apply(`type`: chatDotrating, new_rating: String = null, rating: String = null): Anon_Chatrating = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (new_rating != null) __obj.updateDynamic("new_rating")(new_rating.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Chatrating]
  }
}

