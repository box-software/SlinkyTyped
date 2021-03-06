package typingsSlinky.humps.humps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HumpsOptions extends js.Object {
  var process: js.UndefOr[HumpsProcessor] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var split: js.UndefOr[js.RegExp] = js.undefined
}

object HumpsOptions {
  @scala.inline
  def apply(
    process: (/* key */ String, /* convert */ HumpsProcessorParameter, /* options */ js.UndefOr[HumpsOptions]) => String = null,
    separator: String = null,
    split: js.RegExp = null
  ): HumpsOptions = {
    val __obj = js.Dynamic.literal()
    if (process != null) __obj.updateDynamic("process")(js.Any.fromFunction3(process))
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumpsOptions]
  }
}

