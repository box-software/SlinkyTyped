package typingsSlinky.atTensorflowTfjsDashCore

import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/reverse", JSImport.Namespace)
@js.native
object distOpsReverseMod extends js.Object {
  val reverse1d: js.Function1[/* x */ Tensor1D | TensorLike, Tensor1D] = js.native
  val reverse2d: js.Function2[
    /* x */ Tensor2D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor2D
  ] = js.native
  val reverse3d: js.Function2[
    /* x */ Tensor3D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor3D
  ] = js.native
  val reverse4d: js.Function2[
    /* x */ Tensor4D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor4D
  ] = js.native
  @js.native
  object reverse extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, axis: js.Array[Double]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, axis: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  }
  
}

