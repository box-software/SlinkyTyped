package typingsSlinky.atJestTypes.buildCircusMod

import typingsSlinky.atJestTypes.Anon_Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  var duration: js.UndefOr[Double | Null] = js.undefined
  var errors: js.Array[FormattedError]
  var invocations: Double
  var location: js.UndefOr[Anon_Column | Null] = js.undefined
  var status: TestStatus
  var testPath: js.Array[TestName | BlockName]
}

object TestResult {
  @scala.inline
  def apply(
    errors: js.Array[FormattedError],
    invocations: Double,
    status: TestStatus,
    testPath: js.Array[TestName | BlockName],
    duration: Int | Double = null,
    location: Anon_Column = null
  ): TestResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], invocations = invocations.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
}

