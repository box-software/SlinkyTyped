package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`backward-diagonal`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`diagonal-cross`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`forward-diagonal`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`simple-fill`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.cross
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.horizontal
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.none
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.solid
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisDashJsDashApi.__esri.Symbol2D3D because Already inherited
- typings.arcgisDashJsDashApi.__esri.symbols.Symbol2D3D because Already inherited */ @js.native
trait SimpleFillSymbol
  extends FillSymbol
     with typingsSlinky.arcgisDashJsDashApi.__esri.symbols.FillSymbol
     with typingsSlinky.arcgisDashJsDashApi.__esri.symbols.Symbol2D
     with Symbol2D
     with symbolsFillSymbol {
  /**
    * The fill style. Possible values are listed in the table below:
    *
    * Value | Description
    * ------|-------------
    * backward-diagonal | ![sfs-backward-diagonal](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-backward-diagonal.png)
    * cross | ![sfs-cross](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-cross.png)
    * diagonal-cross | ![sfs-diagonal-cross](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-diagonal-cross.png)
    * forward-diagonal | ![sfs-forward-diagonal](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-forward-diagonal.png)
    * horizontal | ![sfs-horizontal](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-horizontal.png)
    * none | The polygon has no fill.
    * solid | ![sfs-solid](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-solid.png)
    * vertical | ![sfs-vertical](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-vertical.png)
    *
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#style)
    *
    * @default solid
    */
  var style: `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none | solid | vertical = js.native
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#type)
    */
  @JSName("type")
  val type_SimpleFillSymbol: `simple-fill` = js.native
}

@JSGlobal("__esri.SimpleFillSymbol")
@js.native
object SimpleFillSymbol extends TopLevel[SimpleFillSymbolConstructor]

