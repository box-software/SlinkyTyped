package typingsSlinky.tslint

import typingsSlinky.tslint.libLanguageRuleAbstractRuleMod.AbstractRule
import typingsSlinky.tslint.libLanguageRuleRuleMod.IOptions
import typingsSlinky.tslint.libLanguageRuleRuleMod.ITypedRule
import typingsSlinky.tslint.libLanguageRuleRuleMod.RuleFailure
import typingsSlinky.tslint.libLanguageWalkerWalkerMod.IWalker
import typingsSlinky.typescript.typescriptMod.Program
import typingsSlinky.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/typedRule", JSImport.Namespace)
@js.native
object libLanguageRuleTypedRuleMod extends js.Object {
  @js.native
  abstract class TypedRule ()
    extends AbstractRule
       with ITypedRule {
    @JSName("apply")
    def apply(): js.Array[RuleFailure] = js.native
    /* CompleteClass */
    @JSName("apply")
    override def apply(sourceFile: SourceFile): js.Array[RuleFailure] = js.native
    /* CompleteClass */
    override def applyWithProgram(sourceFile: SourceFile, program: Program): js.Array[RuleFailure] = js.native
    /* CompleteClass */
    override def applyWithWalker(walker: IWalker): js.Array[RuleFailure] = js.native
    /* CompleteClass */
    override def getOptions(): IOptions = js.native
    /* CompleteClass */
    override def isEnabled(): Boolean = js.native
  }
  
}

