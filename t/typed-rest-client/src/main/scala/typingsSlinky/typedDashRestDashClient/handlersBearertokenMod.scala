package typingsSlinky.typedDashRestDashClient

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.typedDashRestDashClient.interfacesMod.IHttpClient
import typingsSlinky.typedDashRestDashClient.interfacesMod.IHttpClientResponse
import typingsSlinky.typedDashRestDashClient.interfacesMod.IRequestHandler
import typingsSlinky.typedDashRestDashClient.interfacesMod.IRequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/handlers/bearertoken", JSImport.Namespace)
@js.native
object handlersBearertokenMod extends js.Object {
  @js.native
  class BearerCredentialHandler protected () extends IRequestHandler {
    def this(token: String) = this()
    var token: String = js.native
    /* CompleteClass */
    override def canHandleAuthentication(response: IHttpClientResponse): Boolean = js.native
    /* CompleteClass */
    override def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): js.Promise[IHttpClientResponse] = js.native
    def prepareRequest(options: js.Any): Unit = js.native
    /* CompleteClass */
    override def prepareRequest(options: RequestOptions): Unit = js.native
  }
  
}

