package typingsSlinky.inversifyDashExpressDashUtils.inversifyDashExpressDashUtilsMod

import typingsSlinky.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.HandlerDecorator
import typingsSlinky.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", "httpPost")
@js.native
object httpPost extends js.Object {
  def apply(path: String, middleware: Middleware*): HandlerDecorator = js.native
}

