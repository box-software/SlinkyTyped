package typingsSlinky.luaparse.libAstMod

import typingsSlinky.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GotoStatement
  extends _Statement
     with Base[typingsSlinky.luaparse.luaparseStrings.GotoStatement] {
  var label: Identifier
}

object GotoStatement {
  @scala.inline
  def apply(
    label: Identifier,
    `type`: typingsSlinky.luaparse.luaparseStrings.GotoStatement,
    loc: Anon_End = null
  ): GotoStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotoStatement]
  }
}

