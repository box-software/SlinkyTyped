package typingsSlinky.samchon.samchonMod.protocol

import typingsSlinky.samchon.protocolInvokeIProtocolMod.IProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon", "protocol.SharedWorkerServerConnector")
@js.native
class SharedWorkerServerConnector protected ()
  extends typingsSlinky.samchon.protocolMod.SharedWorkerServerConnector {
  /**
    * Construct from *listener*.
    *
    * @param listener A listener object to listen replied message from newly connected client in
    *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
    */
  def this(listener: IProtocol) = this()
}

