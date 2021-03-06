package typingsSlinky.reactDashCopyDashToDashClipboard.reactDashCopyDashToDashClipboardMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: TagMod[Any]
  var onCopy: js.UndefOr[js.Function2[/* text */ String, /* result */ Boolean, Unit]] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var text: String
}

object Props {
  @scala.inline
  def apply(
    children: TagMod[Any],
    text: String,
    onCopy: (/* text */ String, /* result */ Boolean) => Unit = null,
    options: Options = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction2(onCopy))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

