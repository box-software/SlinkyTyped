package typingsSlinky.relayDashRuntime

import typingsSlinky.relayDashRuntime.libStoreRelayConnectionMod.ConnectionID
import typingsSlinky.relayDashRuntime.libStoreRelayConnectionMod.ConnectionInternalEvent
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsConnectionID extends ConnectionInternalEvent {
  var args: Variables
  var connectionID: ConnectionID
  var edgeID: String
  var kind: String
  var request: RequestDescriptor
}

object Anon_ArgsConnectionID {
  @scala.inline
  def apply(
    args: Variables,
    connectionID: ConnectionID,
    edgeID: String,
    kind: String,
    request: RequestDescriptor
  ): Anon_ArgsConnectionID = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connectionID = connectionID.asInstanceOf[js.Any], edgeID = edgeID.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArgsConnectionID]
  }
}

