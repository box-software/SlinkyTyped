package typingsSlinky.intercomDashClient.intercomErrorMod

import typingsSlinky.intercomDashClient.Anon_Errorlist
import typingsSlinky.intercomDashClient.Anon_K
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntercomError extends js.Object {
  var body: Anon_Errorlist
  var headers: Anon_K
  var statusCode: Double
}

object IntercomError {
  @scala.inline
  def apply(body: Anon_Errorlist, headers: Anon_K, statusCode: Double): IntercomError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IntercomError]
  }
}

