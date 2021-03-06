package typingsSlinky.nodecredstash.nodecredstashMod

import typingsSlinky.awsDashSdk.clientsKmsMod.ClientConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredstashConfig extends js.Object {
  var awsOpts: js.UndefOr[ClientConfiguration] = js.undefined
  var dynamoOpts: js.UndefOr[typingsSlinky.awsDashSdk.clientsDynamodbMod.ClientConfiguration] = js.undefined
  var kmsKey: js.UndefOr[String] = js.undefined
  var kmsOpts: js.UndefOr[ClientConfiguration] = js.undefined
  var table: js.UndefOr[String] = js.undefined
}

object CredstashConfig {
  @scala.inline
  def apply(
    awsOpts: ClientConfiguration = null,
    dynamoOpts: typingsSlinky.awsDashSdk.clientsDynamodbMod.ClientConfiguration = null,
    kmsKey: String = null,
    kmsOpts: ClientConfiguration = null,
    table: String = null
  ): CredstashConfig = {
    val __obj = js.Dynamic.literal()
    if (awsOpts != null) __obj.updateDynamic("awsOpts")(awsOpts.asInstanceOf[js.Any])
    if (dynamoOpts != null) __obj.updateDynamic("dynamoOpts")(dynamoOpts.asInstanceOf[js.Any])
    if (kmsKey != null) __obj.updateDynamic("kmsKey")(kmsKey.asInstanceOf[js.Any])
    if (kmsOpts != null) __obj.updateDynamic("kmsOpts")(kmsOpts.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredstashConfig]
  }
}

