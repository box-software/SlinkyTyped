package typingsSlinky.pem.pemMod

import typingsSlinky.pem.Anon_Pkcs12
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "createPkcs12")
@js.native
object createPkcs12 extends js.Object {
  def apply(key: String, certificate: String, password: String, callback: Callback[Anon_Pkcs12]): Unit = js.native
  def apply(
    key: String,
    certificate: String,
    password: String,
    options: Pkcs12CreationOptions,
    callback: Callback[Anon_Pkcs12]
  ): Unit = js.native
}

