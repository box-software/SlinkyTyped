package typingsSlinky.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FilterWithStateStream")
@js.native
class FilterWithStateStream ()
  extends typingsSlinky.wonderDashFrp.distCommonjsStreamFilterWithStateStreamMod.FilterWithStateStream

/* static members */
@JSImport("wonder-frp/dist/commonjs", "FilterWithStateStream")
@js.native
object FilterWithStateStream extends js.Object {
  def create(
    source: typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream], 
      Boolean
    ],
    thisArg: js.Any
  ): typingsSlinky.wonderDashFrp.distCommonjsStreamFilterWithStateStreamMod.FilterWithStateStream = js.native
}

