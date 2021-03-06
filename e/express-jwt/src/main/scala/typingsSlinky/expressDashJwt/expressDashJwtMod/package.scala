package typingsSlinky.expressDashJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashJwtMod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typingsSlinky.node.Buffer

  type GetTokenCallback = js.Function1[/* req */ Request[ParamsDictionary], js.Any]
  type IsRevokedCallback = js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* revoked */ js.UndefOr[Boolean], Unit], 
    Unit
  ]
  type SecretCallback = js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit], 
    Unit
  ]
  type SecretCallbackLong = js.Function4[
    /* req */ Request[ParamsDictionary], 
    /* header */ js.Any, 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit], 
    Unit
  ]
  type secretType = String | Buffer
}
