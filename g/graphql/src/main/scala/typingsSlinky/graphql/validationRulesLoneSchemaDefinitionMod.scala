package typingsSlinky.graphql

import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
import typingsSlinky.graphql.validationValidationContextMod.SDLValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/LoneSchemaDefinition", JSImport.Namespace)
@js.native
object validationRulesLoneSchemaDefinitionMod extends js.Object {
  def LoneSchemaDefinition(context: SDLValidationContext): ASTVisitor = js.native
  def canNotDefineSchemaWithinExtensionMessage(): String = js.native
  def schemaDefinitionNotAloneMessage(): String = js.native
}

