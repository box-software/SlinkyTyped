package typingsSlinky.nextDashServer.distServerRouterMod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/server/router", JSImport.Default)
@js.native
class default () extends Router {
  def this(routes: js.Array[Route]) = this()
  /* CompleteClass */
  override var routes: js.Array[Route] = js.native
  /* CompleteClass */
  override def add(route: Route): Unit = js.native
  /* CompleteClass */
  override def `match`(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.UndefOr[js.Function0[Unit]] = js.native
}

