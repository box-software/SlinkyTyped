package typingsSlinky.karma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pattern extends js.Object {
  var pattern: String
  var `type`: String
}

object Anon_Pattern {
  @scala.inline
  def apply(pattern: String, `type`: String): Anon_Pattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Pattern]
  }
}

