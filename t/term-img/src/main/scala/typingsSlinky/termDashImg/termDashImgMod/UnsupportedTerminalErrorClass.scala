package typingsSlinky.termDashImg.termDashImgMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedTerminalErrorClass extends Error {
  @JSName("name")
  val name_UnsupportedTerminalErrorClass: typingsSlinky.termDashImg.termDashImgStrings.UnsupportedTerminalError
}

object UnsupportedTerminalErrorClass {
  @scala.inline
  def apply(
    message: String,
    name: typingsSlinky.termDashImg.termDashImgStrings.UnsupportedTerminalError,
    stack: String = null
  ): UnsupportedTerminalErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedTerminalErrorClass]
  }
}

