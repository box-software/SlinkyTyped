package typingsSlinky.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarBadgeOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * tabBar的哪一项，从左边算起
  		 */
  var index: Double
}

object TabBarBadgeOptions {
  @scala.inline
  def apply(
    index: Double,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): TabBarBadgeOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[TabBarBadgeOptions]
  }
}

