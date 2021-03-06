package typingsSlinky.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.running
  - typings.fridaDashGum.fridaDashGumStrings.stopped
  - typings.fridaDashGum.fridaDashGumStrings.waiting
  - typings.fridaDashGum.fridaDashGumStrings.uninterruptible
  - typings.fridaDashGum.fridaDashGumStrings.halted
*/
trait ThreadState extends js.Object

object ThreadState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def halted: typingsSlinky.fridaDashGum.fridaDashGumStrings.halted = this.cast("halted")
  @scala.inline
  def running: typingsSlinky.fridaDashGum.fridaDashGumStrings.running = this.cast("running")
  @scala.inline
  def stopped: typingsSlinky.fridaDashGum.fridaDashGumStrings.stopped = this.cast("stopped")
  @scala.inline
  def uninterruptible: typingsSlinky.fridaDashGum.fridaDashGumStrings.uninterruptible = this.cast("uninterruptible")
  @scala.inline
  def waiting: typingsSlinky.fridaDashGum.fridaDashGumStrings.waiting = this.cast("waiting")
}

