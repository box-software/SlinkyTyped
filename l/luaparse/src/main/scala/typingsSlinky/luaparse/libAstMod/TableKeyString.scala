package typingsSlinky.luaparse.libAstMod

import typingsSlinky.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableKeyString
  extends Base[typingsSlinky.luaparse.luaparseStrings.TableKeyString]
     with _Node {
  var key: Identifier
  var value: Expression
}

object TableKeyString {
  @scala.inline
  def apply(
    key: Identifier,
    `type`: typingsSlinky.luaparse.luaparseStrings.TableKeyString,
    value: Expression,
    loc: Anon_End = null
  ): TableKeyString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableKeyString]
  }
}

