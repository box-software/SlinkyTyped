package typingsSlinky.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IconUrl extends js.Object {
  var iconUrl: js.UndefOr[String] = js.undefined
  var title: String
}

object Anon_IconUrl {
  @scala.inline
  def apply(title: String, iconUrl: String = null): Anon_IconUrl = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IconUrl]
  }
}

