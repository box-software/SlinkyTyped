package typingsSlinky.babelDashTypes.babelDashTypesMod

import typingsSlinky.babelDashTypes.babelDashTypesStrings.constructor
import typingsSlinky.babelDashTypes.babelDashTypesStrings.get
import typingsSlinky.babelDashTypes.babelDashTypesStrings.method
import typingsSlinky.babelDashTypes.babelDashTypesStrings.module
import typingsSlinky.babelDashTypes.babelDashTypesStrings.script
import typingsSlinky.babelDashTypes.babelDashTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelDashTypes.babelDashTypesMod.FunctionDeclaration
  - typings.babelDashTypes.babelDashTypesMod.FunctionExpression
  - typings.babelDashTypes.babelDashTypesMod.Program
  - typings.babelDashTypes.babelDashTypesMod.ObjectMethod
  - typings.babelDashTypes.babelDashTypesMod.ArrowFunctionExpression
  - typings.babelDashTypes.babelDashTypesMod.ClassMethod
*/
trait FunctionParent extends js.Object

object FunctionParent {
  @scala.inline
  def ObjectMethod(
    async: Boolean,
    body: BlockStatement,
    computed: Boolean,
    end: Double,
    generator: Boolean,
    id: Identifier,
    key: Expression,
    kind: get | set | method,
    loc: SourceLocation,
    params: js.Array[LVal],
    shorthand: Boolean,
    start: Double,
    `type`: typingsSlinky.babelDashTypes.babelDashTypesStrings.ObjectMethod,
    value: Expression,
    decorators: js.Array[Decorator] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): FunctionParent = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionParent]
  }
  @scala.inline
  def ArrowFunctionExpression(
    async: Boolean,
    body: BlockStatement | Expression,
    end: Double,
    expression: Boolean,
    generator: Boolean,
    id: Identifier,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double,
    `type`: typingsSlinky.babelDashTypes.babelDashTypesStrings.ArrowFunctionExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): FunctionParent = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionParent]
  }
  @scala.inline
  def FunctionExpression(
    async: Boolean,
    body: BlockStatement,
    end: Double,
    generator: Boolean,
    id: Identifier,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double,
    `type`: typingsSlinky.babelDashTypes.babelDashTypesStrings.FunctionExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): FunctionParent = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionParent]
  }
  @scala.inline
  def ClassMethod(
    async: Boolean,
    body: BlockStatement,
    computed: Boolean,
    end: Double,
    expression: Boolean,
    generator: Boolean,
    id: Identifier,
    key: Expression,
    kind: constructor | method | get | set,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double,
    static: Boolean,
    `type`: typingsSlinky.babelDashTypes.babelDashTypesStrings.ClassMethod,
    decorators: js.Array[Decorator] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null,
    value: FunctionExpression = null
  ): FunctionParent = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionParent]
  }
  @scala.inline
  def Program(
    body: js.Array[Statement | ModuleDeclaration],
    end: Double,
    loc: SourceLocation,
    sourceType: script | module,
    start: Double,
    `type`: typingsSlinky.babelDashTypes.babelDashTypesStrings.Program,
    directives: js.Array[Directive] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): FunctionParent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionParent]
  }
  @scala.inline
  def FunctionDeclaration(
    async: Boolean,
    body: BlockStatement,
    end: Double,
    generator: Boolean,
    id: Identifier,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double,
    `type`: typingsSlinky.babelDashTypes.babelDashTypesStrings.FunctionDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): FunctionParent = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionParent]
  }
}

