package typingsSlinky.bip174.srcLibInterfacesMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOutput extends js.Object {
  var script: Buffer
  var value: Double
}

object TransactionOutput {
  @scala.inline
  def apply(script: Buffer, value: Double): TransactionOutput = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransactionOutput]
  }
}

