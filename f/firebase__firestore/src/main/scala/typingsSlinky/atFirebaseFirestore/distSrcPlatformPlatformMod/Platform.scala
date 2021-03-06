package typingsSlinky.atFirebaseFirestore.distSrcPlatformPlatformMod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Window
import typingsSlinky.atFirebaseFirestore.distSrcCoreDatabaseUnderscoreInfoMod.DatabaseId
import typingsSlinky.atFirebaseFirestore.distSrcCoreDatabaseUnderscoreInfoMod.DatabaseInfo
import typingsSlinky.atFirebaseFirestore.distSrcCoreTypesMod.ProtoByteString
import typingsSlinky.atFirebaseFirestore.distSrcRemoteConnectionMod.Connection
import typingsSlinky.atFirebaseFirestore.distSrcRemoteConnectivityUnderscoreMonitorMod.ConnectivityMonitor
import typingsSlinky.atFirebaseFirestore.distSrcRemoteSerializerMod.JsonProtoSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platform extends js.Object {
  /** True if and only if the Base64 conversion functions are available. */
  val base64Available: Boolean
  /** The Platform's 'document' implementation or null if not available. */
  val document: Document | Null
  val emptyByteString: ProtoByteString
  /** The Platform's 'window' implementation or null if not available. */
  val window: Window | Null
  /** Converts a Base64 encoded string to a binary string. */
  def atob(encoded: String): String
  /** Converts a binary string to a Base64 encoded string. */
  def btoa(raw: String): String
  /** Formats an object as a JSON string, suitable for logging. */
  def formatJSON(value: js.Any): String
  def loadConnection(databaseInfo: DatabaseInfo): js.Promise[Connection]
  def newConnectivityMonitor(): ConnectivityMonitor
  def newSerializer(databaseId: DatabaseId): JsonProtoSerializer
}

object Platform {
  @scala.inline
  def apply(
    atob: String => String,
    base64Available: Boolean,
    btoa: String => String,
    emptyByteString: ProtoByteString,
    formatJSON: js.Any => String,
    loadConnection: DatabaseInfo => js.Promise[Connection],
    newConnectivityMonitor: () => ConnectivityMonitor,
    newSerializer: DatabaseId => JsonProtoSerializer,
    document: Document = null,
    window: Window = null
  ): Platform = {
    val __obj = js.Dynamic.literal(atob = js.Any.fromFunction1(atob), base64Available = base64Available.asInstanceOf[js.Any], btoa = js.Any.fromFunction1(btoa), emptyByteString = emptyByteString.asInstanceOf[js.Any], formatJSON = js.Any.fromFunction1(formatJSON), loadConnection = js.Any.fromFunction1(loadConnection), newConnectivityMonitor = js.Any.fromFunction0(newConnectivityMonitor), newSerializer = js.Any.fromFunction1(newSerializer))
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platform]
  }
}

