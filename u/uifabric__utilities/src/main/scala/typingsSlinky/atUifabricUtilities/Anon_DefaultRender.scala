package typingsSlinky.atUifabricUtilities

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultRender[T] extends js.Object {
  var defaultRender: js.UndefOr[ReactComponentClass[T]] = js.undefined
}

object Anon_DefaultRender {
  @scala.inline
  def apply[T](defaultRender: ReactComponentClass[T] = null): Anon_DefaultRender[T] = {
    val __obj = js.Dynamic.literal()
    if (defaultRender != null) __obj.updateDynamic("defaultRender")(defaultRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultRender[T]]
  }
}

