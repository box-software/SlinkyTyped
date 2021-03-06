package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import typingsSlinky.astDashTypes.genKindsMod.SpreadElementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait ArrayPattern extends ASTNode {
  var elements: js.Array[PatternKind | SpreadElementKind | Null]
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ArrayPattern
}

object ArrayPattern {
  @scala.inline
  def apply(
    elements: js.Array[PatternKind | SpreadElementKind | Null],
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ArrayPattern
  ): ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayPattern]
  }
}

