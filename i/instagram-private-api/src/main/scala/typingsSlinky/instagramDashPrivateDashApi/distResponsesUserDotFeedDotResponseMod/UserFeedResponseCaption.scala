package typingsSlinky.instagramDashPrivateDashApi.distResponsesUserDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserFeedResponseCaption extends js.Object {
  var bit_flags: Double
  var content_type: String
  var created_at: Double
  var created_at_utc: Double
  var did_report_as_spam: Boolean
  var has_translation: Boolean
  var media_id: String
  var pk: String
  var share_enabled: Boolean
  var status: String
  var text: String
  var `type`: Double
  var user: UserFeedResponseUser
  var user_id: Double
}

object UserFeedResponseCaption {
  @scala.inline
  def apply(
    bit_flags: Double,
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    did_report_as_spam: Boolean,
    has_translation: Boolean,
    media_id: String,
    pk: String,
    share_enabled: Boolean,
    status: String,
    text: String,
    `type`: Double,
    user: UserFeedResponseUser,
    user_id: Double
  ): UserFeedResponseCaption = {
    val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], has_translation = has_translation.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserFeedResponseCaption]
  }
}

