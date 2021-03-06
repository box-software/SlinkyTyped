package typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "reverse3d")
@js.native
object reverse3d
  extends TopLevel[
      js.Function2[
        /* x */ Tensor3D | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        Tensor3D
      ]
    ]

