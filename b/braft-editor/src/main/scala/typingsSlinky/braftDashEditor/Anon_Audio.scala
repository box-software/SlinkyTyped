package typingsSlinky.braftDashEditor

import typingsSlinky.braftDashEditor.braftDashEditorBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Audio extends js.Object {
  var audio: js.UndefOr[String | `false`] = js.undefined
  var image: js.UndefOr[String | `false`] = js.undefined
  var video: js.UndefOr[String | `false`] = js.undefined
}

object Anon_Audio {
  @scala.inline
  def apply(audio: String | `false` = null, image: String | `false` = null, video: String | `false` = null): Anon_Audio = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Audio]
  }
}

