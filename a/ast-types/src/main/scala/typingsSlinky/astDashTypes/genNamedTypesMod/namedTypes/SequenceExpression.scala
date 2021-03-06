package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait SequenceExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var expressions: js.Array[ExpressionKind]
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.SequenceExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.SequenceExpression")
@js.native
object SequenceExpression extends TopLevel[Type[SequenceExpression]]

