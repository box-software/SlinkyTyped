package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Anon_DotsDurationPositions
import typingsSlinky.vexflow.Anon_Fret
import typingsSlinky.vexflow.Anon_X
import typingsSlinky.vexflow.Vex.Flow.Modifier.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TabNote")
@js.native
class TabNote protected () extends StemmableNote {
  def this(tab_struct: Anon_DotsDurationPositions) = this()
  def this(tab_struct: Anon_DotsDurationPositions, draw_stem: Boolean) = this()
  def addDot(): TabNote = js.native
  def draw(): Unit = js.native
  def drawFlag(): Unit = js.native
  def drawModifiers(): Unit = js.native
  def drawStemThrough(): Unit = js.native
  def getModifierStartXY(position: Position, index: Double): Anon_X = js.native
  def getPositions(): js.Array[Anon_Fret] = js.native
  def getStemY(): Double = js.native
  def getTieLeftX(): Double = js.native
  def getTieRightX(): Double = js.native
  def setGhost(ghost: Boolean): TabNote = js.native
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes
  @JSName("setStave")
  def setStave_Note(stave: Stave): Note = js.native
  def updateWidth(): Unit = js.native
}

