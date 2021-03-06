package typingsSlinky.lasso

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLassoMod {
  import typingsSlinky.lasso.libLassoPageResultMod.LassoPageResult

  type Callback = js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[js.Any], js.Any]
  type LassoPage = js.Function2[
    /* options */ PageConfig, 
    /* callback */ js.UndefOr[js.Function2[/* err */ js.Error | Null, /* result */ LassoPageResult, Unit]], 
    js.Promise[js.Any]
  ]
  type LassoResource = js.Function3[
    /* path */ String, 
    /* options */ js.UndefOr[js.Any], 
    /* callback */ js.UndefOr[Callback], 
    Unit
  ]
}
