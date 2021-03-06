package typingsSlinky.openpgp.openpgpMod.crypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see module:crypto/public_key/elliptic/ecdh
  */
@JSImport("openpgp", "crypto.aes_kw")
@js.native
object aes_kw extends js.Object {
  /**
    * AES key unwrap
    * @param key
    * @param data
    * @returns
    * @throws
    */
  def unwrap(key: String, data: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  /**
    * AES key wrap
    * @param key
    * @param data
    * @returns
    */
  def wrap(key: String, data: String): scala.scalajs.js.typedarray.Uint8Array = js.native
}

