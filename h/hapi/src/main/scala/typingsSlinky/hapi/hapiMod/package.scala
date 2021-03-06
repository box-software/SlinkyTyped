package typingsSlinky.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hapiMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.catbox.catboxMod.ClientOptions
  import typingsSlinky.catbox.catboxMod.EnginePrototype
  import typingsSlinky.catbox.catboxMod.PolicyOptionVariants
  import typingsSlinky.hapi.Anon_Cache
  import typingsSlinky.hapi.Anon_Constructor
  import typingsSlinky.hapi.Anon_Default
  import typingsSlinky.hapi.Anon_ExpiresAt
  import typingsSlinky.hapi.Anon_ExpiresAtExpiresIn
  import typingsSlinky.hapi.Anon_ExpiresAtExpiresInUndefined
  import typingsSlinky.hapi.hapiBooleans.`false`
  import typingsSlinky.hapi.hapiBooleans.`true`
  import typingsSlinky.hapi.hapiMod.Lifecycle.Method
  import typingsSlinky.hapi.hapiMod.Util.Dictionary
  import typingsSlinky.joi.joiMod.Schema
  import typingsSlinky.joi.joiMod.SchemaMap
  import typingsSlinky.joi.joiMod.ValidationOptions
  import typingsSlinky.node.Buffer
  import typingsSlinky.podium.podiumMod.Podium

  type CachePolicyOptions[T] = PolicyOptionVariants[T] with Anon_Cache
  type CacheProvider[T /* <: ClientOptions */] = EnginePrototype[js.Any] | Anon_Constructor[T]
  type DecorateName = String | js.Symbol
  type DecorationMethod[T] = js.ThisFunction1[/* this */ T, /* repeated */ js.Any, js.Any]
  type Dependencies = String | js.Array[String] | StringDictionary[String]
  type LogEventHandler = js.Function2[/* event */ LogEvent, /* tags */ StringDictionary[`true`], Unit]
  type PayloadCompressionDecoderSettings = js.Object
  type PeekListener = js.Function2[/* chunk */ String, /* encoding */ String, Unit]
  type Plugin[T] = PluginBase[T] with (PluginNameVersion | PluginPackage)
  type RequestEventHandler = js.Function3[
    /* request */ Request, 
    /* event */ RequestEvent, 
    /* tags */ StringDictionary[`true`], 
    Unit
  ]
  type RequestQuery = StringDictionary[String | js.Array[String]]
  type ResponseEventHandler = js.Function1[/* request */ Request, Unit]
  type ResponseValue = String | js.Object
  type RouteCompressionEncoderSettings = js.Object
  type RouteEventHandler = js.Function1[/* route */ RequestRoute, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.hapi.hapiMod.RouteOptionsAccessScopeObject
    - typings.hapi.hapiMod.RouteOptionsAccessEntityObject
    - typings.hapi.hapiMod.RouteOptionsAccessScopeObject with typings.hapi.hapiMod.RouteOptionsAccessEntityObject
  */
  type RouteOptionsAccessObject = _RouteOptionsAccessObject | (RouteOptionsAccessScopeObject with RouteOptionsAccessEntityObject)
  type RouteOptionsAccessScope = `false` | String | js.Array[String]
  type RouteOptionsCache = Anon_Default with (Anon_ExpiresAt | Anon_ExpiresAtExpiresIn | Anon_ExpiresAtExpiresInUndefined)
  type RouteOptionsPreAllOptions = RouteOptionsPreObject | js.Array[RouteOptionsPreObject] | Method
  type RouteOptionsPreArray = js.Array[RouteOptionsPreAllOptions]
  type RouteOptionsResponseSchema = Boolean | ValidationObject | Schema | (js.Function2[
    /* value */ js.Object | Buffer | String, 
    /* options */ ValidationOptions, 
    js.Promise[js.Any]
  ])
  type RouteOptionsSecure = Boolean | RouteOptionsSecureObject
  type ServerAuthConfig = RouteOptionsAccess
  type ServerAuthScheme = js.Function2[
    /* server */ Server, 
    /* options */ js.UndefOr[ServerAuthSchemeOptions], 
    ServerAuthSchemeObject
  ]
  type ServerAuthSchemeOptions = js.Object
  type ServerEventsApplication = String | ServerEventsApplicationObject | Podium
  type ServerExtPointFunction = js.Function1[/* server */ Server, Unit]
  type ServerMethod = js.Function1[/* repeated */ js.Any, js.Any]
  type ServerMethods = Dictionary[ServerMethod]
  type StartEventHandler = js.Function0[Unit]
  type StopEventHandler = js.Function0[Unit]
  type ValidationObject = SchemaMap
}
