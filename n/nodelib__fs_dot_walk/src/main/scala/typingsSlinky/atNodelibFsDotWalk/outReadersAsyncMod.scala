package typingsSlinky.atNodelibFsDotWalk

import typingsSlinky.atNodelibFsDotWalk.outTypesMod.Entry
import typingsSlinky.atNodelibFsDotWalk.outTypesMod.Errno
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.walk/out/readers/async", JSImport.Namespace)
@js.native
object outReadersAsyncMod extends js.Object {
  @js.native
  trait AsyncReader
    extends typingsSlinky.atNodelibFsDotWalk.outReadersReaderMod.default {
    var _emitEntry: js.Any = js.native
    val _emitter: EventEmitter = js.native
    var _handleEntry: js.Any = js.native
    var _handleError: js.Any = js.native
    var _isDestroyed: js.Any = js.native
    var _isFatalError: js.Any = js.native
    var _pushToQueue: js.Any = js.native
    val _queue: js.Any = js.native
    val _scandir: Typeofscandir = js.native
    var _worker: js.Any = js.native
    def destroy(): Unit = js.native
    def onEnd(callback: EndEventCallback): Unit = js.native
    def onEntry(callback: EntryEventCallback): Unit = js.native
    def onError(callback: ErrorEventCallback): Unit = js.native
    def read(): EventEmitter = js.native
  }
  
  @js.native
  class default protected () extends AsyncReader {
    def this(_root: String, _settings: typingsSlinky.atNodelibFsDotWalk.outSettingsMod.default) = this()
  }
  
  type EndEventCallback = js.Function0[Unit]
  type EntryEventCallback = js.Function1[/* entry */ Entry, Unit]
  type ErrorEventCallback = js.Function1[/* error */ Errno, Unit]
}

