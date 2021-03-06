package typingsSlinky.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateScalingParametersRequest extends js.Object {
  var DomainName: typingsSlinky.awsDashSdk.clientsCloudsearchMod.DomainName = js.native
  var ScalingParameters: typingsSlinky.awsDashSdk.clientsCloudsearchMod.ScalingParameters = js.native
}

object UpdateScalingParametersRequest {
  @scala.inline
  def apply(DomainName: DomainName, ScalingParameters: ScalingParameters): UpdateScalingParametersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ScalingParameters = ScalingParameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateScalingParametersRequest]
  }
}

