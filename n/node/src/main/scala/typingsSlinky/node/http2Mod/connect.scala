package typingsSlinky.node.http2Mod

import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.tlsMod.TLSSocket
import typingsSlinky.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "connect")
@js.native
object connect extends js.Object {
  def apply(authority: String): ClientHttp2Session = js.native
  def apply(
    authority: String,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: String, options: ClientSessionOptions): ClientHttp2Session = js.native
  def apply(
    authority: String,
    options: ClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: String, options: SecureClientSessionOptions): ClientHttp2Session = js.native
  def apply(
    authority: String,
    options: SecureClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: URL): ClientHttp2Session = js.native
  def apply(
    authority: URL,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: URL, options: ClientSessionOptions): ClientHttp2Session = js.native
  def apply(
    authority: URL,
    options: ClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: URL, options: SecureClientSessionOptions): ClientHttp2Session = js.native
  def apply(
    authority: URL,
    options: SecureClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
}

