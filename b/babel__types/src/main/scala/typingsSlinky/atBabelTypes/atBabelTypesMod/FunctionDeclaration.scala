package typingsSlinky.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait FunctionDeclaration
  extends BlockParent
     with BaseNode
     with Declaration
     with Function
     with FunctionParent
     with Pureish
     with Scopable
     with Statement {
  var async: Boolean
  var body: BlockStatement
  var declare: Boolean | Null
  var generator: Boolean
  var id: Identifier | Null
  var params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | Null
  var typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | Null
  @JSName("type")
  var type_FunctionDeclaration: typingsSlinky.atBabelTypes.atBabelTypesStrings.FunctionDeclaration
}

object FunctionDeclaration {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatement,
    generator: Boolean,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    `type`: typingsSlinky.atBabelTypes.atBabelTypesStrings.FunctionDeclaration,
    declare: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    id: Identifier = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop = null
  ): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDeclaration]
  }
}

@JSImport("@babel/types", "functionDeclaration")
@js.native
object functionDeclaration extends js.Object {
  def apply(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement
  ): FunctionDeclaration = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean
  ): FunctionDeclaration = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean,
    async: Boolean
  ): FunctionDeclaration = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean,
    async: Boolean,
    declare: Boolean
  ): FunctionDeclaration = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean,
    async: Boolean,
    declare: Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): FunctionDeclaration = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean,
    async: Boolean,
    declare: Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop
  ): FunctionDeclaration = js.native
}

