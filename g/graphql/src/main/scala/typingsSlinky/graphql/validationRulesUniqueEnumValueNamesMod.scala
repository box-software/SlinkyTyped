package typingsSlinky.graphql

import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
import typingsSlinky.graphql.validationValidationContextMod.SDLValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueEnumValueNames", JSImport.Namespace)
@js.native
object validationRulesUniqueEnumValueNamesMod extends js.Object {
  def UniqueEnumValueNames(context: SDLValidationContext): ASTVisitor = js.native
  def duplicateEnumValueNameMessage(typeName: String, valueName: String): String = js.native
  def existedEnumValueNameMessage(typeName: String, valueName: String): String = js.native
}

