package typingsSlinky.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclareTypeAlias
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier
  var right: FlowTypeAnnotation
  var typeParameters: TypeParameterDeclaration
  @JSName("type")
  var type_DeclareTypeAlias: typingsSlinky.babelDashTypes.babelDashTypesStrings.DeclareTypeAlias
}

object DeclareTypeAlias {
  @scala.inline
  def apply(
    end: Double,
    id: Identifier,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    `type`: typingsSlinky.babelDashTypes.babelDashTypesStrings.DeclareTypeAlias,
    typeParameters: TypeParameterDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): DeclareTypeAlias = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareTypeAlias]
  }
}

@JSImport("babel-types", "declareTypeAlias")
@js.native
object declareTypeAlias extends js.Object {
  def apply(): DeclareTypeAlias = js.native
  def apply(id: Identifier): DeclareTypeAlias = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration): DeclareTypeAlias = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration, right: FlowTypeAnnotation): DeclareTypeAlias = js.native
}

