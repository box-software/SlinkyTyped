package typingsSlinky.twilioDashChat.libMemberMod.Member

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatedEventArgs extends js.Object {
  var member: typingsSlinky.twilioDashChat.libMemberMod.Member
  var updateReasons: js.Array[UpdateReason]
}

object UpdatedEventArgs {
  @scala.inline
  def apply(member: typingsSlinky.twilioDashChat.libMemberMod.Member, updateReasons: js.Array[UpdateReason]): UpdatedEventArgs = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any], updateReasons = updateReasons.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatedEventArgs]
  }
}

