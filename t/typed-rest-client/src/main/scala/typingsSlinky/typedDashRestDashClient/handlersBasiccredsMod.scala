package typingsSlinky.typedDashRestDashClient

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.typedDashRestDashClient.interfacesMod.IHttpClient
import typingsSlinky.typedDashRestDashClient.interfacesMod.IHttpClientResponse
import typingsSlinky.typedDashRestDashClient.interfacesMod.IRequestHandler
import typingsSlinky.typedDashRestDashClient.interfacesMod.IRequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/handlers/basiccreds", JSImport.Namespace)
@js.native
object handlersBasiccredsMod extends js.Object {
  @js.native
  class BasicCredentialHandler protected () extends IRequestHandler {
    def this(username: String, password: String) = this()
    var password: String = js.native
    var username: String = js.native
    /* CompleteClass */
    override def canHandleAuthentication(response: IHttpClientResponse): Boolean = js.native
    /* CompleteClass */
    override def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): js.Promise[IHttpClientResponse] = js.native
    def prepareRequest(options: js.Any): Unit = js.native
    /* CompleteClass */
    override def prepareRequest(options: RequestOptions): Unit = js.native
  }
  
}

