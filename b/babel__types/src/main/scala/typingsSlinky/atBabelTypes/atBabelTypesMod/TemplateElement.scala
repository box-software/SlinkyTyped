package typingsSlinky.atBabelTypes.atBabelTypesMod

import typingsSlinky.atBabelTypes.Anon_Cooked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateElement
  extends BaseNode
     with _Node {
  var tail: Boolean
  @JSName("type")
  var type_TemplateElement: typingsSlinky.atBabelTypes.atBabelTypesStrings.TemplateElement
  var value: Anon_Cooked
}

object TemplateElement {
  @scala.inline
  def apply(
    tail: Boolean,
    `type`: typingsSlinky.atBabelTypes.atBabelTypesStrings.TemplateElement,
    value: Anon_Cooked,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TemplateElement = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateElement]
  }
}

@JSImport("@babel/types", "templateElement")
@js.native
object templateElement extends js.Object {
  def apply(value: Anon_Cooked): TemplateElement = js.native
  def apply(value: Anon_Cooked, tail: Boolean): TemplateElement = js.native
}

