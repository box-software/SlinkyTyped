package typingsSlinky.gapiDotClientDotStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  /** While set to true, versioning is fully enabled for this bucket. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object Anon_Enabled {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): Anon_Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Enabled]
  }
}

