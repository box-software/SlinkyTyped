package typingsSlinky.streamDashMock

import typingsSlinky.node.streamMod.Readable
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/readable/IReadableMock", JSImport.Namespace)
@js.native
object libReadableIReadableMockMod extends js.Object {
  @js.native
  trait IReadableMock extends Readable {
    var it: IterableIterator[_] = js.native
  }
  
}

