package typingsSlinky.estreeDashJsx.estreeDashJsxMod

import typingsSlinky.estree.estreeMod.BaseNode
import typingsSlinky.estree.estreeMod.Comment
import typingsSlinky.estree.estreeMod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXEmptyExpression extends BaseNode {
  @JSName("type")
  var type_JSXEmptyExpression: typingsSlinky.estreeDashJsx.estreeDashJsxStrings.JSXEmptyExpression
}

object JSXEmptyExpression {
  @scala.inline
  def apply(
    `type`: typingsSlinky.estreeDashJsx.estreeDashJsxStrings.JSXEmptyExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXEmptyExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXEmptyExpression]
  }
}

