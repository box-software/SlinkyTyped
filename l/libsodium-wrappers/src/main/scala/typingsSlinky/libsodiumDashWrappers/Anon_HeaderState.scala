package typingsSlinky.libsodiumDashWrappers

import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.StateAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeaderState extends js.Object {
  var header: String
  var state: StateAddress
}

object Anon_HeaderState {
  @scala.inline
  def apply(header: String, state: StateAddress): Anon_HeaderState = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HeaderState]
  }
}

