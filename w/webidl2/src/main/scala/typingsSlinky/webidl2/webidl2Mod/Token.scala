package typingsSlinky.webidl2.webidl2Mod

import typingsSlinky.webidl2.webidl2Strings.float
import typingsSlinky.webidl2.webidl2Strings.identifier
import typingsSlinky.webidl2.webidl2Strings.integer
import typingsSlinky.webidl2.webidl2Strings.other
import typingsSlinky.webidl2.webidl2Strings.string
import typingsSlinky.webidl2.webidl2Strings.whitespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var `type`: float | integer | identifier | string | whitespace | other
  var value: String
}

object Token {
  @scala.inline
  def apply(`type`: float | integer | identifier | string | whitespace | other, value: String): Token = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

