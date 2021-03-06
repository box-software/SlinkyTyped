package typingsSlinky.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelIngestionRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typingsSlinky.awsDashSdk.clientsQuicksightMod.AwsAccountId = js.native
  /**
    * The ID of the dataset used in the ingestion.
    */
  var DataSetId: java.lang.String = js.native
  /**
    * An ID for the ingestion.
    */
  var IngestionId: typingsSlinky.awsDashSdk.clientsQuicksightMod.IngestionId = js.native
}

object CancelIngestionRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSetId: java.lang.String, IngestionId: IngestionId): CancelIngestionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], IngestionId = IngestionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelIngestionRequest]
  }
}

