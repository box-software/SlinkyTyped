package typingsSlinky.archiver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProcessedBytes extends js.Object {
  var processedBytes: Double
  var totalBytes: Double
}

object Anon_ProcessedBytes {
  @scala.inline
  def apply(processedBytes: Double, totalBytes: Double): Anon_ProcessedBytes = {
    val __obj = js.Dynamic.literal(processedBytes = processedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ProcessedBytes]
  }
}

