package typingsSlinky.tern

import typingsSlinky.estree.estreeMod.Node
import typingsSlinky.tern.libInferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node extends js.Object {
  var node: Node
  var state: Scope
}

object Anon_Node {
  @scala.inline
  def apply(node: Node, state: Scope): Anon_Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Node]
  }
}

