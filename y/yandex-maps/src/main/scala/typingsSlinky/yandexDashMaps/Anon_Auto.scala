package typingsSlinky.yandexDashMaps

import typingsSlinky.yandexDashMaps.yandexDashMapsStrings.auto
import typingsSlinky.yandexDashMaps.yandexDashMapsStrings.large
import typingsSlinky.yandexDashMaps.yandexDashMapsStrings.medium
import typingsSlinky.yandexDashMaps.yandexDashMapsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var selectOnClick: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[auto | small | medium | large] = js.undefined
}

object Anon_Auto {
  @scala.inline
  def apply(selectOnClick: js.UndefOr[Boolean] = js.undefined, size: auto | small | medium | large = null): Anon_Auto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(selectOnClick)) __obj.updateDynamic("selectOnClick")(selectOnClick.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auto]
  }
}

