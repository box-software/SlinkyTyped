package typingsSlinky.baidumapDashWebDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item extends js.Object {
  var item: js.Any
  var target: js.Any
  var `type`: String
}

object Anon_Item {
  @scala.inline
  def apply(item: js.Any, target: js.Any, `type`: String): Anon_Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Item]
  }
}

