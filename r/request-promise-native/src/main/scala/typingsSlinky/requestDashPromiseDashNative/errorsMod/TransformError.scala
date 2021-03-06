package typingsSlinky.requestDashPromiseDashNative.errorsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.FullResponse
import typingsSlinky.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.Options
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformError extends Error {
  var cause: js.Any
  var error: js.Any
  var options: Options
  var response: FullResponse
}

@JSImport("request-promise-native/errors", "TransformError")
@js.native
object TransformError extends TopLevel[TransformErrorConstructor]

