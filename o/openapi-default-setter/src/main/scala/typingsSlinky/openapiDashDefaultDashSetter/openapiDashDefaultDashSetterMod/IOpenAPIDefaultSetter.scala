package typingsSlinky.openapiDashDefaultDashSetter.openapiDashDefaultDashSetterMod

import typingsSlinky.openapiDashTypes.openapiDashTypesMod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenAPIDefaultSetter extends js.Object {
  def handle(request: Request): Unit
}

object IOpenAPIDefaultSetter {
  @scala.inline
  def apply(handle: Request => Unit): IOpenAPIDefaultSetter = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
  
    __obj.asInstanceOf[IOpenAPIDefaultSetter]
  }
}

