package typingsSlinky.winrtDashUwp

import typingsSlinky.winrtDashUwp.Windows.Web.Http.Headers.HttpProductHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProductHeaderValue extends js.Object {
  /** The HttpProductHeaderValue version of the string. */ var productHeaderValue: HttpProductHeaderValue
  /** true if input is valid HttpProductHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_ProductHeaderValue {
  @scala.inline
  def apply(productHeaderValue: HttpProductHeaderValue, returnValue: Boolean): Anon_ProductHeaderValue = {
    val __obj = js.Dynamic.literal(productHeaderValue = productHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ProductHeaderValue]
  }
}

