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
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait NullLiteralTypeAnnotation
  extends ASTNode
     with FlowKind
     with FlowTypeKind
     with NodeKind
     with PrintableKind {
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.NullLiteralTypeAnnotation
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.NullLiteralTypeAnnotation")
@js.native
object NullLiteralTypeAnnotation extends TopLevel[Type[NullLiteralTypeAnnotation]]

