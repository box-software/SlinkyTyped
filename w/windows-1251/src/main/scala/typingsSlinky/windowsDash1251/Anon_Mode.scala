package typingsSlinky.windowsDash1251

import typingsSlinky.windowsDash1251.windowsDash1251Mod.EncoderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: js.UndefOr[EncoderMode] = js.undefined
}

object Anon_Mode {
  @scala.inline
  def apply(mode: EncoderMode = null): Anon_Mode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Mode]
  }
}

