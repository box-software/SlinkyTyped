package typingsSlinky.styletronDashStandard

import typingsSlinky.styletronDashStandard.styletronDashStandardMod.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: js.UndefOr[Properties] = js.undefined
  var to: js.UndefOr[Properties] = js.undefined
}

object Anon_From {
  @scala.inline
  def apply(from: Properties = null, to: Properties = null): Anon_From = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_From]
  }
}

