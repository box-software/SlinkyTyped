package typingsSlinky.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDistributionsResult extends js.Object {
  /**
    * The DistributionList type. 
    */
  var DistributionList: js.UndefOr[typingsSlinky.awsDashSdk.clientsCloudfrontMod.DistributionList] = js.native
}

object ListDistributionsResult {
  @scala.inline
  def apply(DistributionList: DistributionList = null): ListDistributionsResult = {
    val __obj = js.Dynamic.literal()
    if (DistributionList != null) __obj.updateDynamic("DistributionList")(DistributionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDistributionsResult]
  }
}

