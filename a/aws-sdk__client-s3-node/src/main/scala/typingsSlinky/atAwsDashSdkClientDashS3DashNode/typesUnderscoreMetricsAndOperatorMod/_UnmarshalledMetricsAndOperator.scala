package typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreMetricsAndOperatorMod

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTagMod._UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledMetricsAndOperator extends _MetricsAndOperator {
  /**
    * <p>The list of tags used when evaluating an AND predicate.</p>
    */
  @JSName("Tags")
  var Tags__UnmarshalledMetricsAndOperator: js.UndefOr[js.Array[_UnmarshalledTag]] = js.undefined
}

object _UnmarshalledMetricsAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[_UnmarshalledTag] = null): _UnmarshalledMetricsAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledMetricsAndOperator]
  }
}

