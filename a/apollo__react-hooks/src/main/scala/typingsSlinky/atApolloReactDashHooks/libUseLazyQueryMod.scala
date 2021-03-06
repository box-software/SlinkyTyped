package typingsSlinky.atApolloReactDashHooks

import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.QueryResult
import typingsSlinky.atApolloReactDashHooks.libTypesMod.LazyQueryHookOptions
import typingsSlinky.atApolloReactDashHooks.libTypesMod.QueryLazyOptions
import typingsSlinky.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/useLazyQuery", JSImport.Namespace)
@js.native
object libUseLazyQueryMod extends js.Object {
  def useLazyQuery[TData, TVariables](query: DocumentNode): js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ] = js.native
  def useLazyQuery[TData, TVariables](query: DocumentNode, options: LazyQueryHookOptions[TData, TVariables]): js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ] = js.native
}

