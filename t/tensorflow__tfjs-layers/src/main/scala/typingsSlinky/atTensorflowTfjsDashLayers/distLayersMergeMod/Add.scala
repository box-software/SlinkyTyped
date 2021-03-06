package typingsSlinky.atTensorflowTfjsDashLayers.distLayersMergeMod

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.LayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Add")
@js.native
class Add () extends Merge {
  def this(args: LayerArgs) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Add")
@js.native
object Add extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "add")
@js.native
object add extends js.Object {
  def apply(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def apply(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def apply(config: LayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
}

