package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.FlowKind
import typingsSlinky.astDashTypes.genKindsMod.FlowTypeKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait UnionTypeAnnotation
  extends ASTNode
     with FlowKind
     with FlowTypeKind
     with NodeKind
     with PrintableKind {
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.UnionTypeAnnotation
  var types: js.Array[FlowTypeKind]
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.UnionTypeAnnotation")
@js.native
object UnionTypeAnnotation extends TopLevel[Type[UnionTypeAnnotation]]

