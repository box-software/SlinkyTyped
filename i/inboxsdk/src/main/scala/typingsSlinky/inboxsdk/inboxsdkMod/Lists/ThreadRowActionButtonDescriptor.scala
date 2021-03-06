package typingsSlinky.inboxsdk.inboxsdkMod.Lists

import typingsSlinky.inboxsdk.inboxsdkStrings.LINK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowActionButtonDescriptor extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var title: String
  var `type`: LINK
  var url: String
}

object ThreadRowActionButtonDescriptor {
  @scala.inline
  def apply(
    title: String,
    `type`: LINK,
    url: String,
    className: String = null,
    onClick: /* event */ js.Any => Unit = null
  ): ThreadRowActionButtonDescriptor = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[ThreadRowActionButtonDescriptor]
  }
}

