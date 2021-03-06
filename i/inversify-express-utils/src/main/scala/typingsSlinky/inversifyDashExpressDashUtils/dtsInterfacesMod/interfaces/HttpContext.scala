package typingsSlinky.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces

import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpContext extends js.Object {
  var container: Container
  var request: Request[ParamsDictionary]
  var response: Response
  var user: Principal
}

object HttpContext {
  @scala.inline
  def apply(container: Container, request: Request[ParamsDictionary], response: Response, user: Principal): HttpContext = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpContext]
  }
}

