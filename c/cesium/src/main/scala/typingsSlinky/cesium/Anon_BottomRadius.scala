package typingsSlinky.cesium

import typingsSlinky.cesium.cesiumMod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomRadius extends js.Object {
  var bottomRadius: Double
  var length: Double
  var slices: js.UndefOr[Double] = js.undefined
  var topRadius: Double
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object Anon_BottomRadius {
  @scala.inline
  def apply(
    bottomRadius: Double,
    length: Double,
    topRadius: Double,
    slices: Int | Double = null,
    vertexFormat: VertexFormat = null
  ): Anon_BottomRadius = {
    val __obj = js.Dynamic.literal(bottomRadius = bottomRadius.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], topRadius = topRadius.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomRadius]
  }
}

