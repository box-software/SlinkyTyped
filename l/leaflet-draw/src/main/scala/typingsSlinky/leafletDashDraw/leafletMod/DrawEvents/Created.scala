package typingsSlinky.leafletDashDraw.leafletMod.DrawEvents

import typingsSlinky.geojson.geojsonMod.LineString
import typingsSlinky.geojson.geojsonMod.MultiLineString
import typingsSlinky.leaflet.leafletMod.Circle
import typingsSlinky.leaflet.leafletMod.CircleMarker
import typingsSlinky.leaflet.leafletMod.LeafletEvent
import typingsSlinky.leaflet.leafletMod.Marker
import typingsSlinky.leaflet.leafletMod.Polygon
import typingsSlinky.leaflet.leafletMod.Polyline
import typingsSlinky.leaflet.leafletMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Created extends LeafletEvent {
  /**
    * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker.
    */
  var layerType: String
  /**
    * Layer that was just created.
    */
  @JSName("layer")
  var layer_Created: Circle[_] | CircleMarker[_] | Marker[_] | Polygon[_] | (Polyline[LineString | MultiLineString, _]) | Rectangle[_]
}

object Created {
  @scala.inline
  def apply(
    layer: Circle[_] | CircleMarker[_] | Marker[_] | Polygon[_] | (Polyline[LineString | MultiLineString, _]) | Rectangle[_],
    layerType: String,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): Created = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
}

