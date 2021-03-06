package typingsSlinky.atTensorflowTfjsDashNode

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend
import typingsSlinky.atTensorflowTfjsDashCore.distKernelUnderscoreRegistryMod.TensorInfo
import typingsSlinky.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod.Conv3DInfo
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.DataType
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank.R0
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank.R1
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank.R2
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank.R3
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank.R4
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank.R5
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings._empty
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.bilinear
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.cm
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.grayscale
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.in
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.nearest
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.rgb
import typingsSlinky.atTensorflowTfjsDashNode.distTfjsUnderscoreBindingMod.TFEOpAttr
import typingsSlinky.atTensorflowTfjsDashNode.distTfjsUnderscoreBindingMod.TFJSBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/nodejs_kernel_backend", JSImport.Namespace)
@js.native
object distNodejsUnderscoreKernelUnderscoreBackendMod extends js.Object {
  @js.native
  class NodeJSKernelBackend protected () extends KernelBackend {
    def this(binding: TFJSBinding, packageName: String) = this()
    var applyActivation: js.Any = js.native
    var binding: TFJSBinding = js.native
    var createOutputTensor: js.Any = js.native
    var createReductionOpAttrs: js.Any = js.native
    var executeSingleInput: js.Any = js.native
    var getDTypeInteger: js.Any = js.native
    var getInputTensorIds: js.Any = js.native
    var isGPUPackage: Boolean = js.native
    var isUsingGpuDevice: Boolean = js.native
    var tensorMap: js.Any = js.native
    var typeAttributeFromTensor: js.Any = js.native
    def add(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def all(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
    def any(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
    def argMax(x: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
    def argMin(x: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
    def batchMatMul(a: Tensor[R3], b: Tensor[R3], transposeA: Boolean, transposeB: Boolean): Tensor[R3] = js.native
    def conv3d(x: Tensor[R5], filter: Tensor[R5], convInfo: Conv3DInfo): Tensor[R5] = js.native
    def conv3dDerFilter(x: Tensor[R5], dY: Tensor[R5], convInfo: Conv3DInfo): Tensor[R5] = js.native
    def conv3dDerInput(dy: Tensor[R5], filter: Tensor[R5], convInfo: Conv3DInfo): Tensor[R5] = js.native
    def createSummaryFileWriter(resourceHandle: Tensor[Rank], logdir: String): Unit = js.native
    def createSummaryFileWriter(resourceHandle: Tensor[Rank], logdir: String, maxQueue: Double): Unit = js.native
    def createSummaryFileWriter(resourceHandle: Tensor[Rank], logdir: String, maxQueue: Double, flushMillis: Double): Unit = js.native
    def createSummaryFileWriter(
      resourceHandle: Tensor[Rank],
      logdir: String,
      maxQueue: Double,
      flushMillis: Double,
      filenameSuffix: String
    ): Unit = js.native
    @JSName("cropAndResize")
    def cropAndResize_bilinear(
      image: Tensor[R4],
      boxes: Tensor[R2],
      boxIndex: Tensor[R1],
      cropSize: js.Tuple2[Double, Double],
      method: bilinear,
      extrapolationValue: Double
    ): Tensor[R4] = js.native
    @JSName("cropAndResize")
    def cropAndResize_nearest(
      image: Tensor[R4],
      boxes: Tensor[R2],
      boxIndex: Tensor[R1],
      cropSize: js.Tuple2[Double, Double],
      method: nearest,
      extrapolationValue: Double
    ): Tensor[R4] = js.native
    def cumsum(x: Tensor[Rank], axis: Double, exclusive: Boolean, reverse: Boolean): Tensor[Rank] = js.native
    def decodeBmp(contents: scala.scalajs.js.typedarray.Uint8Array, channels: Double): Tensor3D = js.native
    def decodeGif(contents: scala.scalajs.js.typedarray.Uint8Array): Tensor4D = js.native
    def decodeJpeg(
      contents: scala.scalajs.js.typedarray.Uint8Array,
      channels: Double,
      ratio: Double,
      fancyUpscaling: Boolean,
      tryRecoverTruncated: Boolean,
      acceptableFraction: Double,
      dctMethod: String
    ): Tensor3D = js.native
    def decodePng(contents: scala.scalajs.js.typedarray.Uint8Array, channels: Double): Tensor3D = js.native
    def deleteSavedModel(id: Double): Unit = js.native
    def depthToSpace(x: Tensor[R4], blockSize: Double, dataFormat: String): Tensor[R4] = js.native
    def diag(x: Tensor[Rank]): Tensor[Rank] = js.native
    def divNoNan(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def divide(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def encodeJpeg(
      imageData: scala.scalajs.js.typedarray.Uint8Array,
      imageShape: js.Array[Double],
      format: grayscale,
      quality: Double,
      progressive: Boolean,
      optimizeSize: Boolean,
      chromaDownsampling: Boolean,
      densityUnit: cm,
      xDensity: Double,
      yDensity: Double,
      xmpMetadata: String
    ): Tensor[Rank] = js.native
    def encodeJpeg(
      imageData: scala.scalajs.js.typedarray.Uint8Array,
      imageShape: js.Array[Double],
      format: grayscale,
      quality: Double,
      progressive: Boolean,
      optimizeSize: Boolean,
      chromaDownsampling: Boolean,
      densityUnit: in,
      xDensity: Double,
      yDensity: Double,
      xmpMetadata: String
    ): Tensor[Rank] = js.native
    def encodeJpeg(
      imageData: scala.scalajs.js.typedarray.Uint8Array,
      imageShape: js.Array[Double],
      format: rgb,
      quality: Double,
      progressive: Boolean,
      optimizeSize: Boolean,
      chromaDownsampling: Boolean,
      densityUnit: cm,
      xDensity: Double,
      yDensity: Double,
      xmpMetadata: String
    ): Tensor[Rank] = js.native
    def encodeJpeg(
      imageData: scala.scalajs.js.typedarray.Uint8Array,
      imageShape: js.Array[Double],
      format: rgb,
      quality: Double,
      progressive: Boolean,
      optimizeSize: Boolean,
      chromaDownsampling: Boolean,
      densityUnit: in,
      xDensity: Double,
      yDensity: Double,
      xmpMetadata: String
    ): Tensor[Rank] = js.native
    @JSName("encodeJpeg")
    def encodeJpeg_cm(
      imageData: scala.scalajs.js.typedarray.Uint8Array,
      imageShape: js.Array[Double],
      format: _empty,
      quality: Double,
      progressive: Boolean,
      optimizeSize: Boolean,
      chromaDownsampling: Boolean,
      densityUnit: cm,
      xDensity: Double,
      yDensity: Double,
      xmpMetadata: String
    ): Tensor[Rank] = js.native
    @JSName("encodeJpeg")
    def encodeJpeg_in(
      imageData: scala.scalajs.js.typedarray.Uint8Array,
      imageShape: js.Array[Double],
      format: _empty,
      quality: Double,
      progressive: Boolean,
      optimizeSize: Boolean,
      chromaDownsampling: Boolean,
      densityUnit: in,
      xDensity: Double,
      yDensity: Double,
      xmpMetadata: String
    ): Tensor[Rank] = js.native
    def encodePng(
      imageData: scala.scalajs.js.typedarray.Uint8Array,
      imageShape: js.Array[Double],
      compression: Double
    ): Tensor[Rank] = js.native
    def equal(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def executeEncodeImageOp(
      name: String,
      opAttrs: js.Array[TFEOpAttr],
      imageData: scala.scalajs.js.typedarray.Uint8Array,
      imageShape: js.Array[Double]
    ): Tensor[Rank] = js.native
    /**
      * Executes a TensorFlow Eager Op that provides multiple output Tensors.
      * @param name The name of the Op to execute.
      * @param opAttrs The list of Op attributes required to execute.
      * @param inputs The list of input Tensors for the Op.
      * @param numOutputs The number of output Tensors for Op execution.
      * @return A resulting Tensor array from Op execution.
      */
    def executeMultipleOutputs(name: String, opAttrs: js.Array[TFEOpAttr], inputs: js.Array[Tensor[Rank]], numOutputs: Double): js.Array[Tensor[Rank]] = js.native
    /**
      * Executes a TensorFlow Eager Op that provides one output Tensor.
      * @param name The name of the Op to execute.
      * @param opAttrs The list of Op attributes required to execute.
      * @param inputs The list of input Tensors for the Op.
      * @return A resulting Tensor from Op execution.
      */
    def executeSingleOutput(name: String, opAttrs: js.Array[TFEOpAttr], inputs: js.Array[TensorInfo]): Tensor[Rank] = js.native
    def fft(x: Tensor[R2]): Tensor[R2] = js.native
    def floorDiv(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def flushSummaryWriter(resourceHandle: Tensor[Rank]): Unit = js.native
    def gatherND(x: Tensor[Rank], indices: Tensor[Rank]): Tensor[Rank] = js.native
    def greater(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def greaterEqual(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def less(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def lessEqual(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def loadSavedModelMetaGraph(path: String, tags: String): Double = js.native
    def logicalAnd(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def logicalOr(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def max(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
    def maximum(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def min(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
    def minimum(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def mod(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def multiply(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def nonMaxSuppression(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): Tensor1D = js.native
    def notEqual(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def onesLike[R /* <: Rank */](x: Tensor[R]): Tensor[R] = js.native
    def pow[T /* <: Tensor[Rank] */](a: T, b: Tensor[Rank]): T = js.native
    def prod(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
    def realDivide(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def runSavedModel(
      id: Double,
      inputs: js.Array[Tensor[Rank]],
      inputOpNames: js.Array[String],
      outputOpNames: js.Array[String]
    ): js.Array[Tensor[Rank]] = js.native
    def scatterND[R /* <: Rank */](
      indices: Tensor[Rank],
      updates: Tensor[Rank],
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor[R] = js.native
    def select(condition: Tensor[Rank], a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def sparseToDense[R /* <: Rank */](
      sparseIndices: Tensor[Rank],
      sparseValues: Tensor[Rank],
      outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: Tensor[R0]
    ): Tensor[R] = js.native
    def squaredDifference(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def subtract(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    def sum(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
    def summaryWriter(logdir: String): Tensor1D = js.native
    def topKIndices(x: Tensor[Rank], k: Double): Tensor1D = js.native
    def topKValues[T /* <: Tensor[Rank] */](x: T, k: Double): Tensor1D = js.native
    def topk[T /* <: Tensor[Rank] */](x: T): js.Tuple2[T, T] = js.native
    def topk[T /* <: Tensor[Rank] */](x: T, k: Double): js.Tuple2[T, T] = js.native
    def unstack(x: Tensor[Rank], axis: Double): js.Array[Tensor[Rank]] = js.native
    def where(condition: Tensor[Rank]): Tensor2D = js.native
    def writeScalarSummary(resourceHandle: Tensor[Rank], step: Double, name: String, value: Double): Unit = js.native
    def writeScalarSummary(resourceHandle: Tensor[Rank], step: Double, name: String, value: Scalar): Unit = js.native
    def zerosLike[R /* <: Rank */](x: Tensor[R]): Tensor[R] = js.native
  }
  
  def createTensorsTypeOpAttr(attrName: String, tensors: js.Array[Tensor[Rank]]): Anon_Name = js.native
  def createTensorsTypeOpAttr(attrName: String, tensors: Tensor[Rank]): Anon_Name = js.native
  def createTypeOpAttr(attrName: String, dtype: DataType): TFEOpAttr = js.native
  def ensureTensorflowBackend(): Unit = js.native
  def getTFDType(dataType: DataType): Double = js.native
  def nodeBackend(): NodeJSKernelBackend = js.native
}

