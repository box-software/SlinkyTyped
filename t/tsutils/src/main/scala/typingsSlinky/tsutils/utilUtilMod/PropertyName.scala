package typingsSlinky.tsutils.utilUtilMod

import typingsSlinky.typescript.typescriptMod.__String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyName extends js.Object {
  var displayName: String
  var symbolName: __String
}

object PropertyName {
  @scala.inline
  def apply(displayName: String, symbolName: __String): PropertyName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], symbolName = symbolName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropertyName]
  }
}

