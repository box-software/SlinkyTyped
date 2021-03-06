package typingsSlinky.graphqlDashReact.graphqlDashReactMod

import typingsSlinky.graphqlDashReact.Anon_Cache
import typingsSlinky.graphqlDashReact.Anon_CacheKey
import typingsSlinky.graphqlDashReact.Anon_CacheKeyCacheValuePromise
import typingsSlinky.graphqlDashReact.Anon_ExceptCacheKey
import typingsSlinky.graphqlDashReact.Anon_FetchOptionsOverride
import typingsSlinky.graphqlDashReact.graphqlDashReactStrings.cache
import typingsSlinky.graphqlDashReact.graphqlDashReactStrings.fetch
import typingsSlinky.graphqlDashReact.graphqlDashReactStrings.reset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react", "GraphQL")
@js.native
class GraphQL () extends js.Object {
  def this(options: Anon_Cache) = this()
  var cache: GraphQLCache = js.native
  @JSName("off")
  def off_cache(`type`: cache, handler: js.Function1[/* event */ Anon_CacheKey, Unit]): Unit = js.native
  @JSName("off")
  def off_fetch(`type`: fetch, handler: js.Function1[/* event */ Anon_CacheKeyCacheValuePromise, Unit]): Unit = js.native
  @JSName("off")
  def off_reset(`type`: reset, handler: js.Function1[/* event */ Anon_ExceptCacheKey, Unit]): Unit = js.native
  @JSName("on")
  def on_cache(`type`: cache, handler: js.Function1[/* event */ Anon_CacheKey, Unit]): Unit = js.native
  @JSName("on")
  def on_fetch(`type`: fetch, handler: js.Function1[/* event */ Anon_CacheKeyCacheValuePromise, Unit]): Unit = js.native
  @JSName("on")
  def on_reset(`type`: reset, handler: js.Function1[/* event */ Anon_ExceptCacheKey, Unit]): Unit = js.native
  def operate[T, V](options: Anon_FetchOptionsOverride[V]): GraphQLOperationLoading[T] = js.native
  def reset(): Unit = js.native
  def reset(exceptCacheKey: String): Unit = js.native
}

