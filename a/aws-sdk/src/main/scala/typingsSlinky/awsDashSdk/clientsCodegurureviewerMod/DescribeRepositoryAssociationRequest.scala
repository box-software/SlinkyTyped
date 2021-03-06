package typingsSlinky.awsDashSdk.clientsCodegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRepositoryAssociationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) identifying the association.
    */
  var AssociationArn: Arn = js.native
}

object DescribeRepositoryAssociationRequest {
  @scala.inline
  def apply(AssociationArn: Arn): DescribeRepositoryAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationArn = AssociationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeRepositoryAssociationRequest]
  }
}

