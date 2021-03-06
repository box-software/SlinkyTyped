package typingsSlinky.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait NumberLiteralTypeAnnotation
  extends Flow
     with BaseNode
     with FlowType {
  @JSName("type")
  var type_NumberLiteralTypeAnnotation: typingsSlinky.atBabelTypes.atBabelTypesStrings.NumberLiteralTypeAnnotation
  var value: Double
}

object NumberLiteralTypeAnnotation {
  @scala.inline
  def apply(
    `type`: typingsSlinky.atBabelTypes.atBabelTypesStrings.NumberLiteralTypeAnnotation,
    value: Double,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): NumberLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLiteralTypeAnnotation]
  }
}

@JSImport("@babel/types", "numberLiteralTypeAnnotation")
@js.native
object numberLiteralTypeAnnotation extends js.Object {
  def apply(value: Double): NumberLiteralTypeAnnotation = js.native
}

