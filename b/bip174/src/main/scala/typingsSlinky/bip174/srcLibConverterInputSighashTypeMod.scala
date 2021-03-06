package typingsSlinky.bip174

import typingsSlinky.bip174.bip174Strings.number
import typingsSlinky.bip174.srcLibInterfacesMod.KeyValue
import typingsSlinky.bip174.srcLibInterfacesMod.SighashType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/input/sighashType", JSImport.Namespace)
@js.native
object srcLibConverterInputSighashTypeMod extends js.Object {
  val expected: number = js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.SighashType */ Boolean = js.native
  def decode(keyVal: KeyValue): SighashType = js.native
  def encode(data: SighashType): KeyValue = js.native
}

