package typingsSlinky.astDashTypes.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSObjectKeyword extends ASTNode {
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSObjectKeyword
}

object TSObjectKeyword {
  @scala.inline
  def apply(`type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSObjectKeyword): TSObjectKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSObjectKeyword]
  }
}

