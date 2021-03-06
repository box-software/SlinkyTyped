package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Anon_Cps
import typingsSlinky.vexflow.Anon_Direction
import typingsSlinky.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Curve")
@js.native
class Curve_ protected () extends js.Object {
  def this(from: Note, to: Note) = this()
  def this(from: Note, to: Note, options: Anon_Cps) = this()
  def draw(): Boolean = js.native
  def isPartial(): Boolean = js.native
  def renderCurve(params: Anon_Direction): Unit = js.native
  def setContext(context: IRenderContext): Curve = js.native
  def setNotes(from: Note, to: Note): Curve = js.native
}

