package typingsSlinky.nextDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmpFirst extends js.Object {
  var ampFirst: js.UndefOr[Boolean] = js.undefined
  var hasQuery: js.UndefOr[Boolean] = js.undefined
  var hybrid: js.UndefOr[Boolean] = js.undefined
}

object Anon_AmpFirst {
  @scala.inline
  def apply(
    ampFirst: js.UndefOr[Boolean] = js.undefined,
    hasQuery: js.UndefOr[Boolean] = js.undefined,
    hybrid: js.UndefOr[Boolean] = js.undefined
  ): Anon_AmpFirst = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ampFirst)) __obj.updateDynamic("ampFirst")(ampFirst.asInstanceOf[js.Any])
    if (!js.isUndefined(hasQuery)) __obj.updateDynamic("hasQuery")(hasQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(hybrid)) __obj.updateDynamic("hybrid")(hybrid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AmpFirst]
  }
}

