package typingsSlinky.amapDashJsDashApiDashPlaceDashSearch

import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch.Poi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Array[Poi]
  var id: String
  var index: Double
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Array[Poi], id: String, index: Double): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data]
  }
}

