package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.JSXIdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.JSXMemberExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.JSXNamespacedNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait JSXClosingElement extends ASTNode {
  var name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.JSXClosingElement
}

object JSXClosingElement {
  @scala.inline
  def apply(
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.JSXClosingElement
  ): JSXClosingElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingElement]
  }
}

