package typingsSlinky.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import typingsSlinky.leaflet.leafletMod.LatLngBoundsExpression
import typingsSlinky.leaflet.leafletMod.LatLngExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var bounds: LatLngBoundsExpression
  var latlng: LatLngExpression
  var results: js.Array[ResultObject]
}

object Results {
  @scala.inline
  def apply(bounds: LatLngBoundsExpression, latlng: LatLngExpression, results: js.Array[ResultObject]): Results = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Results]
  }
}

