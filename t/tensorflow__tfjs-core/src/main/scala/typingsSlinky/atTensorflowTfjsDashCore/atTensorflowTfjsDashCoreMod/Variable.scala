package typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "Variable")
@js.native
class Variable[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */] protected ()
  extends typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Variable[R] {
  def this(
    initialValue: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R],
    trainable: Boolean,
    name: String,
    tensorId: Double
  ) = this()
}

@JSImport("@tensorflow/tfjs-core", "variable")
@js.native
object variable extends js.Object {
  /**
    * Creates a new variable with the provided initial value.
    * ```js
    * const x = tf.variable(tf.tensor([1, 2, 3]));
    * x.assign(tf.tensor([4, 5, 6]));
    *
    * x.print();
    * ```
    *
    * @param initialValue Initial value for the tensor.
    * @param trainable If true, optimizers are allowed to update it.
    * @param name Name of the variable. Defaults to a unique id.
    * @param dtype If set, initialValue will be converted to the given type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def apply[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](initialValue: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R]): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Variable[R] = js.native
  def apply[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](initialValue: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R], trainable: Boolean): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Variable[R] = js.native
  def apply[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    initialValue: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R],
    trainable: Boolean,
    name: String
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Variable[R] = js.native
  def apply[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    initialValue: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R],
    trainable: Boolean,
    name: String,
    dtype: DataType
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Variable[R] = js.native
}

