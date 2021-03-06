package typingsSlinky.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuroraParameters extends js.Object {
  /**
    * Database.
    */
  var Database: typingsSlinky.awsDashSdk.clientsQuicksightMod.Database = js.native
  /**
    * Host.
    */
  var Host: typingsSlinky.awsDashSdk.clientsQuicksightMod.Host = js.native
  /**
    * Port.
    */
  var Port: typingsSlinky.awsDashSdk.clientsQuicksightMod.Port = js.native
}

object AuroraParameters {
  @scala.inline
  def apply(Database: Database, Host: Host, Port: Port): AuroraParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuroraParameters]
  }
}

