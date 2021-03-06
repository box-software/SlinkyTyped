package typingsSlinky.activexDashExcel.Excel

import typingsSlinky.activexDashOffice.Office.CanvasShapes
import typingsSlinky.activexDashOffice.Office.GlowFormat
import typingsSlinky.activexDashOffice.Office.MsoAutoShapeType
import typingsSlinky.activexDashOffice.Office.MsoBackgroundStyleIndex
import typingsSlinky.activexDashOffice.Office.MsoBlackWhiteMode
import typingsSlinky.activexDashOffice.Office.MsoFlipCmd
import typingsSlinky.activexDashOffice.Office.MsoScaleFrom
import typingsSlinky.activexDashOffice.Office.MsoShapeStyleIndex
import typingsSlinky.activexDashOffice.Office.MsoShapeType
import typingsSlinky.activexDashOffice.Office.MsoTriState
import typingsSlinky.activexDashOffice.Office.MsoZOrderCmd
import typingsSlinky.activexDashOffice.Office.ReflectionFormat
import typingsSlinky.activexDashOffice.Office.SoftEdgeFormat
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Shape")
@js.native
class Shape protected () extends js.Object {
  @JSName("Adjustments")
  val Adjustments_Original: Adjustments = js.native
  var AlternativeText: String = js.native
  val Application: typingsSlinky.activexDashExcel.Excel.Application = js.native
  var AutoShapeType: MsoAutoShapeType = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var BlackWhiteMode: MsoBlackWhiteMode = js.native
  @JSName("BottomRightCell")
  val BottomRightCell_Original: Range = js.native
  val Callout: CalloutFormat = js.native
  @JSName("CanvasItems")
  val CanvasItems_Original: CanvasShapes = js.native
  val Chart: typingsSlinky.activexDashExcel.Excel.Chart = js.native
  val Child: MsoTriState = js.native
  val ConnectionSiteCount: Double = js.native
  val Connector: MsoTriState = js.native
  val ConnectorFormat: typingsSlinky.activexDashExcel.Excel.ConnectorFormat = js.native
  val ControlFormat: typingsSlinky.activexDashExcel.Excel.ControlFormat = js.native
  val Creator: XlCreator = js.native
  val Diagram: typingsSlinky.activexDashExcel.Excel.Diagram = js.native
  val DiagramNode: typingsSlinky.activexDashExcel.Excel.DiagramNode = js.native
  val DrawingObject: js.Any = js.native
  @JSName("Excel.Shape_typekey")
  var ExcelDotShape_typekey: Shape = js.native
  val Fill: FillFormat = js.native
  val FormControlType: XlFormControl = js.native
  val Glow: GlowFormat = js.native
  @JSName("GroupItems")
  val GroupItems_Original: GroupShapes = js.native
  val HasChart: MsoTriState = js.native
  val HasDiagram: MsoTriState = js.native
  val HasDiagramNode: MsoTriState = js.native
  val HasSmartArt: MsoTriState = js.native
  var Height: Double = js.native
  val HorizontalFlip: MsoTriState = js.native
  val Hyperlink: typingsSlinky.activexDashExcel.Excel.Hyperlink = js.native
  val ID: Double = js.native
  var Left: Double = js.native
  val Line: LineFormat = js.native
  val LinkFormat: typingsSlinky.activexDashExcel.Excel.LinkFormat = js.native
  var LockAspectRatio: MsoTriState = js.native
  var Locked: Boolean = js.native
  var Name: String = js.native
  @JSName("Nodes")
  val Nodes_Original: ShapeNodes = js.native
  val OLEFormat: typingsSlinky.activexDashExcel.Excel.OLEFormat = js.native
  var OnAction: String = js.native
  val Parent: js.Any = js.native
  val ParentGroup: Shape = js.native
  val PictureFormat: typingsSlinky.activexDashExcel.Excel.PictureFormat = js.native
  var Placement: XlPlacement = js.native
  val Reflection: ReflectionFormat = js.native
  var Rotation: Double = js.native
  val Script: typingsSlinky.activexDashOffice.Office.Script = js.native
  val Shadow: ShadowFormat = js.native
  var ShapeStyle: MsoShapeStyleIndex = js.native
  val SmartArt: typingsSlinky.activexDashOffice.Office.SmartArt = js.native
  val SoftEdge: SoftEdgeFormat = js.native
  val TextEffect: TextEffectFormat = js.native
  val TextFrame: typingsSlinky.activexDashExcel.Excel.TextFrame = js.native
  val TextFrame2: typingsSlinky.activexDashExcel.Excel.TextFrame2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var Title: String = js.native
  var Top: Double = js.native
  @JSName("TopLeftCell")
  val TopLeftCell_Original: Range = js.native
  val Type: MsoShapeType = js.native
  val VerticalFlip: MsoTriState = js.native
  val Vertices: SafeArray[Double] = js.native
  var Visible: MsoTriState = js.native
  var Width: Double = js.native
  val ZOrderPosition: Double = js.native
  def Adjustments(Index: Double): Double = js.native
  def Apply(): Unit = js.native
  def BottomRightCell(Address: String): Range = js.native
  def BottomRightCell(RowIndex: Double): Range = js.native
  def BottomRightCell(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def CanvasCropBottom(Increment: Double): Unit = js.native
  def CanvasCropLeft(Increment: Double): Unit = js.native
  def CanvasCropRight(Increment: Double): Unit = js.native
  def CanvasCropTop(Increment: Double): Unit = js.native
  def CanvasItems(Index: String): typingsSlinky.activexDashOffice.Office.Shape = js.native
  def CanvasItems(Index: Double): typingsSlinky.activexDashOffice.Office.Shape = js.native
  def Copy(): Unit = js.native
  def CopyPicture(): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Duplicate(): Shape = js.native
  def Flip(FlipCmd: MsoFlipCmd): Unit = js.native
  def GroupItems(Index: String): Shape = js.native
  def GroupItems(Index: Double): Shape = js.native
  def IncrementLeft(Increment: Double): Unit = js.native
  def IncrementRotation(Increment: Double): Unit = js.native
  def IncrementTop(Increment: Double): Unit = js.native
  def Nodes(Index: String): ShapeNode = js.native
  def Nodes(Index: Double): ShapeNode = js.native
  def PickUp(): Unit = js.native
  def RerouteConnections(): Unit = js.native
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState, Scale: MsoScaleFrom): Unit = js.native
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState, Scale: MsoScaleFrom): Unit = js.native
  def Select(): Unit = js.native
  def Select(Replace: Boolean): Unit = js.native
  def SetShapesDefaultProperties(): Unit = js.native
  def TopLeftCell(Address: String): Range = js.native
  def TopLeftCell(RowIndex: Double): Range = js.native
  def TopLeftCell(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Ungroup(): ShapeRange = js.native
  def ZOrder(ZOrderCmd: MsoZOrderCmd): Unit = js.native
}

