package typingsSlinky.atAwsDashSdkClientDashXrayDashNode

import typingsSlinky.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingRuleRecordMod._UnmarshalledSamplingRuleRecord
import typingsSlinky.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/UpdateSamplingRuleOutput", JSImport.Namespace)
@js.native
object typesUpdateSamplingRuleOutputMod extends js.Object {
  @js.native
  trait UpdateSamplingRuleOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The updated rule definition and metadata.</p>
      */
    var SamplingRuleRecord: js.UndefOr[_UnmarshalledSamplingRuleRecord] = js.native
  }
  
}

