package typingsSlinky.nodeDashJose.nodeDashJoseMod.JWK

import typingsSlinky.node.Buffer
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.`private`
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.json
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.pem
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.pkcs8
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.pkix
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.public
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.spki
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.x509
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyStore extends js.Object {
  /**
    * @param key
    *  String serialization of a JSON JWK/(base64-encoded) PEM/(binary-encoded) DER
    *  Buffer of a JSON JWK/(base64-encoded) PEM/(binary-encoded) DER
    * @param form
    * is either a:
    * - "json" for a JSON stringified JWK
    * - "private" for a DER encoded 'raw' private key
    * - "pkcs8" for a DER encoded (unencrypted!) PKCS8 private key
    * - "public" for a DER encoded SPKI public key (alternate to 'spki')
    * - "spki" for a DER encoded SPKI public key
    * - "pkix" for a DER encoded PKIX X.509 certificate
    * - "x509" for a DER encoded PKIX X.509 certificate
    * - "pem" for a PEM encoded of PKCS8 / SPKI / PKIX
    */
  def add(key: String | Buffer | Key | js.Object): js.Promise[Key] = js.native
  def add(
    key: String | Buffer | Key | js.Object,
    form: json | `private` | pkcs8 | public | spki | pkix | x509 | pem
  ): js.Promise[Key] = js.native
  def add(key: RawKey): js.Promise[Key] = js.native
  def all(): js.Array[RawKey] = js.native
  def all(options: Partial[KeyStoreGetOptions]): js.Array[RawKey] = js.native
  def generate(kty: String): js.Promise[Key] = js.native
  def generate(kty: String, size: String): js.Promise[Key] = js.native
  def generate(kty: String, size: String, props: js.Any): js.Promise[Key] = js.native
  def generate(kty: String, size: Double): js.Promise[Key] = js.native
  def generate(kty: String, size: Double, props: js.Any): js.Promise[Key] = js.native
  /**
    * To retrieve a key from a keystore
    */
  def get(kid: String): RawKey = js.native
  def get(kid: String, filter: KeyStoreGetFilter): RawKey = js.native
  def get(options: KeyStoreGetOptions): RawKey = js.native
  def remove(key: Key): Unit = js.native
  /**
    * To export the public keys of a keystore as a JWK-set
    */
  def toJSON(): js.Object = js.native
  def toJSON(exportPrivateKeys: Boolean): js.Object = js.native
}

