package typingsSlinky.esprimaDashWalk

import typingsSlinky.estree.estreeMod.Node
import typingsSlinky.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esprima-walk", JSImport.Namespace)
@js.native
object esprimaDashWalkMod extends js.Object {
  /**
    * Walk the provided AST; fn is called once for each node with a `type`
    * @param {ESTree.Program} ast program to walk
    * @param {function} fn function invoked for each node with type
    */
  def apply(ast: Program, fn: js.Function1[/* node */ Node, Unit]): Unit = js.native
  def walk(ast: Program, fn: js.Function1[/* node */ Node, Unit]): Unit = js.native
  def walkAddParent(ast: Program, fn: js.Function1[/* node */ NodeWithParent, Unit]): Unit = js.native
  type NodeWithParent = org.scalajs.dom.raw.Node with Anon_Parent
}

