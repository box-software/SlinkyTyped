package typingsSlinky.inversifyDashExpressDashUtils

import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/content/httpContent", JSImport.Namespace)
@js.native
object dtsContentHttpContentMod extends js.Object {
  @js.native
  abstract class HttpContent () extends js.Object {
    var _headers: js.Any = js.native
    val headers: OutgoingHttpHeaders = js.native
    def readAsStringAsync(): js.Promise[String] = js.native
  }
  
}

