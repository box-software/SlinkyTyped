package typingsSlinky.atVimeoPlayer.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContrastError extends Error {
  @JSName("name")
  var name_ContrastError: typingsSlinky.atVimeoPlayer.atVimeoPlayerStrings.ContrastError
}

object ContrastError {
  @scala.inline
  def apply(
    message: String,
    method: String,
    name: typingsSlinky.atVimeoPlayer.atVimeoPlayerStrings.ContrastError
  ): ContrastError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContrastError]
  }
}

