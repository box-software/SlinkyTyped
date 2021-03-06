package typingsSlinky.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayPattern
  extends Node
     with LVal
     with Pattern {
  var elements: js.Array[Expression]
  var typeAnnotation: js.UndefOr[TypeAnnotation] = js.undefined
  @JSName("type")
  var type_ArrayPattern: typingsSlinky.babelDashTypes.babelDashTypesStrings.ArrayPattern
}

object ArrayPattern {
  @scala.inline
  def apply(
    elements: js.Array[Expression],
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsSlinky.babelDashTypes.babelDashTypesStrings.ArrayPattern,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation = null
  ): ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayPattern]
  }
}

@JSImport("babel-types", "arrayPattern")
@js.native
object arrayPattern extends js.Object {
  def apply(): ArrayPattern = js.native
  def apply(elements: js.Array[Expression]): ArrayPattern = js.native
  def apply(elements: js.Array[Expression], typeAnnotation: TypeAnnotation): ArrayPattern = js.native
}

