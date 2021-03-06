package typingsSlinky.javascriptDashTimeDashAgo.localeEsDashPYMod

import typingsSlinky.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.`es-PY`
import typingsSlinky.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.few
import typingsSlinky.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.one
import typingsSlinky.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.other
import typingsSlinky.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.two
import typingsSlinky.javascriptDashTimeDashAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: `es-PY`
  var narrow: Duration
  var short: Duration
  def quantify(n: Double): one | two | few | other
}

object Locale {
  @scala.inline
  def apply(locale: `es-PY`, narrow: Duration, quantify: Double => one | two | few | other, short: Duration): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Locale]
  }
}

