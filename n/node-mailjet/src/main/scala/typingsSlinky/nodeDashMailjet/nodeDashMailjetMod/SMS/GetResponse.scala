package typingsSlinky.nodeDashMailjet.nodeDashMailjetMod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// responses
trait GetResponse extends js.Object {
  val body: GetResponseData
}

object GetResponse {
  @scala.inline
  def apply(body: GetResponseData): GetResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetResponse]
  }
}

