package typingsSlinky.apolloDashServer.distExportsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "addSchemaLevelResolveFunction")
@js.native
object addSchemaLevelResolveFunction extends js.Object {
  def apply(schema: GraphQLSchema, fn: GraphQLFieldResolver[_, _, StringDictionary[_]]): Unit = js.native
}

