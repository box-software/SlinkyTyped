package typingsSlinky.lyricist

import typingsSlinky.lyricist.lyricistMod.LyricistTextFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TextFormat extends js.Object {
  var textFormat: js.UndefOr[LyricistTextFormat] = js.undefined
}

object Anon_TextFormat {
  @scala.inline
  def apply(textFormat: LyricistTextFormat = null): Anon_TextFormat = {
    val __obj = js.Dynamic.literal()
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TextFormat]
  }
}

