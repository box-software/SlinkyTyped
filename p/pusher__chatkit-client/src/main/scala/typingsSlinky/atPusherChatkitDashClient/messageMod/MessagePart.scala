package typingsSlinky.atPusherChatkitDashClient.messageMod

import typingsSlinky.atPusherChatkitDashClient.atPusherChatkitDashClientStrings.`inline`
import typingsSlinky.atPusherChatkitDashClient.atPusherChatkitDashClientStrings.attachment
import typingsSlinky.atPusherChatkitDashClient.atPusherChatkitDashClientStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePart extends js.Object {
  var partType: `inline` | url | attachment
  var payload: js.Any
}

object MessagePart {
  @scala.inline
  def apply(partType: `inline` | url | attachment, payload: js.Any): MessagePart = {
    val __obj = js.Dynamic.literal(partType = partType.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessagePart]
  }
}

