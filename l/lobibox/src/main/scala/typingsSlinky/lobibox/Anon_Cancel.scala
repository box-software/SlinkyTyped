package typingsSlinky.lobibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var cancel: js.UndefOr[Anon_Class] = js.undefined
  var no: js.UndefOr[Anon_Class] = js.undefined
  var ok: js.UndefOr[Anon_Class] = js.undefined
  var yes: js.UndefOr[Anon_Class] = js.undefined
}

object Anon_Cancel {
  @scala.inline
  def apply(cancel: Anon_Class = null, no: Anon_Class = null, ok: Anon_Class = null, yes: Anon_Class = null): Anon_Cancel = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (no != null) __obj.updateDynamic("no")(no.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    if (yes != null) __obj.updateDynamic("yes")(yes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cancel]
  }
}

