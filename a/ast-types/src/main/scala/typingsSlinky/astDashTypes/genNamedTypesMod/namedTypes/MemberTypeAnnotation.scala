package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.FlowKind
import typingsSlinky.astDashTypes.genKindsMod.FlowTypeKind
import typingsSlinky.astDashTypes.genKindsMod.GenericTypeAnnotationKind
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.MemberTypeAnnotationKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait MemberTypeAnnotation
  extends ASTNode
     with FlowKind
     with FlowTypeKind
     with NodeKind
     with PrintableKind {
  var `object`: IdentifierKind
  var property: MemberTypeAnnotationKind | GenericTypeAnnotationKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.MemberTypeAnnotation
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.MemberTypeAnnotation")
@js.native
object MemberTypeAnnotation extends TopLevel[Type[MemberTypeAnnotation]]

