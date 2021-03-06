package typingsSlinky.reactDashToastDashNotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashToastDashNotificationsMod {
  import slinky.core.TagMod

  type AddToast = js.Function3[
    /* content */ TagMod[Any], 
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]], 
    Unit
  ]
  type RemoveAllToasts = js.Function0[Unit]
  type RemoveToast = js.Function2[/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]], Unit]
  type UpdateToast = js.Function3[
    /* id */ String, 
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]], 
    Unit
  ]
}
