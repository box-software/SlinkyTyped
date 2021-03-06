package typingsSlinky.prettier.prettierMod.doc.builders

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.prettier.prettierStrings.`break-parent`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakParent extends _Doc {
  var `type`: `break-parent`
}

object BreakParent {
  @scala.inline
  def apply(`type`: `break-parent`): BreakParent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakParent]
  }
}

@JSImport("prettier", "doc.builders.breakParent")
@js.native
object breakParent extends TopLevel[BreakParent]

