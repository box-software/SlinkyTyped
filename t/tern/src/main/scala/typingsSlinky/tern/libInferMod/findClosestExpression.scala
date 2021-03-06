package typingsSlinky.tern.libInferMod

import typingsSlinky.estree.estreeMod.Program
import typingsSlinky.tern.Anon_Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", "findClosestExpression")
@js.native
object findClosestExpression extends js.Object {
  def apply(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): Anon_Node | Null = js.native
  def apply(ast: Program, start: js.UndefOr[scala.Nothing], end: Double, scope: Scope): Anon_Node | Null = js.native
  def apply(ast: Program, start: Double, end: Double): Anon_Node | Null = js.native
  def apply(ast: Program, start: Double, end: Double, scope: Scope): Anon_Node | Null = js.native
}

