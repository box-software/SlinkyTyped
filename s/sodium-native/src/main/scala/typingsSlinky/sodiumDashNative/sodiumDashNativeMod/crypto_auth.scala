package typingsSlinky.sodiumDashNative.sodiumDashNativeMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_auth")
@js.native
object crypto_auth extends js.Object {
  def apply(output: Buffer, input: Buffer, key: Buffer): Unit = js.native
}

