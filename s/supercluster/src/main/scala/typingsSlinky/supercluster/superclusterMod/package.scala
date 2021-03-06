package typingsSlinky.supercluster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object superclusterMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.geojson.geojsonMod.Feature
  import typingsSlinky.geojson.geojsonMod.Point

  /**
    * Default properties type, allowing any properties.
    * Try to avoid this for better typesafety by using proper types.
    */
  type AnyProps = StringDictionary[js.Any]
  type ClusterFeature[C] = PointFeature[ClusterProperties with C]
  /**
    * [GeoJSON Feature](https://tools.ietf.org/html/rfc7946#section-3.2),
    * with the geometry being a
    * [GeoJSON Point](https://tools.ietf.org/html/rfc7946#section-3.1.2).
    */
  type PointFeature[P] = Feature[Point, P]
}
