package typingsSlinky.atMapboxMapboxDashSdk

import typingsSlinky.atMapboxMapboxDashSdk.servicesStylesMod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OwnerIdStyle extends js.Object {
  var ownerId: js.UndefOr[String] = js.undefined
  var style: Style
}

object Anon_OwnerIdStyle {
  @scala.inline
  def apply(style: Style, ownerId: String = null): Anon_OwnerIdStyle = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OwnerIdStyle]
  }
}

