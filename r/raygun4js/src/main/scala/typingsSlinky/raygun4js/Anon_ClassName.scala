package typingsSlinky.raygun4js

import typingsSlinky.raygun4js.raygun4jsMod.RaygunStackTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var ClassName: String
  var Message: String
  var StackTrace: js.Array[RaygunStackTrace]
}

object Anon_ClassName {
  @scala.inline
  def apply(ClassName: String, Message: String, StackTrace: js.Array[RaygunStackTrace]): Anon_ClassName = {
    val __obj = js.Dynamic.literal(ClassName = ClassName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], StackTrace = StackTrace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClassName]
  }
}

