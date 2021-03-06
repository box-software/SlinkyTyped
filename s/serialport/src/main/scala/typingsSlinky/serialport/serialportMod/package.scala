package typingsSlinky.serialport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serialportMod {
  import typingsSlinky.serialport.Anon_Cts

  // Callbacks Type Defs
  type ErrorCallback = js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  type ListCallback = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* ports */ js.Array[js.Any], Unit]
  type ModemBitsCallback = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* status */ Anon_Cts, Unit]
  type darwinBinding = BaseBinding
  type linuxBinding = BaseBinding
  // Binding Type Defs
  type win32Binding = BaseBinding
}
