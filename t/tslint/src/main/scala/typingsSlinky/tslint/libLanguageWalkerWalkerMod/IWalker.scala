package typingsSlinky.tslint.libLanguageWalkerWalkerMod

import typingsSlinky.tslint.libLanguageRuleRuleMod.RuleFailure
import typingsSlinky.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWalker extends js.Object {
  def getFailures(): js.Array[RuleFailure]
  def getSourceFile(): SourceFile
  def walk(sourceFile: SourceFile): Unit
}

object IWalker {
  @scala.inline
  def apply(
    getFailures: () => js.Array[RuleFailure],
    getSourceFile: () => SourceFile,
    walk: SourceFile => Unit
  ): IWalker = {
    val __obj = js.Dynamic.literal(getFailures = js.Any.fromFunction0(getFailures), getSourceFile = js.Any.fromFunction0(getSourceFile), walk = js.Any.fromFunction1(walk))
  
    __obj.asInstanceOf[IWalker]
  }
}

