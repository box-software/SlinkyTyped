package typingsSlinky.atHigButton.atHigButtonMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atHigButton.atHigButtonStrings.grow
import typingsSlinky.atHigButton.atHigButtonStrings.shrink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Widths extends js.Object {
  var GROW: grow
  var SHRINK: shrink
}

object Widths {
  @scala.inline
  def apply(GROW: grow, SHRINK: shrink): Widths = {
    val __obj = js.Dynamic.literal(GROW = GROW.asInstanceOf[js.Any], SHRINK = SHRINK.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Widths]
  }
}

@JSImport("@hig/button", "widths")
@js.native
object widths extends TopLevel[Widths]

