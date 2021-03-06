package typingsSlinky.atTensorflowTfjsDashLayers.distLayersRecurrentMod

import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.glorotNormal
import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.orthogonal_
import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.tanh
import typingsSlinky.atTensorflowTfjsDashLayers.distActivationsMod.Activation
import typingsSlinky.atTensorflowTfjsDashLayers.distConstraintsMod.Constraint
import typingsSlinky.atTensorflowTfjsDashLayers.distInitializersMod.Initializer
import typingsSlinky.atTensorflowTfjsDashLayers.distInitializersMod.InitializerIdentifier
import typingsSlinky.atTensorflowTfjsDashLayers.distRegularizersMod.Regularizer
import typingsSlinky.atTensorflowTfjsDashLayers.distVariablesMod.LayerVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "SimpleRNNCell")
@js.native
class SimpleRNNCell protected () extends RNNCell {
  def this(args: SimpleRNNCellLayerArgs) = this()
  val DEFAULT_ACTIVATION: tanh = js.native
  val DEFAULT_BIAS_INITIALIZER: InitializerIdentifier = js.native
  val DEFAULT_KERNEL_INITIALIZER: glorotNormal = js.native
  val DEFAULT_RECURRENT_INITIALIZER: orthogonal_ = js.native
  val activation: Activation = js.native
  var bias: LayerVariable = js.native
  val biasConstraint: Constraint = js.native
  val biasInitializer: Initializer = js.native
  val biasRegularizer: Regularizer = js.native
  val dropout: Double = js.native
  var kernel: LayerVariable = js.native
  val kernelConstraint: Constraint = js.native
  val kernelInitializer: Initializer = js.native
  val kernelRegularizer: Regularizer = js.native
  val recurrentConstraint: Constraint = js.native
  val recurrentDropout: Double = js.native
  val recurrentInitializer: Initializer = js.native
  var recurrentKernel: LayerVariable = js.native
  val recurrentRegularizer: Regularizer = js.native
  @JSName("stateSize")
  val stateSize_SimpleRNNCell: Double = js.native
  val units: Double = js.native
  val useBias: Boolean = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "SimpleRNNCell")
@js.native
object SimpleRNNCell extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

