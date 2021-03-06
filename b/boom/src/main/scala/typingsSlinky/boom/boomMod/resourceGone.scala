package typingsSlinky.boom.boomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("boom", "resourceGone")
@js.native
object resourceGone extends js.Object {
  /**
    * Returns a 410 Gone error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomresourcegonemessage-data}
    */
  def apply[Data](): Boom[Data] = js.native
  def apply[Data](message: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data): Boom[Data] = js.native
}

