package typingsSlinky.activexDashWord.Word

import typingsSlinky.activexDashOffice.Office.MsoDiagramNodeType
import typingsSlinky.activexDashOffice.Office.MsoOrgChartLayoutType
import typingsSlinky.activexDashOffice.Office.MsoRelativeNodePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.DiagramNode")
@js.native
class DiagramNode protected () extends js.Object {
  val Application: typingsSlinky.activexDashWord.Word.Application = js.native
  val Children: DiagramNodeChildren = js.native
  val Creator: Double = js.native
  val Diagram: typingsSlinky.activexDashWord.Word.Diagram = js.native
  var Layout: MsoOrgChartLayoutType = js.native
  val Parent: js.Any = js.native
  val Root: DiagramNode = js.native
  val Shape: typingsSlinky.activexDashWord.Word.Shape = js.native
  val TextShape: typingsSlinky.activexDashWord.Word.Shape = js.native
  @JSName("Word.DiagramNode_typekey")
  var WordDotDiagramNode_typekey: DiagramNode = js.native
  /**
    * @param Office.MsoRelativeNodePosition [Pos=2]
    * @param Office.MsoDiagramNodeType [NodeType=1]
    */
  def AddNode(): DiagramNode = js.native
  def AddNode(Pos: MsoRelativeNodePosition): DiagramNode = js.native
  def AddNode(Pos: MsoRelativeNodePosition, NodeType: MsoDiagramNodeType): DiagramNode = js.native
  /**
    * @param Word.DiagramNode [TargetNode=0]
    * @param Office.MsoRelativeNodePosition [Pos=2]
    */
  def CloneNode(copyChildren: Boolean): DiagramNode = js.native
  def CloneNode(copyChildren: Boolean, TargetNode: DiagramNode): DiagramNode = js.native
  def CloneNode(copyChildren: Boolean, TargetNode: DiagramNode, Pos: MsoRelativeNodePosition): DiagramNode = js.native
  def Delete(): Unit = js.native
  def MoveNode(TargetNode: DiagramNode, Pos: MsoRelativeNodePosition): Unit = js.native
  def NextNode(): DiagramNode = js.native
  def PrevNode(): DiagramNode = js.native
  def ReplaceNode(TargetNode: DiagramNode): Unit = js.native
  /** @param Office.MsoRelativeNodePosition [Pos=-1] */
  def SwapNode(TargetNode: DiagramNode): Unit = js.native
  def SwapNode(TargetNode: DiagramNode, Pos: MsoRelativeNodePosition): Unit = js.native
  def TransferChildren(ReceivingNode: DiagramNode): Unit = js.native
}

