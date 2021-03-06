package typingsSlinky.jose.joseMod.JWK

import typingsSlinky.jose.joseBooleans.`false`
import typingsSlinky.jose.joseMod.ECCurve
import typingsSlinky.jose.joseMod.JWKECKey
import typingsSlinky.jose.joseMod.asymmetricKeyObjectTypes
import typingsSlinky.jose.joseStrings.EC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.ECKey")
@js.native
class ECKey () extends Key {
  var crv: ECCurve = js.native
  var d: js.UndefOr[String] = js.native
  @JSName("kty")
  var kty_ECKey: EC = js.native
  @JSName("secret")
  var secret_ECKey: `false` = js.native
  @JSName("type")
  var type_ECKey: asymmetricKeyObjectTypes = js.native
  var x: String = js.native
  var y: String = js.native
  def toJWK(): JWKECKey = js.native
  def toJWK(`private`: Boolean): JWKECKey = js.native
}

