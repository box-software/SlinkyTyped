package typingsSlinky.atGrpcGrpcDashJs

import org.scalajs.dom.raw.Console
import typingsSlinky.atGrpcGrpcDashJs.buildSrcConstantsMod.LogVerbosity
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/logging", JSImport.Namespace)
@js.native
object buildSrcLoggingMod extends js.Object {
  def getLogger(): Partial[Console] = js.native
  def log(severity: LogVerbosity, args: js.Any*): Unit = js.native
  def setLogger(logger: Partial[Console]): Unit = js.native
  def setLoggerVerbosity(verbosity: LogVerbosity): Unit = js.native
  def trace(severity: LogVerbosity, tracer: String, text: String): Unit = js.native
}

