package typingsSlinky.inversifyDashExpressDashUtils.dtsResultsConflictResultMod

import typingsSlinky.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage
import typingsSlinky.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConflictResult extends IHttpActionResult {
  var apiController: js.Any
}

object ConflictResult {
  @scala.inline
  def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): ConflictResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync))
  
    __obj.asInstanceOf[ConflictResult]
  }
}

