package typingsSlinky.tslint

import typingsSlinky.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsSlinky.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/arrowReturnShorthandRule", JSImport.Namespace)
@js.native
object libRulesArrowReturnShorthandRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING(isObjectLiteral: Boolean): String = js.native
  }
  
}

