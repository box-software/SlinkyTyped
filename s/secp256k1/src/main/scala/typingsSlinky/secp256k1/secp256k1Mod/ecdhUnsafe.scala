package typingsSlinky.secp256k1.secp256k1Mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "ecdhUnsafe")
@js.native
object ecdhUnsafe extends js.Object {
  def apply(publicKey: Buffer, privateKey: Buffer): Buffer = js.native
  def apply(publicKey: Buffer, privateKey: Buffer, compressed: Boolean): Buffer = js.native
}

