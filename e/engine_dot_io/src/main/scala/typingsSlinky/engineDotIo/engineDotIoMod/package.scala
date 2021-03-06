package typingsSlinky.engineDotIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object engineDotIoMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.httpMod.IncomingMessage

  type AllowRequestFunction = js.Function2[
    /* req */ IncomingMessage, 
    /* fn */ js.Function2[/* err */ js.UndefOr[String | Null], /* success */ Boolean, Unit], 
    Unit
  ]
  type Message = String | Buffer | scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
}
