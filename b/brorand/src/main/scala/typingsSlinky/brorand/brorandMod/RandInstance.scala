package typingsSlinky.brorand.brorandMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandInstance extends js.Object {
  var rand: typingsSlinky.brorand.brorandMod.rand
  def generate(len: Double): Buffer | scala.scalajs.js.typedarray.Uint8Array
}

object RandInstance {
  @scala.inline
  def apply(generate: Double => Buffer | scala.scalajs.js.typedarray.Uint8Array, rand: rand): RandInstance = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), rand = rand.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RandInstance]
  }
}

