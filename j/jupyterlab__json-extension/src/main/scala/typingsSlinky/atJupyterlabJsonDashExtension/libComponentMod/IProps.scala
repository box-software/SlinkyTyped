package typingsSlinky.atJupyterlabJsonDashExtension.libComponentMod

import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONObject
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps extends js.Object {
  var data: JSONValue
  var metadata: js.UndefOr[JSONObject] = js.undefined
}

object IProps {
  @scala.inline
  def apply(data: JSONValue = null, metadata: JSONObject = null): IProps = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
}

