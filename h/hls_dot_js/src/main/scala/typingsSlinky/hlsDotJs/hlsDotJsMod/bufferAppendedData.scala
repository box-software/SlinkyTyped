package typingsSlinky.hlsDotJs.hlsDotJsMod

import typingsSlinky.hlsDotJs.Anon_Audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bufferAppendedData extends js.Object {
  var pending: Double
  var timeRanges: Anon_Audio
}

object bufferAppendedData {
  @scala.inline
  def apply(pending: Double, timeRanges: Anon_Audio): bufferAppendedData = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], timeRanges = timeRanges.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[bufferAppendedData]
  }
}

