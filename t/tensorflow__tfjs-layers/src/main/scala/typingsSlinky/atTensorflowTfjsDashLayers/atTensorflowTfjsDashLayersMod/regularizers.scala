package typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersMod

import typingsSlinky.atTensorflowTfjsDashLayers.distRegularizersMod.L1Args
import typingsSlinky.atTensorflowTfjsDashLayers.distRegularizersMod.L1L2Args
import typingsSlinky.atTensorflowTfjsDashLayers.distRegularizersMod.L2Args
import typingsSlinky.atTensorflowTfjsDashLayers.distRegularizersMod.Regularizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "regularizers")
@js.native
object regularizers extends js.Object {
  def l1(): Regularizer = js.native
  def l1(config: L1Args): Regularizer = js.native
  def l1l2(): Regularizer = js.native
  def l1l2(config: L1L2Args): Regularizer = js.native
  def l2(): Regularizer = js.native
  def l2(config: L2Args): Regularizer = js.native
}

