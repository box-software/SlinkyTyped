package typingsSlinky.awsDashLambda

import typingsSlinky.awsDashLambda.awsDashLambdaMod.CloudFrontRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: CloudFrontRequest
}

object Anon_Request {
  @scala.inline
  def apply(request: CloudFrontRequest): Anon_Request = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Request]
  }
}

