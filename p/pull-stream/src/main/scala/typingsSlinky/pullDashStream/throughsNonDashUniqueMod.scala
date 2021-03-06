package typingsSlinky.pullDashStream

import typingsSlinky.pullDashStream.pullDashStreamMod.Through
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/non-unique", JSImport.Namespace)
@js.native
object throughsNonDashUniqueMod extends js.Object {
  /**
    * Filter unique items -- get the duplicates. The inverse of `unique`.
    */
  def apply[InOut](): Through[InOut, InOut] = js.native
  def apply[InOut](prop: String): Through[InOut, InOut] = js.native
  def apply[InOut](prop: js.Function1[/* data */ InOut, _]): Through[InOut, InOut] = js.native
}

