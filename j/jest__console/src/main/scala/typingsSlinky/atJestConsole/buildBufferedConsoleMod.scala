package typingsSlinky.atJestConsole

import typingsSlinky.atJestConsole.buildTypesMod.ConsoleBuffer
import typingsSlinky.atJestConsole.buildTypesMod.LogEntry
import typingsSlinky.atJestConsole.buildTypesMod.LogMessage
import typingsSlinky.atJestConsole.buildTypesMod.LogType
import typingsSlinky.atJestSourceDashMap.buildTypesMod.SourceMapRegistry
import typingsSlinky.std.Console
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/console/build/BufferedConsole", JSImport.Namespace)
@js.native
object buildBufferedConsoleMod extends js.Object {
  @js.native
  trait BufferedConsole extends Console {
    var _buffer: js.Any = js.native
    var _counters: js.Any = js.native
    var _getSourceMaps: js.Any = js.native
    var _groupDepth: js.Any = js.native
    var _log: js.Any = js.native
    var _timers: js.Any = js.native
    def assert(value: js.Any): Unit = js.native
    def assert(value: js.Any, message: String): Unit = js.native
    def assert(value: js.Any, message: Error): Unit = js.native
    def countReset(): Unit = js.native
    def countReset(label: String): Unit = js.native
    def dirxml(firstArg: js.Any, rest: js.Any*): Unit = js.native
    def getBuffer(): js.UndefOr[js.Array[LogEntry]] = js.native
  }
  
  @js.native
  class default protected () extends BufferedConsole {
    def this(getSourceMaps: js.Function0[js.UndefOr[SourceMapRegistry | Null]]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage): js.Array[LogEntry] = js.native
    def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage, level: Double): js.Array[LogEntry] = js.native
    def write(
      buffer: ConsoleBuffer,
      `type`: LogType,
      message: LogMessage,
      level: Double,
      sourceMaps: SourceMapRegistry
    ): js.Array[LogEntry] = js.native
    def write(
      buffer: ConsoleBuffer,
      `type`: LogType,
      message: LogMessage,
      level: Null,
      sourceMaps: SourceMapRegistry
    ): js.Array[LogEntry] = js.native
  }
  
}

