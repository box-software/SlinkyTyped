package typingsSlinky.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait JSXFragment
  extends Expression
     with BaseNode
     with Immutable
     with JSX {
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]
  var closingFragment: JSXClosingFragment
  var openingFragment: JSXOpeningFragment
  @JSName("type")
  var type_JSXFragment: typingsSlinky.atBabelTypes.atBabelTypesStrings.JSXFragment
}

object JSXFragment {
  @scala.inline
  def apply(
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    closingFragment: JSXClosingFragment,
    openingFragment: JSXOpeningFragment,
    `type`: typingsSlinky.atBabelTypes.atBabelTypesStrings.JSXFragment,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXFragment]
  }
}

@JSImport("@babel/types", "jsxFragment")
@js.native
object jsxFragment extends js.Object {
  def apply(
    openingFragment: JSXOpeningFragment,
    closingFragment: JSXClosingFragment,
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]
  ): JSXFragment = js.native
}

