package typingsSlinky.dateDashFns

import typingsSlinky.dateDashFns.dateDashFnsNumbers.`0`
import typingsSlinky.dateDashFns.dateDashFnsNumbers.`1`
import typingsSlinky.dateDashFns.dateDashFnsNumbers.`2`
import typingsSlinky.dateDashFns.dateDashFnsNumbers.`3`
import typingsSlinky.dateDashFns.dateDashFnsNumbers.`4`
import typingsSlinky.dateDashFns.dateDashFnsNumbers.`5`
import typingsSlinky.dateDashFns.dateDashFnsNumbers.`6`
import typingsSlinky.dateDashFns.dateDashFnsNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01234567FirstWeekContainsDateLocale extends js.Object {
  var firstWeekContainsDate: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
  var locale: js.UndefOr[typingsSlinky.dateDashFns.dateDashFnsMod.Locale] = js.undefined
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}

object Anon_01234567FirstWeekContainsDateLocale {
  @scala.inline
  def apply(
    firstWeekContainsDate: `1` | `2` | `3` | `4` | `5` | `6` | `7` = null,
    locale: typingsSlinky.dateDashFns.dateDashFnsMod.Locale = null,
    weekStartsOn: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null
  ): Anon_01234567FirstWeekContainsDateLocale = {
    val __obj = js.Dynamic.literal()
    if (firstWeekContainsDate != null) __obj.updateDynamic("firstWeekContainsDate")(firstWeekContainsDate.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (weekStartsOn != null) __obj.updateDynamic("weekStartsOn")(weekStartsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_01234567FirstWeekContainsDateLocale]
  }
}

