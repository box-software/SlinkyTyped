package typingsSlinky.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The returned list of pipelines in the project.
  */
@js.native
trait Schema$ListTransferConfigsResponse extends js.Object {
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the `ListTransferConfigsRequest.page_token` to
    * request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. The stored pipeline transfer configurations.
    */
  var transferConfigs: js.UndefOr[js.Array[Schema$TransferConfig]] = js.native
}

object Schema$ListTransferConfigsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, transferConfigs: js.Array[Schema$TransferConfig] = null): Schema$ListTransferConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (transferConfigs != null) __obj.updateDynamic("transferConfigs")(transferConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListTransferConfigsResponse]
  }
}

