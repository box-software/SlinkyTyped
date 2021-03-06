package typingsSlinky.cesium.cesiumMod

import typingsSlinky.cesium.Anon_CornerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CorridorGeometry")
@js.native
class CorridorGeometry protected () extends Packable {
  def this(options: Anon_CornerType) = this()
}

/* static members */
@JSImport("cesium", "CorridorGeometry")
@js.native
object CorridorGeometry extends js.Object {
  def createGeometry(corridorGeometry: CorridorGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): CorridorGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): CorridorGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: CorridorGeometry): CorridorGeometry = js.native
}

