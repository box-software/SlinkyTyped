package typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreTimeToLiveSpecificationMod._TimeToLiveSpecification
import typingsSlinky.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/types/UpdateTimeToLiveInput", JSImport.Namespace)
@js.native
object typesUpdateTimeToLiveInputMod extends js.Object {
  @js.native
  trait UpdateTimeToLiveInput extends InputTypesUnion {
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>The name of the table to be configured.</p>
      */
    var TableName: String = js.native
    /**
      * <p>Represents the settings used to enable or disable Time to Live for the specified table.</p>
      */
    var TimeToLiveSpecification: _TimeToLiveSpecification = js.native
  }
  
}

