package typingsSlinky.astDashTypes.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait Noop extends ASTNode {
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.Noop
}

object Noop {
  @scala.inline
  def apply(`type`: typingsSlinky.astDashTypes.astDashTypesStrings.Noop): Noop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Noop]
  }
}

