package typingsSlinky.clearbladejsDashServer

import typingsSlinky.clearbladejsDashServer.CbServer.BasicReq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: BasicReq
}

object Anon_Request {
  @scala.inline
  def apply(request: BasicReq): Anon_Request = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Request]
  }
}

