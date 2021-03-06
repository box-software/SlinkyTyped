package typingsSlinky.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSEnumMember
  extends BaseNode
     with _Node {
  var id: Identifier | StringLiteral
  var initializer: Expression | Null
  @JSName("type")
  var type_TSEnumMember: typingsSlinky.atBabelTypes.atBabelTypesStrings.TSEnumMember
}

object TSEnumMember {
  @scala.inline
  def apply(
    id: Identifier | StringLiteral,
    `type`: typingsSlinky.atBabelTypes.atBabelTypesStrings.TSEnumMember,
    end: Int | Double = null,
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSEnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSEnumMember]
  }
}

@JSImport("@babel/types", "tsEnumMember")
@js.native
object tsEnumMember extends js.Object {
  def apply(id: Identifier): TSEnumMember = js.native
  def apply(id: Identifier, initializer: Expression): TSEnumMember = js.native
  def apply(id: StringLiteral): TSEnumMember = js.native
  def apply(id: StringLiteral, initializer: Expression): TSEnumMember = js.native
}

