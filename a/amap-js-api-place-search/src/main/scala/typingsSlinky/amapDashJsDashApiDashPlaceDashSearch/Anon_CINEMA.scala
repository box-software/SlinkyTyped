package typingsSlinky.amapDashJsDashApiDashPlaceDashSearch

import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch.Cinema
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.CINEMA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CINEMA extends js.Object {
  /**
    * @deprecated 影院类深度信息
    */
  var cinema: Cinema
  var deep_type: CINEMA
}

object Anon_CINEMA {
  @scala.inline
  def apply(cinema: Cinema, deep_type: CINEMA): Anon_CINEMA = {
    val __obj = js.Dynamic.literal(cinema = cinema.asInstanceOf[js.Any], deep_type = deep_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CINEMA]
  }
}

