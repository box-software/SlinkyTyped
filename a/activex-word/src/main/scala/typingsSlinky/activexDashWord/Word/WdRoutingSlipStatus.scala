package typingsSlinky.activexDashWord.Word

import typingsSlinky.activexDashWord.activexDashWordNumbers.`0`
import typingsSlinky.activexDashWord.activexDashWordNumbers.`1`
import typingsSlinky.activexDashWord.activexDashWordNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashWord.activexDashWordNumbers.`0`
  - typings.activexDashWord.activexDashWordNumbers.`2`
  - typings.activexDashWord.activexDashWordNumbers.`1`
*/
trait WdRoutingSlipStatus extends js.Object

object WdRoutingSlipStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdNotYetRouted: `0` = this.cast(0)
  @scala.inline
  def wdRouteComplete: `2` = this.cast(2)
  @scala.inline
  def wdRouteInProgress: `1` = this.cast(1)
}

