package typingsSlinky.figlet.figletMod

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Defaults extends js.Object {
  var font: Fonts
  var fontPath: String
}

object Defaults {
  @scala.inline
  def apply(font: Fonts, fontPath: String): Defaults = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], fontPath = fontPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Defaults]
  }
}

@JSImport("figlet", "defaults")
@js.native
object defaults extends js.Object {
  def apply(): Defaults = js.native
  def apply(opt: Partial[Defaults]): Defaults = js.native
}

