package typingsSlinky.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Freebase topic information related to the channel.
  */
@js.native
trait Schema$ChannelTopicDetails extends js.Object {
  /**
    * A list of Wikipedia URLs that describe the channel&#39;s content.
    */
  var topicCategories: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of Freebase topic IDs associated with the channel. You can
    * retrieve information about each topic using the Freebase Topic API.
    */
  var topicIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ChannelTopicDetails {
  @scala.inline
  def apply(topicCategories: js.Array[String] = null, topicIds: js.Array[String] = null): Schema$ChannelTopicDetails = {
    val __obj = js.Dynamic.literal()
    if (topicCategories != null) __obj.updateDynamic("topicCategories")(topicCategories.asInstanceOf[js.Any])
    if (topicIds != null) __obj.updateDynamic("topicIds")(topicIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChannelTopicDetails]
  }
}

