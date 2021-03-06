package typingsSlinky.mali.maliMod

import typingsSlinky.grpc.grpcMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mali", "Response")
@js.native
class Response protected () extends js.Object {
  def this(call: js.Any, `type`: String) = this()
  var call: js.Any = js.native
  var metadata: js.Any = js.native
  var res: GrpcResponse = js.native
  var status: js.Any = js.native
  var `type`: String = js.native
  def get(field: String): js.Any = js.native
  def getMetadata(): Metadata = js.native
  def getStatus(field: String): js.Any = js.native
  def sendMetadata(): Unit = js.native
  def sendMetadata(md: js.Any): Unit = js.native
  def set(field: js.Any): Unit = js.native
  def set(field: js.Any, `val`: js.Any): Unit = js.native
  def setStatus(field: js.Any): Unit = js.native
  def setStatus(field: js.Any, `val`: js.Any): Unit = js.native
}

