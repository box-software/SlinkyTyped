package typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCDHW
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCHW
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NDHWC
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NHWC
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.channelsFirst
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.channelsLast
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same_
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid_
import typingsSlinky.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod.Conv2DInfo
import typingsSlinky.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod.Conv3DInfo
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.DataType
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank.R1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "backend_util")
@js.native
object backend_util extends js.Object {
  def assertAndGetBroadcastShape(shapeA: js.Array[Double], shapeB: js.Array[Double]): js.Array[Double] = js.native
  def assertAxesAreInnerMostDims(msg: String, axes: js.Array[Double], rank: Double): Unit = js.native
  def assertParamsConsistent(shapes: js.Array[js.Array[Double]], axis: Double): Unit = js.native
  def axesAreInnerMostDims(axes: js.Array[Double], rank: Double): Boolean = js.native
  def castTensor[T /* <: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank] */](
    x: T,
    dtype: DataType,
    backend: typingsSlinky.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend
  ): T = js.native
  def combineLocations(outputLoc: js.Array[Double], reduceLoc: js.Array[Double], axes: js.Array[Double]): js.Array[Double] = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double
  ): Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
  ): Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil,
    depthwise: Boolean
  ): Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil,
    depthwise: Boolean,
    dataFormat: channelsFirst | channelsLast
  ): Conv2DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same_ | valid_ | Double
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same_ | valid_ | Double,
    depthwise: Boolean
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same_ | valid_ | Double,
    depthwise: Boolean,
    dataFormat: channelsFirst | channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same_ | valid_ | Double,
    depthwise: Boolean,
    dataFormat: channelsFirst | channelsLast,
    roundingMode: typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
  ): Conv3DInfo = js.native
  def computeDefaultPad(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double): Double = js.native
  def computeDefaultPad(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double, dilation: Double): Double = js.native
  def computeDefaultPad(inputShape: js.Tuple4[Double, Double, Double, Double], fieldSize: Double, stride: Double): Double = js.native
  def computeDefaultPad(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    fieldSize: Double,
    stride: Double,
    dilation: Double
  ): Double = js.native
  def computeOutAndReduceShapes(aShape: js.Array[Double], axes: js.Array[Double]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  def computeOutShape(shapes: js.Array[js.Array[Double]], axis: Double): js.Array[Double] = js.native
  def computePool2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double
  ): Conv2DInfo = js.native
  def computePool2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
  ): Conv2DInfo = js.native
  def computePool2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil,
    dataFormat: channelsFirst | channelsLast
  ): Conv2DInfo = js.native
  def computePool3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same_ | valid_ | Double
  ): Conv3DInfo = js.native
  def computePool3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
  ): Conv3DInfo = js.native
  def computePool3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil,
    dataFormat: NDHWC | NCDHW
  ): Conv3DInfo = js.native
  @JSName("convertConv2DDataFormat")
  def convertConv2DDataFormat_NCHW(dataFormat: NCHW): channelsLast | channelsFirst = js.native
  @JSName("convertConv2DDataFormat")
  def convertConv2DDataFormat_NHWC(dataFormat: NHWC): channelsLast | channelsFirst = js.native
  def eitherStridesOrDilationsAreOne(strides: js.Array[Double], dilations: js.Array[Double]): Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: js.Array[Double], dilations: Double): Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: Double, dilations: js.Array[Double]): Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: Double, dilations: Double): Boolean = js.native
  def expandShapeToKeepDim(shape: js.Array[Double], axes: js.Array[Double]): js.Array[Double] = js.native
  def getAxesPermutation(axes: js.Array[Double], rank: Double): js.Array[Double] | Null = js.native
  def getBroadcastDims(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = js.native
  def getInnerMostAxes(numAxes: Double, rank: Double): js.Array[Double] = js.native
  def getReductionAxes(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = js.native
  def getUndoAxesPermutation(axes: js.Array[Double]): js.Array[Double] = js.native
  def linspaceImpl(start: Double, stop: Double, num: Double): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R1] = js.native
  def reshapeTensor[T /* <: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank] */, R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    x: T,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def tupleValuesAreOne(param: js.Array[Double]): Boolean = js.native
  def tupleValuesAreOne(param: Double): Boolean = js.native
  def upcastType(typeA: DataType, typeB: DataType): DataType = js.native
}

