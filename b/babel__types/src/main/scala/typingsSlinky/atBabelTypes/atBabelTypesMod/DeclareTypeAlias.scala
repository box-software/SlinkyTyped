package typingsSlinky.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait DeclareTypeAlias
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier
  var right: FlowType
  var typeParameters: TypeParameterDeclaration | Null
  @JSName("type")
  var type_DeclareTypeAlias: typingsSlinky.atBabelTypes.atBabelTypesStrings.DeclareTypeAlias
}

object DeclareTypeAlias {
  @scala.inline
  def apply(
    id: Identifier,
    right: FlowType,
    `type`: typingsSlinky.atBabelTypes.atBabelTypesStrings.DeclareTypeAlias,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): DeclareTypeAlias = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareTypeAlias]
  }
}

@JSImport("@babel/types", "declareTypeAlias")
@js.native
object declareTypeAlias extends js.Object {
  def apply(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], right: FlowType): DeclareTypeAlias = js.native
  def apply(id: Identifier, typeParameters: Null, right: FlowType): DeclareTypeAlias = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration, right: FlowType): DeclareTypeAlias = js.native
}

