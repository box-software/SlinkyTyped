package typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message

import typingsSlinky.dingtalkDashRobotDashSender.Anon_MessageURL
import typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.MessageType
import typingsSlinky.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.feedCard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedCardItem extends MessageType {
  var feedCard: Anon_MessageURL
  var msgtype: feedCard
}

object FeedCardItem {
  @scala.inline
  def apply(feedCard: Anon_MessageURL, msgtype: feedCard): FeedCardItem = {
    val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeedCardItem]
  }
}

