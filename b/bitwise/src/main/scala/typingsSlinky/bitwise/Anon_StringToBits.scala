package typingsSlinky.bitwise

import typingsSlinky.bitwise.typesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StringToBits extends js.Object {
  def toBits(string: String): js.Array[Bit]
}

object Anon_StringToBits {
  @scala.inline
  def apply(toBits: String => js.Array[Bit]): Anon_StringToBits = {
    val __obj = js.Dynamic.literal(toBits = js.Any.fromFunction1(toBits))
  
    __obj.asInstanceOf[Anon_StringToBits]
  }
}

