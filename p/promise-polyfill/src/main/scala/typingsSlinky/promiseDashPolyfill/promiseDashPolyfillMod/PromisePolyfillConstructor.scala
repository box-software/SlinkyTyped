package typingsSlinky.promiseDashPolyfill.promiseDashPolyfillMod

import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisePolyfillConstructor extends PromiseConstructor {
  var _immediateFn: js.UndefOr[js.Function1[/* handler */ js.Function0[Unit] | String, Unit]] = js.native
}

