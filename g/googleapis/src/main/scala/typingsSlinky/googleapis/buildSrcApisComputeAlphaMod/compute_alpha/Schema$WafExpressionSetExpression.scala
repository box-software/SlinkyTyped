package typingsSlinky.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$WafExpressionSetExpression extends js.Object {
  /**
    * Expression ID should uniquely identify the origin of the expression. E.g.
    * owasp-crs-v020901-id973337 identifies Owasp core rule set version 2.9.1
    * rule id 973337. The ID could be used to determine the individual attack
    * definition that has been detected. It could also be used to exclude it
    * from the policy in case of false positive.
    */
  var id: js.UndefOr[String] = js.native
}

object Schema$WafExpressionSetExpression {
  @scala.inline
  def apply(id: String = null): Schema$WafExpressionSetExpression = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WafExpressionSetExpression]
  }
}

