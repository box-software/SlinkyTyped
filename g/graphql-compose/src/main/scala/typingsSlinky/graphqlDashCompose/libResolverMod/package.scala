package typingsSlinky.graphqlDashCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libResolverMod {
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldConfigArgumentMap
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLOutputType
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLResolveInfo
  import typingsSlinky.graphqlDashCompose.libObjectTypeComposerMod.ComposeFieldConfigArgumentMap
  import typingsSlinky.graphqlDashCompose.libObjectTypeComposerMod.ComposeOutputType

  type ResolverFilterArgFn[TSource, TContext, TArgs] = js.Function3[
    /* query */ js.Any, 
    /* value */ js.Any, 
    /* resolveParams */ ResolveParams[TSource, TContext, TArgs], 
    js.Any
  ]
  type ResolverMiddleware[TSource, TContext, TArgs] = js.Function5[
    /* resolve */ js.Function4[
      /* source */ TSource, 
      /* args */ TArgs, 
      /* context */ TContext, 
      /* info */ GraphQLResolveInfo, 
      js.Any
    ], 
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    js.Any
  ]
  type ResolverNextRpCb[TSource, TContext, TArgs] = js.Function1[
    /* next */ ResolverRpCb[TSource, TContext, TArgs], 
    ResolverRpCb[TSource, TContext, TArgs]
  ]
  type ResolverRpCb[TSource, TContext, TArgs] = js.Function1[
    /* resolveParams */ ResolveParams[TSource, TContext, TArgs], 
    js.Promise[js.Any] | js.Any
  ]
  type ResolverSortArgFn[TSource, TContext, TArgs] = js.Function1[/* resolveParams */ ResolveParams[TSource, TContext, TArgs], js.Any]
  type ResolverWrapArgsCb[TArgs] = js.Function1[/* prevArgs */ GraphQLFieldConfigArgumentMap, ComposeFieldConfigArgumentMap[TArgs]]
  type ResolverWrapCb[TNewSource, TPrevSource, TContext, TNewArgs, TPrevArgs] = js.Function2[
    /* newResolver */ Resolver[TNewSource, TContext, TNewArgs, js.Any], 
    /* prevResolver */ Resolver[TPrevSource, TContext, TPrevArgs, js.Any], 
    Resolver[TNewSource, TContext, TNewArgs, js.Any]
  ]
  type ResolverWrapTypeCb[TContext, TReturn] = js.Function1[/* prevType */ GraphQLOutputType, ComposeOutputType[TReturn, TContext]]
}
