package typingsSlinky.libsodiumDashWrappersDashSumo

import typingsSlinky.libsodiumDashWrappers.Anon_Header
import typingsSlinky.libsodiumDashWrappers.Anon_HeaderState
import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.CryptoBox
import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.CryptoKX
import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.KeyPair
import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.MessageTag
import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.SecretBox
import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.StateAddress
import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.StringCryptoBox
import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.StringCryptoKX
import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.StringKeyPair
import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.StringMessageTag
import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.StringOutputFormat
import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.StringSecretBox
import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.Uint8ArrayOutputFormat
import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.base64_variants
import typingsSlinky.libsodiumDashWrappersDashSumo.libsodiumDashWrappersDashSumoBooleans.`true`
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", JSImport.Namespace)
@js.native
object libsodiumDashWrappersDashSumoMod extends js.Object {
  val SODIUM_LIBRARY_VERSION_MAJOR: Double = js.native
  val SODIUM_LIBRARY_VERSION_MINOR: Double = js.native
  val SODIUM_VERSION_STRING: String = js.native
  val crypto_aead_chacha20poly1305_ABYTES: Double = js.native
  val crypto_aead_chacha20poly1305_KEYBYTES: Double = js.native
  val crypto_aead_chacha20poly1305_MESSAGEBYTES_MAX: Double = js.native
  val crypto_aead_chacha20poly1305_NPUBBYTES: Double = js.native
  val crypto_aead_chacha20poly1305_NSECBYTES: Double = js.native
  val crypto_aead_chacha20poly1305_ietf_ABYTES: Double = js.native
  val crypto_aead_chacha20poly1305_ietf_KEYBYTES: Double = js.native
  val crypto_aead_chacha20poly1305_ietf_MESSAGEBYTES_MAX: Double = js.native
  val crypto_aead_chacha20poly1305_ietf_NPUBBYTES: Double = js.native
  val crypto_aead_chacha20poly1305_ietf_NSECBYTES: Double = js.native
  val crypto_aead_xchacha20poly1305_ietf_ABYTES: Double = js.native
  val crypto_aead_xchacha20poly1305_ietf_KEYBYTES: Double = js.native
  val crypto_aead_xchacha20poly1305_ietf_MESSAGEBYTES_MAX: Double = js.native
  val crypto_aead_xchacha20poly1305_ietf_NPUBBYTES: Double = js.native
  val crypto_aead_xchacha20poly1305_ietf_NSECBYTES: Double = js.native
  val crypto_auth_BYTES: Double = js.native
  val crypto_auth_KEYBYTES: Double = js.native
  val crypto_auth_hmacsha256_BYTES: Double = js.native
  val crypto_auth_hmacsha256_KEYBYTES: Double = js.native
  val crypto_auth_hmacsha512_BYTES: Double = js.native
  val crypto_auth_hmacsha512_KEYBYTES: Double = js.native
  val crypto_box_BEFORENMBYTES: Double = js.native
  val crypto_box_MACBYTES: Double = js.native
  val crypto_box_MESSAGEBYTES_MAX: Double = js.native
  val crypto_box_NONCEBYTES: Double = js.native
  val crypto_box_PUBLICKEYBYTES: Double = js.native
  val crypto_box_SEALBYTES: Double = js.native
  val crypto_box_SECRETKEYBYTES: Double = js.native
  val crypto_box_SEEDBYTES: Double = js.native
  val crypto_box_curve25519xchacha20poly1305_NONCEBYTES: Double = js.native
  val crypto_box_curve25519xchacha20poly1305_PUBLICKEYBYTES: Double = js.native
  val crypto_box_curve25519xchacha20poly1305_SECRETKEYBYTES: Double = js.native
  val crypto_core_hchacha20_CONSTBYTES: Double = js.native
  val crypto_core_hchacha20_INPUTBYTES: Double = js.native
  val crypto_core_hchacha20_KEYBYTES: Double = js.native
  val crypto_core_hchacha20_OUTPUTBYTES: Double = js.native
  val crypto_core_ristretto255_BYTES: Double = js.native
  val crypto_core_ristretto255_HASHBYTES: Double = js.native
  val crypto_core_ristretto255_NONREDUCEDSCALARBYTES: Double = js.native
  val crypto_core_ristretto255_SCALARBYTES: Double = js.native
  val crypto_generichash_BYTES: Double = js.native
  val crypto_generichash_BYTES_MAX: Double = js.native
  val crypto_generichash_BYTES_MIN: Double = js.native
  val crypto_generichash_KEYBYTES: Double = js.native
  val crypto_generichash_KEYBYTES_MAX: Double = js.native
  val crypto_generichash_KEYBYTES_MIN: Double = js.native
  val crypto_generichash_blake2b_BYTES: Double = js.native
  val crypto_generichash_blake2b_BYTES_MAX: Double = js.native
  val crypto_generichash_blake2b_BYTES_MIN: Double = js.native
  val crypto_generichash_blake2b_KEYBYTES: Double = js.native
  val crypto_generichash_blake2b_KEYBYTES_MAX: Double = js.native
  val crypto_generichash_blake2b_KEYBYTES_MIN: Double = js.native
  val crypto_generichash_blake2b_PERSONALBYTES: Double = js.native
  val crypto_generichash_blake2b_SALTBYTES: Double = js.native
  val crypto_hash_BYTES: Double = js.native
  val crypto_hash_sha256_BYTES: Double = js.native
  val crypto_hash_sha512_BYTES: Double = js.native
  val crypto_kdf_BYTES_MAX: Double = js.native
  val crypto_kdf_BYTES_MIN: Double = js.native
  val crypto_kdf_CONTEXTBYTES: Double = js.native
  val crypto_kdf_KEYBYTES: Double = js.native
  val crypto_kx_PUBLICKEYBYTES: Double = js.native
  val crypto_kx_SECRETKEYBYTES: Double = js.native
  val crypto_kx_SEEDBYTES: Double = js.native
  val crypto_kx_SESSIONKEYBYTES: Double = js.native
  val crypto_onetimeauth_BYTES: Double = js.native
  val crypto_onetimeauth_KEYBYTES: Double = js.native
  val crypto_pwhash_ALG_ARGON2I13: Double = js.native
  val crypto_pwhash_ALG_ARGON2ID13: Double = js.native
  val crypto_pwhash_ALG_DEFAULT: Double = js.native
  val crypto_pwhash_BYTES_MAX: Double = js.native
  val crypto_pwhash_BYTES_MIN: Double = js.native
  val crypto_pwhash_MEMLIMIT_INTERACTIVE: Double = js.native
  val crypto_pwhash_MEMLIMIT_MAX: Double = js.native
  val crypto_pwhash_MEMLIMIT_MIN: Double = js.native
  val crypto_pwhash_MEMLIMIT_MODERATE: Double = js.native
  val crypto_pwhash_MEMLIMIT_SENSITIVE: Double = js.native
  val crypto_pwhash_OPSLIMIT_INTERACTIVE: Double = js.native
  val crypto_pwhash_OPSLIMIT_MAX: Double = js.native
  val crypto_pwhash_OPSLIMIT_MIN: Double = js.native
  val crypto_pwhash_OPSLIMIT_MODERATE: Double = js.native
  val crypto_pwhash_OPSLIMIT_SENSITIVE: Double = js.native
  val crypto_pwhash_PASSWD_MAX: Double = js.native
  val crypto_pwhash_PASSWD_MIN: Double = js.native
  val crypto_pwhash_SALTBYTES: Double = js.native
  val crypto_pwhash_STRBYTES: Double = js.native
  val crypto_pwhash_STRPREFIX: String = js.native
  val crypto_pwhash_STR_VERIFY: Double = js.native
  val crypto_pwhash_scryptsalsa208sha256_BYTES_MAX: Double = js.native
  val crypto_pwhash_scryptsalsa208sha256_BYTES_MIN: Double = js.native
  val crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_INTERACTIVE: Double = js.native
  val crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_MAX: Double = js.native
  val crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_MIN: Double = js.native
  val crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_SENSITIVE: Double = js.native
  val crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_INTERACTIVE: Double = js.native
  val crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_MAX: Double = js.native
  val crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_MIN: Double = js.native
  val crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_SENSITIVE: Double = js.native
  val crypto_pwhash_scryptsalsa208sha256_SALTBYTES: Double = js.native
  val crypto_pwhash_scryptsalsa208sha256_STRBYTES: Double = js.native
  val crypto_pwhash_scryptsalsa208sha256_STRPREFIX: String = js.native
  val crypto_pwhash_scryptsalsa208sha256_STR_VERIFY: Double = js.native
  val crypto_scalarmult_BYTES: Double = js.native
  val crypto_scalarmult_SCALARBYTES: Double = js.native
  val crypto_scalarmult_ristretto255_BYTES: Double = js.native
  val crypto_scalarmult_ristretto255_SCALARBYTES: Double = js.native
  val crypto_secretbox_KEYBYTES: Double = js.native
  val crypto_secretbox_MACBYTES: Double = js.native
  val crypto_secretbox_MESSAGEBYTES_MAX: Double = js.native
  val crypto_secretbox_NONCEBYTES: Double = js.native
  val crypto_secretstream_xchacha20poly1305_ABYTES: Double = js.native
  val crypto_secretstream_xchacha20poly1305_HEADERBYTES: Double = js.native
  val crypto_secretstream_xchacha20poly1305_KEYBYTES: Double = js.native
  val crypto_secretstream_xchacha20poly1305_MESSAGEBYTES_MAX: Double = js.native
  val crypto_secretstream_xchacha20poly1305_TAG_FINAL: Double = js.native
  val crypto_secretstream_xchacha20poly1305_TAG_MESSAGE: Double = js.native
  val crypto_secretstream_xchacha20poly1305_TAG_PUSH: Double = js.native
  val crypto_secretstream_xchacha20poly1305_TAG_REKEY: Double = js.native
  val crypto_shorthash_BYTES: Double = js.native
  val crypto_shorthash_KEYBYTES: Double = js.native
  val crypto_shorthash_siphashx24_BYTES: Double = js.native
  val crypto_shorthash_siphashx24_KEYBYTES: Double = js.native
  val crypto_sign_BYTES: Double = js.native
  val crypto_sign_MESSAGEBYTES_MAX: Double = js.native
  val crypto_sign_PUBLICKEYBYTES: Double = js.native
  val crypto_sign_SECRETKEYBYTES: Double = js.native
  val crypto_sign_SEEDBYTES: Double = js.native
  val crypto_stream_KEYBYTES: Double = js.native
  val crypto_stream_MESSAGEBYTES_MAX: Double = js.native
  val crypto_stream_NONCEBYTES: Double = js.native
  val crypto_stream_chacha20_KEYBYTES: Double = js.native
  val crypto_stream_chacha20_NONCEBYTES: Double = js.native
  val crypto_stream_chacha20_ietf_KEYBYTES: Double = js.native
  val crypto_stream_chacha20_ietf_MESSAGEBYTES_MAX: Double = js.native
  val crypto_stream_chacha20_ietf_NONCEBYTES: Double = js.native
  val crypto_stream_xchacha20_KEYBYTES: Double = js.native
  val crypto_stream_xchacha20_MESSAGEBYTES_MAX: Double = js.native
  val crypto_stream_xchacha20_NONCEBYTES: Double = js.native
  val randombytes_SEEDBYTES: Double = js.native
  val ready: js.Promise[Unit] = js.native
  def add(a: scala.scalajs.js.typedarray.Uint8Array, b: scala.scalajs.js.typedarray.Uint8Array): Unit = js.native
  def compare(b1: scala.scalajs.js.typedarray.Uint8Array, b2: scala.scalajs.js.typedarray.Uint8Array): Double = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_aead_chacha20poly1305_ietf_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_chacha20poly1305_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_aead_chacha20poly1305_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    additional_data: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth(message: String, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth(message: String, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_auth(message: String, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth(message: Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth(message: Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_auth(
    message: Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_hmacsha256(message: String, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_hmacsha256(message: String, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_auth_hmacsha256(message: String, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_hmacsha256(message: Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_hmacsha256(message: Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_auth_hmacsha256(
    message: Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_hmacsha256_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_hmacsha256_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_auth_hmacsha256_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_hmacsha256_verify(
    tag: scala.scalajs.js.typedarray.Uint8Array,
    message: String,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
  def crypto_auth_hmacsha256_verify(
    tag: scala.scalajs.js.typedarray.Uint8Array,
    message: Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
  def crypto_auth_hmacsha512(message: String, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_hmacsha512(message: String, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_auth_hmacsha512(message: String, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_hmacsha512(message: Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_hmacsha512(message: Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_auth_hmacsha512(
    message: Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_hmacsha512_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_hmacsha512_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_auth_hmacsha512_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_hmacsha512_verify(
    tag: scala.scalajs.js.typedarray.Uint8Array,
    message: String,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
  def crypto_auth_hmacsha512_verify(
    tag: scala.scalajs.js.typedarray.Uint8Array,
    message: Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
  def crypto_auth_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_auth_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_auth_verify(
    tag: scala.scalajs.js.typedarray.Uint8Array,
    message: String,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
  def crypto_auth_verify(
    tag: scala.scalajs.js.typedarray.Uint8Array,
    message: Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
  def crypto_box_beforenm(
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_beforenm(
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_beforenm(
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_curve25519xchacha20poly1305_keypair(
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    secretKey: scala.scalajs.js.typedarray.Uint8Array
  ): KeyPair = js.native
  def crypto_box_curve25519xchacha20poly1305_keypair(
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    secretKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringKeyPair = js.native
  def crypto_box_curve25519xchacha20poly1305_keypair(
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    secretKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): KeyPair = js.native
  def crypto_box_curve25519xchacha20poly1305_seal(message: scala.scalajs.js.typedarray.Uint8Array, publicKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_curve25519xchacha20poly1305_seal(
    message: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_curve25519xchacha20poly1305_seal(
    message: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_curve25519xchacha20poly1305_seal_open(
    ciphertext: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    secretKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_curve25519xchacha20poly1305_seal_open(
    ciphertext: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    secretKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_curve25519xchacha20poly1305_seal_open(
    ciphertext: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    secretKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_detached(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_box_detached(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_box_detached(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_box_detached(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def crypto_box_detached(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_box_detached(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_box_easy(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_easy(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_easy(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_easy(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_easy(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_easy(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_easy_afternm(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    sharedKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_easy_afternm(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    sharedKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_easy_afternm(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    sharedKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_easy_afternm(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    sharedKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_easy_afternm(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    sharedKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_easy_afternm(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    sharedKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_keypair(): KeyPair = js.native
  def crypto_box_keypair(outputFormat: StringOutputFormat): StringKeyPair = js.native
  def crypto_box_keypair(outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  def crypto_box_open_detached(
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_open_detached(
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_open_detached(
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_open_detached(
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_open_detached(
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_open_detached(
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_open_easy(
    ciphertext: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_open_easy(
    ciphertext: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_open_easy(
    ciphertext: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_open_easy(
    ciphertext: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_open_easy(
    ciphertext: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_open_easy(
    ciphertext: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_open_easy_afternm(
    ciphertext: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    sharedKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_open_easy_afternm(
    ciphertext: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    sharedKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_open_easy_afternm(
    ciphertext: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    sharedKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_open_easy_afternm(
    ciphertext: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    sharedKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_open_easy_afternm(
    ciphertext: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    sharedKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_open_easy_afternm(
    ciphertext: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    sharedKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_seal(message: String, publicKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_seal(
    message: String,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_seal(
    message: String,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_seal(message: Uint8Array, publicKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_seal(
    message: Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_seal(
    message: Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_seal_open(
    ciphertext: String,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_seal_open(
    ciphertext: String,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_seal_open(
    ciphertext: String,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_seal_open(
    ciphertext: Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_seal_open(
    ciphertext: Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_seal_open(
    ciphertext: Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_box_seed_keypair(seed: scala.scalajs.js.typedarray.Uint8Array): KeyPair = js.native
  def crypto_box_seed_keypair(seed: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  def crypto_box_seed_keypair(seed: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  def crypto_core_ristretto255_add(p: scala.scalajs.js.typedarray.Uint8Array, q: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_add(
    p: scala.scalajs.js.typedarray.Uint8Array,
    q: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_core_ristretto255_add(
    p: scala.scalajs.js.typedarray.Uint8Array,
    q: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_from_hash(r: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_from_hash(r: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_core_ristretto255_from_hash(r: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_is_valid_point(point: String): Boolean = js.native
  def crypto_core_ristretto255_is_valid_point(point: Uint8Array): Boolean = js.native
  def crypto_core_ristretto255_random(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_random(outputFormat: StringOutputFormat): String = js.native
  def crypto_core_ristretto255_random(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_add(x: scala.scalajs.js.typedarray.Uint8Array, y: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_add(
    x: scala.scalajs.js.typedarray.Uint8Array,
    y: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_core_ristretto255_scalar_add(
    x: scala.scalajs.js.typedarray.Uint8Array,
    y: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_complement(scalar: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_complement(scalar: String, outputFormat: StringOutputFormat): String = js.native
  def crypto_core_ristretto255_scalar_complement(scalar: String, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_complement(scalar: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_complement(scalar: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_core_ristretto255_scalar_complement(scalar: Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_invert(scalar: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_invert(scalar: String, outputFormat: StringOutputFormat): String = js.native
  def crypto_core_ristretto255_scalar_invert(scalar: String, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_invert(scalar: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_invert(scalar: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_core_ristretto255_scalar_invert(scalar: Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_mul(x: scala.scalajs.js.typedarray.Uint8Array, y: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_mul(
    x: scala.scalajs.js.typedarray.Uint8Array,
    y: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_core_ristretto255_scalar_mul(
    x: scala.scalajs.js.typedarray.Uint8Array,
    y: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_negate(scalar: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_negate(scalar: String, outputFormat: StringOutputFormat): String = js.native
  def crypto_core_ristretto255_scalar_negate(scalar: String, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_negate(scalar: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_negate(scalar: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_core_ristretto255_scalar_negate(scalar: Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_random(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_random(outputFormat: StringOutputFormat): String = js.native
  def crypto_core_ristretto255_scalar_random(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_reduce(secret: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_reduce(secret: String, outputFormat: StringOutputFormat): String = js.native
  def crypto_core_ristretto255_scalar_reduce(secret: String, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_reduce(secret: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_reduce(secret: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_core_ristretto255_scalar_reduce(secret: Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_sub(x: scala.scalajs.js.typedarray.Uint8Array, y: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_scalar_sub(
    x: scala.scalajs.js.typedarray.Uint8Array,
    y: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_core_ristretto255_scalar_sub(
    x: scala.scalajs.js.typedarray.Uint8Array,
    y: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_sub(p: scala.scalajs.js.typedarray.Uint8Array, q: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_core_ristretto255_sub(
    p: scala.scalajs.js.typedarray.Uint8Array,
    q: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_core_ristretto255_sub(
    p: scala.scalajs.js.typedarray.Uint8Array,
    q: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: String, key: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: String, key: String, outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash(hash_length: Double, message: String, key: String, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: String, key: Null, outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash(hash_length: Double, message: String, key: Null, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: String, key: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: String, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash(hash_length: Double, message: String, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: String, outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: String, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: Null, outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: Null, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash_blake2b_salt_personal(
    subkey_len: Double,
    key: String,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash_blake2b_salt_personal(
    subkey_len: Double,
    key: String,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_generichash_blake2b_salt_personal(
    subkey_len: Double,
    key: String,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash_blake2b_salt_personal(
    subkey_len: Double,
    key: Null,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash_blake2b_salt_personal(
    subkey_len: Double,
    key: Null,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_generichash_blake2b_salt_personal(
    subkey_len: Double,
    key: Null,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash_blake2b_salt_personal(
    subkey_len: Double,
    key: Uint8Array,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash_blake2b_salt_personal(
    subkey_len: Double,
    key: Uint8Array,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_generichash_blake2b_salt_personal(
    subkey_len: Double,
    key: Uint8Array,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash_final(state_address: StateAddress, hash_length: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash_final(state_address: StateAddress, hash_length: Double, outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash_final(state_address: StateAddress, hash_length: Double, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash_init(key: String, hash_length: Double): StateAddress = js.native
  def crypto_generichash_init(key: Null, hash_length: Double): StateAddress = js.native
  def crypto_generichash_init(key: Uint8Array, hash_length: Double): StateAddress = js.native
  def crypto_generichash_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_generichash_update(state_address: StateAddress, message_chunk: String): Unit = js.native
  def crypto_generichash_update(state_address: StateAddress, message_chunk: Uint8Array): Unit = js.native
  def crypto_hash(message: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_hash(message: String, outputFormat: StringOutputFormat): String = js.native
  def crypto_hash(message: String, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_hash(message: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_hash(message: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_hash(message: Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_hash_sha256(message: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_hash_sha256(message: String, outputFormat: StringOutputFormat): String = js.native
  def crypto_hash_sha256(message: String, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_hash_sha256(message: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_hash_sha256(message: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_hash_sha256(message: Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_hash_sha512(message: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_hash_sha512(message: String, outputFormat: StringOutputFormat): String = js.native
  def crypto_hash_sha512(message: String, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_hash_sha512(message: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_hash_sha512(message: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_hash_sha512(message: Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_kdf_derive_from_key(subkey_len: Double, subkey_id: Double, ctx: String, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_kdf_derive_from_key(
    subkey_len: Double,
    subkey_id: Double,
    ctx: String,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_kdf_derive_from_key(
    subkey_len: Double,
    subkey_id: Double,
    ctx: String,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_kdf_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_kdf_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_kdf_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_kx_client_session_keys(
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    clientSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoKX = js.native
  def crypto_kx_client_session_keys(
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    clientSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = js.native
  def crypto_kx_client_session_keys(
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    clientSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = js.native
  def crypto_kx_keypair(): KeyPair = js.native
  def crypto_kx_keypair(outputFormat: StringOutputFormat): StringKeyPair = js.native
  def crypto_kx_keypair(outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  def crypto_kx_seed_keypair(seed: scala.scalajs.js.typedarray.Uint8Array): KeyPair = js.native
  def crypto_kx_seed_keypair(seed: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  def crypto_kx_seed_keypair(seed: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  def crypto_kx_server_session_keys(
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    serverSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoKX = js.native
  def crypto_kx_server_session_keys(
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    serverSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = js.native
  def crypto_kx_server_session_keys(
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    serverSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = js.native
  def crypto_onetimeauth(message: String, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_onetimeauth(message: String, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_onetimeauth(message: String, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_onetimeauth(message: Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_onetimeauth(message: Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_onetimeauth(
    message: Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_onetimeauth_final(state_address: StateAddress): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_onetimeauth_final(state_address: StateAddress, outputFormat: StringOutputFormat): String = js.native
  def crypto_onetimeauth_final(state_address: StateAddress, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_onetimeauth_init(): StateAddress = js.native
  def crypto_onetimeauth_init(key: String): StateAddress = js.native
  def crypto_onetimeauth_init(key: Uint8Array): StateAddress = js.native
  def crypto_onetimeauth_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_onetimeauth_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_onetimeauth_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_onetimeauth_update(state_address: StateAddress, message_chunk: String): Unit = js.native
  def crypto_onetimeauth_update(state_address: StateAddress, message_chunk: Uint8Array): Unit = js.native
  def crypto_onetimeauth_verify(
    hash: scala.scalajs.js.typedarray.Uint8Array,
    message: String,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
  def crypto_onetimeauth_verify(
    hash: scala.scalajs.js.typedarray.Uint8Array,
    message: Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
  def crypto_pwhash(
    keyLength: Double,
    password: String,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash(
    keyLength: Double,
    password: String,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_pwhash(
    keyLength: Double,
    password: String,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash(
    keyLength: Double,
    password: Uint8Array,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash(
    keyLength: Double,
    password: Uint8Array,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_pwhash(
    keyLength: Double,
    password: Uint8Array,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash_scryptsalsa208sha256(
    keyLength: Double,
    password: String,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash_scryptsalsa208sha256(
    keyLength: Double,
    password: String,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_pwhash_scryptsalsa208sha256(
    keyLength: Double,
    password: String,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash_scryptsalsa208sha256(
    keyLength: Double,
    password: Uint8Array,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash_scryptsalsa208sha256(
    keyLength: Double,
    password: Uint8Array,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_pwhash_scryptsalsa208sha256(
    keyLength: Double,
    password: Uint8Array,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash_scryptsalsa208sha256_ll(password: String, salt: String, opsLimit: Double, r: Double, p: Double, keyLength: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash_scryptsalsa208sha256_ll(
    password: String,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_pwhash_scryptsalsa208sha256_ll(
    password: String,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash_scryptsalsa208sha256_ll(password: String, salt: Uint8Array, opsLimit: Double, r: Double, p: Double, keyLength: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash_scryptsalsa208sha256_ll(
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_pwhash_scryptsalsa208sha256_ll(
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash_scryptsalsa208sha256_ll(password: Uint8Array, salt: String, opsLimit: Double, r: Double, p: Double, keyLength: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash_scryptsalsa208sha256_ll(
    password: Uint8Array,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_pwhash_scryptsalsa208sha256_ll(
    password: Uint8Array,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash_scryptsalsa208sha256_ll(password: Uint8Array, salt: Uint8Array, opsLimit: Double, r: Double, p: Double, keyLength: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash_scryptsalsa208sha256_ll(
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_pwhash_scryptsalsa208sha256_ll(
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_pwhash_scryptsalsa208sha256_str(password: String, opsLimit: Double, memLimit: Double): String = js.native
  def crypto_pwhash_scryptsalsa208sha256_str(password: Uint8Array, opsLimit: Double, memLimit: Double): String = js.native
  def crypto_pwhash_scryptsalsa208sha256_str_verify(hashed_password: String, password: String): Boolean = js.native
  def crypto_pwhash_scryptsalsa208sha256_str_verify(hashed_password: String, password: Uint8Array): Boolean = js.native
  def crypto_pwhash_str(password: String, opsLimit: Double, memLimit: Double): String = js.native
  def crypto_pwhash_str(password: Uint8Array, opsLimit: Double, memLimit: Double): String = js.native
  def crypto_pwhash_str_verify(hashed_password: String, password: String): Boolean = js.native
  def crypto_pwhash_str_verify(hashed_password: String, password: Uint8Array): Boolean = js.native
  def crypto_scalarmult(
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_scalarmult(
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_scalarmult(
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_scalarmult_base(privateKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_scalarmult_base(privateKey: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_scalarmult_base(privateKey: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_scalarmult_ristretto255(scalar: scala.scalajs.js.typedarray.Uint8Array, point: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_scalarmult_ristretto255_base(scalar: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretbox_detached(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): SecretBox = js.native
  def crypto_secretbox_detached(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringSecretBox = js.native
  def crypto_secretbox_detached(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): SecretBox = js.native
  def crypto_secretbox_detached(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): SecretBox = js.native
  def crypto_secretbox_detached(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringSecretBox = js.native
  def crypto_secretbox_detached(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): SecretBox = js.native
  def crypto_secretbox_easy(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretbox_easy(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretbox_easy(
    message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretbox_easy(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretbox_easy(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretbox_easy(
    message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretbox_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretbox_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_secretbox_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretbox_open_detached(
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretbox_open_detached(
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretbox_open_detached(
    ciphertext: String,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretbox_open_detached(
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretbox_open_detached(
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretbox_open_detached(
    ciphertext: Uint8Array,
    mac: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretbox_open_easy(
    ciphertext: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretbox_open_easy(
    ciphertext: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretbox_open_easy(
    ciphertext: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretbox_open_easy(
    ciphertext: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretbox_open_easy(
    ciphertext: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretbox_open_easy(
    ciphertext: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_init_pull(header: scala.scalajs.js.typedarray.Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array): StateAddress = js.native
  def crypto_secretstream_xchacha20poly1305_init_push(key: scala.scalajs.js.typedarray.Uint8Array): Anon_Header = js.native
  def crypto_secretstream_xchacha20poly1305_init_push(key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): Anon_HeaderState = js.native
  def crypto_secretstream_xchacha20poly1305_init_push(key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): Anon_Header = js.native
  def crypto_secretstream_xchacha20poly1305_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_secretstream_xchacha20poly1305_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: String): MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: String, ad: String): MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: String, ad: String, outputFormat: StringOutputFormat): StringMessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: String, ad: String, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: String, ad: Null, outputFormat: StringOutputFormat): StringMessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: String, ad: Null, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: String, ad: Uint8Array): MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: String, ad: Uint8Array, outputFormat: StringOutputFormat): StringMessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: String, ad: Uint8Array, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: Uint8Array): MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: Uint8Array, ad: String): MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: Uint8Array, ad: String, outputFormat: StringOutputFormat): StringMessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: Uint8Array, ad: String, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: Uint8Array, ad: Null, outputFormat: StringOutputFormat): StringMessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: Uint8Array, ad: Null, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: Uint8Array, ad: Uint8Array): MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: StateAddress, cipher: Uint8Array, ad: Uint8Array, outputFormat: StringOutputFormat): StringMessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(
    state_address: StateAddress,
    cipher: Uint8Array,
    ad: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_push(state_address: StateAddress, message_chunk: String, ad: String, tag: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: StateAddress,
    message_chunk: String,
    ad: String,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: StateAddress,
    message_chunk: String,
    ad: String,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(state_address: StateAddress, message_chunk: String, ad: Null, tag: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: StateAddress,
    message_chunk: String,
    ad: Null,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: StateAddress,
    message_chunk: String,
    ad: Null,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(state_address: StateAddress, message_chunk: String, ad: Uint8Array, tag: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: StateAddress,
    message_chunk: String,
    ad: Uint8Array,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: StateAddress,
    message_chunk: String,
    ad: Uint8Array,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(state_address: StateAddress, message_chunk: Uint8Array, ad: String, tag: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: StateAddress,
    message_chunk: Uint8Array,
    ad: String,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: StateAddress,
    message_chunk: Uint8Array,
    ad: String,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(state_address: StateAddress, message_chunk: Uint8Array, ad: Null, tag: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: StateAddress,
    message_chunk: Uint8Array,
    ad: Null,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: StateAddress,
    message_chunk: Uint8Array,
    ad: Null,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(state_address: StateAddress, message_chunk: Uint8Array, ad: Uint8Array, tag: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: StateAddress,
    message_chunk: Uint8Array,
    ad: Uint8Array,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: StateAddress,
    message_chunk: Uint8Array,
    ad: Uint8Array,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_rekey(state_address: StateAddress): `true` = js.native
  def crypto_shorthash(message: String, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_shorthash(message: String, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_shorthash(message: String, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_shorthash(message: Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_shorthash(message: Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_shorthash(
    message: Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_shorthash_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_shorthash_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_shorthash_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_shorthash_siphashx24(message: String, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_shorthash_siphashx24(message: String, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_shorthash_siphashx24(message: String, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_shorthash_siphashx24(message: Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_shorthash_siphashx24(message: Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_shorthash_siphashx24(
    message: Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign(message: String, privateKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign(
    message: String,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_sign(
    message: String,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign(message: Uint8Array, privateKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign(
    message: Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_sign(
    message: Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_detached(message: String, privateKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_detached(
    message: String,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_sign_detached(
    message: String,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_detached(message: Uint8Array, privateKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_detached(
    message: Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_sign_detached(
    message: Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_ed25519_pk_to_curve25519(edPk: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_ed25519_pk_to_curve25519(edPk: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_sign_ed25519_pk_to_curve25519(edPk: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_ed25519_sk_to_curve25519(edSk: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_ed25519_sk_to_curve25519(edSk: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_sign_ed25519_sk_to_curve25519(edSk: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_ed25519_sk_to_pk(privateKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_ed25519_sk_to_pk(privateKey: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_sign_ed25519_sk_to_pk(privateKey: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_ed25519_sk_to_seed(privateKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_ed25519_sk_to_seed(privateKey: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_sign_ed25519_sk_to_seed(privateKey: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_final_create(state_address: StateAddress, privateKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_final_create(
    state_address: StateAddress,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_sign_final_create(
    state_address: StateAddress,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_final_verify(
    state_address: StateAddress,
    signature: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
  def crypto_sign_init(): StateAddress = js.native
  def crypto_sign_keypair(): KeyPair = js.native
  def crypto_sign_keypair(outputFormat: StringOutputFormat): StringKeyPair = js.native
  def crypto_sign_keypair(outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  def crypto_sign_open(signedMessage: String, publicKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_open(
    signedMessage: String,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_sign_open(
    signedMessage: String,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_open(signedMessage: Uint8Array, publicKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_open(
    signedMessage: Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_sign_open(
    signedMessage: Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_sign_seed_keypair(seed: scala.scalajs.js.typedarray.Uint8Array): KeyPair = js.native
  def crypto_sign_seed_keypair(seed: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  def crypto_sign_seed_keypair(seed: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  def crypto_sign_update(state_address: StateAddress, message_chunk: String): Unit = js.native
  def crypto_sign_update(state_address: StateAddress, message_chunk: Uint8Array): Unit = js.native
  def crypto_sign_verify_detached(
    signature: scala.scalajs.js.typedarray.Uint8Array,
    message: String,
    publicKey: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
  def crypto_sign_verify_detached(
    signature: scala.scalajs.js.typedarray.Uint8Array,
    message: Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
  def crypto_stream_chacha20(
    outLength: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20(
    outLength: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_stream_chacha20(
    outLength: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_ietf_xor(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_ietf_xor(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_stream_chacha20_ietf_xor(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_ietf_xor(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_ietf_xor(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_stream_chacha20_ietf_xor(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_ietf_xor_ic(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_ietf_xor_ic(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_stream_chacha20_ietf_xor_ic(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_ietf_xor_ic(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_ietf_xor_ic(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_stream_chacha20_ietf_xor_ic(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_stream_chacha20_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_xor(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_xor(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_stream_chacha20_xor(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_xor(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_xor(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_stream_chacha20_xor(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_xor_ic(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_xor_ic(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_stream_chacha20_xor_ic(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_xor_ic(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_chacha20_xor_ic(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_stream_chacha20_xor_ic(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_stream_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_xchacha20_keygen(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_xchacha20_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_stream_xchacha20_keygen(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_xchacha20_xor(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_xchacha20_xor(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_stream_xchacha20_xor(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_xchacha20_xor(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_xchacha20_xor(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_stream_xchacha20_xor(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_xchacha20_xor_ic(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_xchacha20_xor_ic(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_stream_xchacha20_xor_ic(
    input_message: String,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_xchacha20_xor_ic(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def crypto_stream_xchacha20_xor_ic(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_stream_xchacha20_xor_ic(
    input_message: Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def from_base64(input: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def from_base64(input: String, variant: base64_variants): scala.scalajs.js.typedarray.Uint8Array = js.native
  def from_hex(input: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def from_string(str: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def increment(bytes: scala.scalajs.js.typedarray.Uint8Array): Unit = js.native
  def is_zero(bytes: scala.scalajs.js.typedarray.Uint8Array): Boolean = js.native
  def memcmp(b1: scala.scalajs.js.typedarray.Uint8Array, b2: scala.scalajs.js.typedarray.Uint8Array): Boolean = js.native
  def memzero(bytes: scala.scalajs.js.typedarray.Uint8Array): Unit = js.native
  def output_formats(): js.Array[Uint8ArrayOutputFormat | StringOutputFormat] = js.native
  def pad(buf: scala.scalajs.js.typedarray.Uint8Array, blocksize: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def randombytes_buf(length: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def randombytes_buf(length: Double, outputFormat: StringOutputFormat): String = js.native
  def randombytes_buf(length: Double, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def randombytes_buf_deterministic(length: Double, seed: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def randombytes_buf_deterministic(length: Double, seed: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def randombytes_buf_deterministic(length: Double, seed: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def randombytes_close(): Unit = js.native
  def randombytes_random(): Double = js.native
  def randombytes_stir(): Unit = js.native
  def randombytes_uniform(upper_bound: Double): Double = js.native
  def sodium_version_string(): String = js.native
  def symbols(): js.Array[String] = js.native
  def to_base64(input: String): String = js.native
  def to_base64(input: String, variant: base64_variants): String = js.native
  def to_base64(input: Uint8Array): String = js.native
  def to_base64(input: Uint8Array, variant: base64_variants): String = js.native
  def to_hex(input: String): String = js.native
  def to_hex(input: Uint8Array): String = js.native
  def to_string(bytes: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def unpad(buf: scala.scalajs.js.typedarray.Uint8Array, blocksize: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  @js.native
  object base64_variants extends js.Object {
    /* 0 */ val ORIGINAL: typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.base64_variants.ORIGINAL with Double = js.native
    /* 1 */ val ORIGINAL_NO_PADDING: typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.base64_variants.ORIGINAL_NO_PADDING with Double = js.native
    /* 2 */ val URLSAFE: typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.base64_variants.URLSAFE with Double = js.native
    /* 3 */ val URLSAFE_NO_PADDING: typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.base64_variants.URLSAFE_NO_PADDING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.base64_variants with Double
      ] = js.native
  }
  
}

