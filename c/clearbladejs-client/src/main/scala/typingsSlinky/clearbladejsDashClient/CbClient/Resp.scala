package typingsSlinky.clearbladejsDashClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resp extends js.Object {
  def error(msg: js.Any): scala.Nothing
   // todo: figure out if we can have the compiler throw an error if someone adds code after this
  def success(msg: js.Any): scala.Nothing
}

object Resp {
  @scala.inline
  def apply(error: js.Any => scala.Nothing, success: js.Any => scala.Nothing): Resp = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Resp]
  }
}

