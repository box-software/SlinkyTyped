package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.FlowTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait ObjectTypeSpreadProperty extends ASTNode {
  var argument: FlowTypeKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ObjectTypeSpreadProperty
}

object ObjectTypeSpreadProperty {
  @scala.inline
  def apply(
    argument: FlowTypeKind,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ObjectTypeSpreadProperty
  ): ObjectTypeSpreadProperty = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeSpreadProperty]
  }
}

