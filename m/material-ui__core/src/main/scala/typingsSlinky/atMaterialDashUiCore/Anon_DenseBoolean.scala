package typingsSlinky.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DenseBoolean extends js.Object {
  var dense: js.UndefOr[Boolean] = js.native
}

object Anon_DenseBoolean {
  @scala.inline
  def apply(dense: js.UndefOr[Boolean] = js.undefined): Anon_DenseBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DenseBoolean]
  }
}

