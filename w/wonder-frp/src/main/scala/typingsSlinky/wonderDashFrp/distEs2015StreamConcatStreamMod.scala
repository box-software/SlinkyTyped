package typingsSlinky.wonderDashFrp

import typingsSlinky.wonderDashFrp.distEs2015CoreStreamMod.Stream
import typingsSlinky.wonderDashFrp.distEs2015StreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/ConcatStream", JSImport.Namespace)
@js.native
object distEs2015StreamConcatStreamMod extends js.Object {
  @js.native
  class ConcatStream protected () extends BaseStream {
    def this(sources: js.Array[Stream]) = this()
    var _sources: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ConcatStream extends js.Object {
    def create(sources: js.Array[Stream]): ConcatStream = js.native
  }
  
}

