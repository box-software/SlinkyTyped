package typingsSlinky.atXmppXml.atXmppXmlMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLError extends Error {
  @JSName("name")
  val name_XMLError: typingsSlinky.atXmppXml.atXmppXmlStrings.XMLError
}

object XMLError {
  @scala.inline
  def apply(message: String, name: typingsSlinky.atXmppXml.atXmppXmlStrings.XMLError, stack: String = null): XMLError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLError]
  }
}

