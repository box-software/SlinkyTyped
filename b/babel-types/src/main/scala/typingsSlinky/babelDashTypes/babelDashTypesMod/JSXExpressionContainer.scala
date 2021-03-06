package typingsSlinky.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXExpressionContainer
  extends Node
     with Immutable
     with JSX {
  var expression: Expression
  @JSName("type")
  var type_JSXExpressionContainer: typingsSlinky.babelDashTypes.babelDashTypesStrings.JSXExpressionContainer
}

object JSXExpressionContainer {
  @scala.inline
  def apply(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: typingsSlinky.babelDashTypes.babelDashTypesStrings.JSXExpressionContainer,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXExpressionContainer]
  }
}

@JSImport("babel-types", "jSXExpressionContainer")
@js.native
object jSXExpressionContainer extends js.Object {
  def apply(): JSXExpressionContainer = js.native
  def apply(expression: Expression): JSXExpressionContainer = js.native
}

