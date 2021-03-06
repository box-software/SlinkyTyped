package typingsSlinky.samchon

import typingsSlinky.samchon.protocolCommunicatorIServerConnectorMod.IServerConnector
import typingsSlinky.samchon.templatesSlaveSlaveSystemMod.SlaveSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/slave/SlaveClient", JSImport.Namespace)
@js.native
object templatesSlaveSlaveClientMod extends js.Object {
  @js.native
  trait ISlaveClient extends SlaveSystem {
    def connect(ip: String, port: Double): Unit = js.native
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveClient () extends ISlaveClient {
    /**
      * @inheritdoc
      */
    /* protected */ def createServerConnector(): IServerConnector = js.native
  }
  
}

