package typingsSlinky.qunit.QUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoneDetails extends js.Object {
  var failed: Double
  var passed: Double
  var runtime: Double
  var total: Double
}

object DoneDetails {
  @scala.inline
  def apply(failed: Double, passed: Double, runtime: Double, total: Double): DoneDetails = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DoneDetails]
  }
}

