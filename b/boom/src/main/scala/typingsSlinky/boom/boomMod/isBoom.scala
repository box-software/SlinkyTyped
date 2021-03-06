package typingsSlinky.boom.boomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("boom", "isBoom")
@js.native
object isBoom extends js.Object {
  /**
    * Identifies whether an error is a Boom object. Same as calling instanceof Boom.
    * @param error the error object to identify.
    */
  def apply(error: js.Error): /* is boom.boom.Boom<any> */ Boolean = js.native
}

