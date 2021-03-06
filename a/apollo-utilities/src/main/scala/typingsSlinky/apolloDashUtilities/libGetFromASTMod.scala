package typingsSlinky.apolloDashUtilities

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloDashUtilities.libStoreUtilsMod.JsonValue
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.languageAstMod.FragmentDefinitionNode
import typingsSlinky.graphql.languageAstMod.OperationDefinitionNode
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/getFromAST", JSImport.Namespace)
@js.native
object libGetFromASTMod extends js.Object {
  def checkDocument(doc: DocumentNode): DocumentNode = js.native
  def createFragmentMap(): FragmentMap = js.native
  def createFragmentMap(fragments: js.Array[FragmentDefinitionNode]): FragmentMap = js.native
  def getDefaultValues(): StringDictionary[JsonValue] = js.native
  def getDefaultValues(definition: OperationDefinitionNode): StringDictionary[JsonValue] = js.native
  def getFragmentDefinition(doc: DocumentNode): FragmentDefinitionNode = js.native
  def getFragmentDefinitions(doc: DocumentNode): js.Array[FragmentDefinitionNode] = js.native
  def getMainDefinition(queryDoc: DocumentNode): OperationDefinitionNode | FragmentDefinitionNode = js.native
  def getMutationDefinition(doc: DocumentNode): OperationDefinitionNode = js.native
  def getOperationDefinition(doc: DocumentNode): js.UndefOr[OperationDefinitionNode] = js.native
  def getOperationDefinitionOrDie(document: DocumentNode): OperationDefinitionNode = js.native
  def getOperationName(doc: DocumentNode): String | Null = js.native
  def getQueryDefinition(doc: DocumentNode): OperationDefinitionNode = js.native
  def variablesInOperation(operation: OperationDefinitionNode): Set[String] = js.native
  type FragmentMap = StringDictionary[FragmentDefinitionNode]
}

