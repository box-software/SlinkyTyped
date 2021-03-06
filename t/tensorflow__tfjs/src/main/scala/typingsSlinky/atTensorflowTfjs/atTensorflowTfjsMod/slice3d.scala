package typingsSlinky.atTensorflowTfjs.atTensorflowTfjsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "slice3d")
@js.native
object slice3d
  extends TopLevel[
      js.Function3[
        /* x */ Tensor3D | TensorLike, 
        /* begin */ js.Tuple3[Double, Double, Double], 
        /* size */ js.Tuple3[Double, Double, Double], 
        Tensor3D
      ]
    ]

