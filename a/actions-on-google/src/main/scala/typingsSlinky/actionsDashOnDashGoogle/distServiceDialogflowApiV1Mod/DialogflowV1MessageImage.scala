package typingsSlinky.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleNumbers.`3`
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.facebook_
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.kik_
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.line_
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.skype_
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.slack_
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.telegram_
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.viber_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageImage
  extends DialogflowV1BaseMessage[`3`]
     with DialogflowV1Message {
  var imageUrl: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageImage {
  @scala.inline
  def apply(
    imageUrl: String = null,
    platform: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_ = null,
    `type`: `3` = null,
    url: String = null
  ): DialogflowV1MessageImage = {
    val __obj = js.Dynamic.literal()
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageImage]
  }
}

