package typingsSlinky.zapierDashPlatformDashCore.zapierDashPlatformDashCoreMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.ReadableStream
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawHttpResponse extends BaseHttpResponse {
  var body: ReadableStream[_]
  var content: Buffer
  var json: js.Promise[js.UndefOr[js.Object]]
}

object RawHttpResponse {
  @scala.inline
  def apply(
    body: ReadableStream[_],
    content: Buffer,
    getHeader: String => js.UndefOr[String],
    headers: StringDictionary[String],
    json: js.Promise[js.UndefOr[js.Object]],
    request: HttpRequestOptions,
    status: Double,
    throwForStatus: () => Unit
  ): RawHttpResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), headers = headers.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], throwForStatus = js.Any.fromFunction0(throwForStatus))
  
    __obj.asInstanceOf[RawHttpResponse]
  }
}

