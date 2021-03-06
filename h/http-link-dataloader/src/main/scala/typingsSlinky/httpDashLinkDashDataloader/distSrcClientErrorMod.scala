package typingsSlinky.httpDashLinkDashDataloader

import typingsSlinky.httpDashLinkDashDataloader.distSrcTypesMod.GraphQLResponse
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-link-dataloader/dist/src/ClientError", JSImport.Namespace)
@js.native
object distSrcClientErrorMod extends js.Object {
  @js.native
  class ClientError protected () extends Error {
    def this(result: GraphQLResponse) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var result: GraphQLResponse = js.native
  }
  
  /* static members */
  @js.native
  object ClientError extends js.Object {
    /* private */ def extractMessage(response: js.Any): js.Any = js.native
  }
  
}

