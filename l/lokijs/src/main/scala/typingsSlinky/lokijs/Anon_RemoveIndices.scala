package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RemoveIndices extends js.Object {
  var removeIndices: js.UndefOr[Boolean] = js.undefined
}

object Anon_RemoveIndices {
  @scala.inline
  def apply(removeIndices: js.UndefOr[Boolean] = js.undefined): Anon_RemoveIndices = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(removeIndices)) __obj.updateDynamic("removeIndices")(removeIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RemoveIndices]
  }
}

