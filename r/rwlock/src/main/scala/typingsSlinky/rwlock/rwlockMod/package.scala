package typingsSlinky.rwlock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rwlockMod {
  type AsyncCallback = js.Function2[/* err */ js.Error, /* release */ Release, Unit]
  type Callback = js.Function1[/* release */ Release, Unit]
  type Release = js.Function0[Unit]
}
