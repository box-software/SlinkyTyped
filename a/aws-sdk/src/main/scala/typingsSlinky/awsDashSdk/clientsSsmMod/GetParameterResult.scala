package typingsSlinky.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParameterResult extends js.Object {
  /**
    * Information about a parameter.
    */
  var Parameter: js.UndefOr[typingsSlinky.awsDashSdk.clientsSsmMod.Parameter] = js.native
}

object GetParameterResult {
  @scala.inline
  def apply(Parameter: Parameter = null): GetParameterResult = {
    val __obj = js.Dynamic.literal()
    if (Parameter != null) __obj.updateDynamic("Parameter")(Parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameterResult]
  }
}

