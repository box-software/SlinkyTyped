package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateItem extends Accessor {
  /**
    * The description that is displayed for the template item. This is similar to the description provided in [FeatureTemplate.description](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#description).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#description)
    */
  var description: String = js.native
  /**
    * The label that is displayed for the template item. This is similar to the name provided in [FeatureTemplate.name](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#name).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#label)
    */
  var label: String = js.native
  /**
    * The [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) associated with the template item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#layer)
    */
  var layer: FeatureLayer = js.native
  /**
    * The associated [FeatureTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html) for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#template)
    */
  var template: FeatureTemplate = js.native
  /**
    * An object used to create a thumbnail image that represents a feature type in the feature template. This is similar to [FeatureTemplate.thumbnail](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#thumbnail)
    */
  val thumbnail: HTMLElement = js.native
  /**
    * Fetches the thumbnail used to display the template item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#fetchThumbnail)
    *
    *
    */
  def fetchThumbnail(): js.Promise[_] = js.native
}

@JSGlobal("__esri.TemplateItem")
@js.native
object TemplateItem extends TopLevel[TemplateItemConstructor]

