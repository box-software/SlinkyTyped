package typingsSlinky.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a guide category.
  */
@js.native
trait Schema$GuideCategorySnippet extends js.Object {
  var channelId: js.UndefOr[String] = js.native
  /**
    * Description of the guide category.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$GuideCategorySnippet {
  @scala.inline
  def apply(channelId: String = null, title: String = null): Schema$GuideCategorySnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GuideCategorySnippet]
  }
}

