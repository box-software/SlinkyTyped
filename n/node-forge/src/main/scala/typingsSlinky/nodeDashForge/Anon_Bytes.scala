package typingsSlinky.nodeDashForge

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeDashForge.nodeDashForgeMod.Bytes
import typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.CAStore
import typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.Certificate
import typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.PEM
import typingsSlinky.nodeDashForge.nodeDashForgeMod.tls.CertificateRequest
import typingsSlinky.nodeDashForge.nodeDashForgeMod.tls.CipherSuite
import typingsSlinky.nodeDashForge.nodeDashForgeMod.tls.Connection
import typingsSlinky.nodeDashForge.nodeDashForgeMod.tls.Session
import typingsSlinky.nodeDashForge.nodeDashForgeMod.tls.SessionCache
import typingsSlinky.nodeDashForge.nodeDashForgeMod.tls.TLSError
import typingsSlinky.nodeDashForge.nodeDashForgeMod.tls.Verified
import typingsSlinky.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bytes extends js.Object {
  var caStore: js.UndefOr[CAStore | js.Array[Certificate]] = js.undefined
  var cipherSuites: js.UndefOr[js.Array[CipherSuite]] = js.undefined
  var deflate: js.UndefOr[js.Function1[/* inBytes */ Bytes, Bytes]] = js.undefined
  var getCertificate: js.UndefOr[
    js.Function2[
      /* conn */ Connection, 
      /* hint */ CertificateRequest | js.Array[String], 
      PEM | js.Array[PEM]
    ]
  ] = js.undefined
  var getPrivateKey: js.UndefOr[js.Function2[/* conn */ Connection, /* certificate */ Certificate, PEM]] = js.undefined
  var getSignature: js.UndefOr[
    js.Function3[
      /* conn */ Connection, 
      /* bytes */ Bytes, 
      /* callback */ js.Function2[/* conn */ Connection, /* bytes */ Bytes, Unit], 
      Unit
    ]
  ] = js.undefined
  var heartbeatReceived: js.UndefOr[js.Function2[/* conn */ Connection, /* payload */ ByteBuffer, Unit]] = js.undefined
  var inflate: js.UndefOr[js.Function1[/* inBytes */ Bytes, Bytes]] = js.undefined
  var server: js.UndefOr[Boolean] = js.undefined
  var sessionCache: js.UndefOr[SessionCache | StringDictionary[Session]] = js.undefined
  var sessionId: js.UndefOr[Bytes | Null] = js.undefined
  var verify: js.UndefOr[
    js.Function4[
      /* conn */ Connection, 
      /* verified */ Verified, 
      /* depth */ Double, 
      /* certs */ js.Array[Certificate], 
      Verified
    ]
  ] = js.undefined
  var verifyClient: js.UndefOr[Boolean] = js.undefined
  var virtualHost: js.UndefOr[String] = js.undefined
  def closed(conn: Connection): Unit
  def connected(conn: Connection): Unit
  def dataReady(conn: Connection): Unit
  def error(conn: Connection, error: TLSError): Unit
  def tlsDataReady(conn: Connection): Unit
}

object Anon_Bytes {
  @scala.inline
  def apply(
    closed: Connection => Unit,
    connected: Connection => Unit,
    dataReady: Connection => Unit,
    error: (Connection, TLSError) => Unit,
    tlsDataReady: Connection => Unit,
    caStore: CAStore | js.Array[Certificate] = null,
    cipherSuites: js.Array[CipherSuite] = null,
    deflate: /* inBytes */ Bytes => Bytes = null,
    getCertificate: (/* conn */ Connection, /* hint */ CertificateRequest | js.Array[String]) => PEM | js.Array[PEM] = null,
    getPrivateKey: (/* conn */ Connection, /* certificate */ Certificate) => PEM = null,
    getSignature: (/* conn */ Connection, /* bytes */ Bytes, /* callback */ js.Function2[/* conn */ Connection, /* bytes */ Bytes, Unit]) => Unit = null,
    heartbeatReceived: (/* conn */ Connection, /* payload */ ByteBuffer) => Unit = null,
    inflate: /* inBytes */ Bytes => Bytes = null,
    server: js.UndefOr[Boolean] = js.undefined,
    sessionCache: SessionCache | StringDictionary[Session] = null,
    sessionId: Bytes = null,
    verify: (/* conn */ Connection, /* verified */ Verified, /* depth */ Double, /* certs */ js.Array[Certificate]) => Verified = null,
    verifyClient: js.UndefOr[Boolean] = js.undefined,
    virtualHost: String = null
  ): Anon_Bytes = {
    val __obj = js.Dynamic.literal(closed = js.Any.fromFunction1(closed), connected = js.Any.fromFunction1(connected), dataReady = js.Any.fromFunction1(dataReady), error = js.Any.fromFunction2(error), tlsDataReady = js.Any.fromFunction1(tlsDataReady))
    if (caStore != null) __obj.updateDynamic("caStore")(caStore.asInstanceOf[js.Any])
    if (cipherSuites != null) __obj.updateDynamic("cipherSuites")(cipherSuites.asInstanceOf[js.Any])
    if (deflate != null) __obj.updateDynamic("deflate")(js.Any.fromFunction1(deflate))
    if (getCertificate != null) __obj.updateDynamic("getCertificate")(js.Any.fromFunction2(getCertificate))
    if (getPrivateKey != null) __obj.updateDynamic("getPrivateKey")(js.Any.fromFunction2(getPrivateKey))
    if (getSignature != null) __obj.updateDynamic("getSignature")(js.Any.fromFunction3(getSignature))
    if (heartbeatReceived != null) __obj.updateDynamic("heartbeatReceived")(js.Any.fromFunction2(heartbeatReceived))
    if (inflate != null) __obj.updateDynamic("inflate")(js.Any.fromFunction1(inflate))
    if (!js.isUndefined(server)) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (sessionCache != null) __obj.updateDynamic("sessionCache")(sessionCache.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction4(verify))
    if (!js.isUndefined(verifyClient)) __obj.updateDynamic("verifyClient")(verifyClient.asInstanceOf[js.Any])
    if (virtualHost != null) __obj.updateDynamic("virtualHost")(virtualHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bytes]
  }
}

