package typingsSlinky.enhancedDashResolve

import typingsSlinky.enhancedDashResolve.libCommonDashTypesMod.LoggingCallbackWrapper
import typingsSlinky.enhancedDashResolve.libCommonDashTypesMod.ResolveContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Callback extends js.Object {
  def apply(context: ResolveContext, path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  def apply(path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
}

