package typingsSlinky.appdmg.appdmgMod

import typingsSlinky.appdmg.Anon_Height
import typingsSlinky.appdmg.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecificationWindow extends js.Object {
  var position: js.UndefOr[Anon_X] = js.undefined
  var size: js.UndefOr[Anon_Height] = js.undefined
}

object SpecificationWindow {
  @scala.inline
  def apply(position: Anon_X = null, size: Anon_Height = null): SpecificationWindow = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecificationWindow]
  }
}

