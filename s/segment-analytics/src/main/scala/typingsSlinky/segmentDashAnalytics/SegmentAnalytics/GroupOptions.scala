package typingsSlinky.segmentDashAnalytics.SegmentAnalytics

import typingsSlinky.segmentDashAnalytics.Anon_KeyString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  var cookie: js.UndefOr[Anon_KeyString] = js.undefined
  var localStorage: js.UndefOr[Anon_KeyString] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    cookie: Anon_KeyString = null,
    localStorage: Anon_KeyString = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): GroupOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (localStorage != null) __obj.updateDynamic("localStorage")(localStorage.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
}

