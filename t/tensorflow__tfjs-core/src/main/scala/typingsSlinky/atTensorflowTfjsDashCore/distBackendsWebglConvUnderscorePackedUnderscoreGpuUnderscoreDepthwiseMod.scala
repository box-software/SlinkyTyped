package typingsSlinky.atTensorflowTfjsDashCore

import typingsSlinky.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import typingsSlinky.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod.Conv2DInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/conv_packed_gpu_depthwise", JSImport.Namespace)
@js.native
object distBackendsWebglConvUnderscorePackedUnderscoreGpuUnderscoreDepthwiseMod extends js.Object {
  @js.native
  class DepthwiseConvPacked2DProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: String) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: String, hasPreluActivation: Boolean) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_DepthwiseConvPacked2DProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_DepthwiseConvPacked2DProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

