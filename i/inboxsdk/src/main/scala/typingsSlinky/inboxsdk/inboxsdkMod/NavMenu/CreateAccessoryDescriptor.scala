package typingsSlinky.inboxsdk.inboxsdkMod.NavMenu

import typingsSlinky.inboxsdk.inboxsdkStrings.CREATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccessoryDescriptor extends js.Object {
  var `type`: CREATE
  def onClick(): Unit
}

object CreateAccessoryDescriptor {
  @scala.inline
  def apply(onClick: () => Unit, `type`: CREATE): CreateAccessoryDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessoryDescriptor]
  }
}

