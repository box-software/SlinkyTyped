package typingsSlinky.amazonDashConnectDashStreams.connect

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Core extends js.Object {
  def initCCP(containerDiv: HTMLElement, options: InitCCPOptions): Unit
}

object Core {
  @scala.inline
  def apply(initCCP: (HTMLElement, InitCCPOptions) => Unit): Core = {
    val __obj = js.Dynamic.literal(initCCP = js.Any.fromFunction2(initCCP))
  
    __obj.asInstanceOf[Core]
  }
}

@JSGlobal("connect.core")
@js.native
object core extends TopLevel[Core]

