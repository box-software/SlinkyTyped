package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`150-kilometers`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`50-kilometers`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`benoit-1895-b-chains`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`clarke-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`clarke-links`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`clarke-yards`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`gold-coast-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`gravity-related-height`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`indian-1937-yards`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`indian-yards`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`sears-1922-truncated-chains`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`sears-chains`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`sears-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`sears-yards`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`us-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ellipsoidal
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeightModelInfo
  extends Accessor
     with JSONSupport {
  /**
    * The surface type or height model of the vertical coordinate system (VCS). A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) will only render layers containing data that is compatible with the HeightModelInfo of the scene.
    *
    * Value | Description
    * ------|------------
    * gravity-related-height | A gravity-related VCS may set its zero point through a local mean sea level or a benchmark, and is compatible with other gravity-related VCS for the purposes of rendering.
    * ellipsoidal | An ellipsoidal VCS defines heights that are referenced to an ellipsoid of a geographic coordinate system.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightModel)
    *
    * @default "gravity-related-height"
    */
  val heightModel: `gravity-related-height` | ellipsoidal = js.native
  /**
    * The unit of the vertical coordinate system. A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) will use this property to check that the vertical data of layers that define a HeightModelInfo is compatible with the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightUnit)
    *
    * @default "meters"
    */
  val heightUnit: meters_ | feet_ | `us-feet` | `clarke-feet` | `clarke-yards` | `clarke-links` | `sears-yards` | `sears-feet` | `sears-chains` | `benoit-1895-b-chains` | `indian-yards` | `indian-1937-yards` | `gold-coast-feet` | `sears-1922-truncated-chains` | `50-kilometers` | `150-kilometers` = js.native
  /**
    * The datum realization of the vertical coordinate system. A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) will only render layers that define a HeightModelInfo with an identical `vertCRS` to that of the scene, when using an `ellipsoidal` height model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#vertCRS)
    */
  val vertCRS: String = js.native
}

@JSGlobal("__esri.HeightModelInfo")
@js.native
object HeightModelInfo extends TopLevel[HeightModelInfoConstructor]

