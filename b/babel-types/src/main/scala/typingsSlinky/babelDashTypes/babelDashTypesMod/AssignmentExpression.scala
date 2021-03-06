package typingsSlinky.babelDashTypes.babelDashTypesMod

import typingsSlinky.babelDashTypes.babelDashTypesStrings.AmpersandEqualssign
import typingsSlinky.babelDashTypes.babelDashTypesStrings.AsteriskEqualssign
import typingsSlinky.babelDashTypes.babelDashTypesStrings.Equalssign
import typingsSlinky.babelDashTypes.babelDashTypesStrings.GreaterthansignGreaterthansignEqualssign
import typingsSlinky.babelDashTypes.babelDashTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typingsSlinky.babelDashTypes.babelDashTypesStrings.LessthansignLessthansignEqualssign
import typingsSlinky.babelDashTypes.babelDashTypesStrings.PercentsignEqualssign
import typingsSlinky.babelDashTypes.babelDashTypesStrings.PlussignEqualssign
import typingsSlinky.babelDashTypes.babelDashTypesStrings.SlashEqualssign
import typingsSlinky.babelDashTypes.babelDashTypesStrings.VerticallineEqualssign
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`-Equalssign`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`^Equalssign`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentExpression
  extends Node
     with Expression {
  var left: LVal
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
  var right: Expression
  @JSName("type")
  var type_AssignmentExpression: typingsSlinky.babelDashTypes.babelDashTypesStrings.AssignmentExpression
}

object AssignmentExpression {
  @scala.inline
  def apply(
    end: Double,
    left: LVal,
    loc: SourceLocation,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    right: Expression,
    start: Double,
    `type`: typingsSlinky.babelDashTypes.babelDashTypesStrings.AssignmentExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentExpression = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentExpression]
  }
}

@JSImport("babel-types", "assignmentExpression")
@js.native
object assignmentExpression extends js.Object {
  def apply(): AssignmentExpression = js.native
  def apply(operator: String): AssignmentExpression = js.native
  def apply(operator: String, left: LVal): AssignmentExpression = js.native
  def apply(operator: String, left: LVal, right: Expression): AssignmentExpression = js.native
}

