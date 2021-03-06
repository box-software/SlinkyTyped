package typingsSlinky.ol.styleAtlasMod

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtlasInfo extends js.Object {
  var image: HTMLCanvasElement
  var offsetX: Double
  var offsetY: Double
}

object AtlasInfo {
  @scala.inline
  def apply(image: HTMLCanvasElement, offsetX: Double, offsetY: Double): AtlasInfo = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AtlasInfo]
  }
}

