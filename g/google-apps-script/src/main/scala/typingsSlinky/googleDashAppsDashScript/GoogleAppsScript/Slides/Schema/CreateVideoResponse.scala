package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVideoResponse extends js.Object {
  var objectId: js.UndefOr[String] = js.undefined
}

object CreateVideoResponse {
  @scala.inline
  def apply(objectId: String = null): CreateVideoResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVideoResponse]
  }
}

