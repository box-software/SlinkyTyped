package typingsSlinky.pumpify.pumpifyMod

import typingsSlinky.duplexify.duplexifyMod.Duplexify
import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pumpify extends Duplexify {
  def setPipeline(streams: Stream*): Unit = js.native
  def setPipeline(streams: js.Array[Stream]): Unit = js.native
}

