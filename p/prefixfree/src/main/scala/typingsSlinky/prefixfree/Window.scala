package typingsSlinky.prefixfree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var PrefixFree: typingsSlinky.prefixfree.PrefixFree
  var StyleFix: typingsSlinky.prefixfree.StyleFix
}

object Window {
  @scala.inline
  def apply(PrefixFree: PrefixFree, StyleFix: StyleFix): Window = {
    val __obj = js.Dynamic.literal(PrefixFree = PrefixFree.asInstanceOf[js.Any], StyleFix = StyleFix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

