package typingsSlinky.teenyDashRequest.teenyDashRequestMod

import typingsSlinky.node.httpsMod.Agent
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.teenyDashRequest.teenyDashRequestBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends Transform {
  var agent: Agent | `false` = js.native
  var headers: Headers = js.native
  var href: js.UndefOr[String] = js.native
}

