package typingsSlinky.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMultiplexResponse extends js.Object {
  /**
    * The newly created multiplex.
    */
  var Multiplex: js.UndefOr[typingsSlinky.awsDashSdk.clientsMedialiveMod.Multiplex] = js.native
}

object CreateMultiplexResponse {
  @scala.inline
  def apply(Multiplex: Multiplex = null): CreateMultiplexResponse = {
    val __obj = js.Dynamic.literal()
    if (Multiplex != null) __obj.updateDynamic("Multiplex")(Multiplex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiplexResponse]
  }
}

