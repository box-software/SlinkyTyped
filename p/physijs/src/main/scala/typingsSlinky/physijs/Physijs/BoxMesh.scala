package typingsSlinky.physijs.Physijs

import typingsSlinky.three.threeMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.BoxMesh")
@js.native
class BoxMesh protected () extends Mesh {
  def this(geometry: Geometry, material: typingsSlinky.three.threeMod.Material) = this()
  def this(geometry: Geometry, material: typingsSlinky.three.threeMod.Material, mass: Double) = this()
}

