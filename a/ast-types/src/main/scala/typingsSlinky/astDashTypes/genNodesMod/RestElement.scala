package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import typingsSlinky.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typingsSlinky.astDashTypes.genKindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait RestElement extends ASTNode {
  var argument: PatternKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.RestElement
  var typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind | Null
}

object RestElement {
  @scala.inline
  def apply(
    argument: PatternKind,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.RestElement,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null
  ): RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestElement]
  }
}

