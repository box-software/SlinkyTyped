package typingsSlinky.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The creatives feed lists the active creatives for the Ad Exchange buyer
  * accounts that the user has access to. Each entry in the feed corresponds to
  * a single creative.
  */
@js.native
trait Schema$CreativesList extends js.Object {
  /**
    * A list of creatives.
    */
  var items: js.UndefOr[js.Array[Schema$Creative]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Continuation token used to page through creatives. To retrieve the next
    * page of results, set the next request&#39;s &quot;pageToken&quot; value
    * to this.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$CreativesList {
  @scala.inline
  def apply(items: js.Array[Schema$Creative] = null, kind: String = null, nextPageToken: String = null): Schema$CreativesList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativesList]
  }
}

