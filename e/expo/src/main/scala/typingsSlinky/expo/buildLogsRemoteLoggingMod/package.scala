package typingsSlinky.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildLogsRemoteLoggingMod {
  import typingsSlinky.expo.Anon_ErrorResponse

  type LogData = String | LogErrorData
  type TransportErrorListener = js.Function1[/* event */ Anon_ErrorResponse, Unit]
}
