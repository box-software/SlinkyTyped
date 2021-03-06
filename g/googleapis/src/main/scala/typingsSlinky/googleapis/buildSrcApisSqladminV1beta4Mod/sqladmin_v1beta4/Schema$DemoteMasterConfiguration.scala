package typingsSlinky.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Read-replica configuration for connecting to the on-premises master.
  */
@js.native
trait Schema$DemoteMasterConfiguration extends js.Object {
  /**
    * This is always sql#demoteMasterConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * MySQL specific configuration when replicating from a MySQL on-premises
    * master. Replication configuration information such as the username,
    * password, certificates, and keys are not stored in the instance metadata.
    * The configuration information is used only to set up the replication
    * connection and is stored by MySQL in a file named master.info in the data
    * directory.
    */
  var mysqlReplicaConfiguration: js.UndefOr[Schema$DemoteMasterMySqlReplicaConfiguration] = js.native
}

object Schema$DemoteMasterConfiguration {
  @scala.inline
  def apply(
    kind: String = null,
    mysqlReplicaConfiguration: Schema$DemoteMasterMySqlReplicaConfiguration = null
  ): Schema$DemoteMasterConfiguration = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mysqlReplicaConfiguration != null) __obj.updateDynamic("mysqlReplicaConfiguration")(mysqlReplicaConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DemoteMasterConfiguration]
  }
}

