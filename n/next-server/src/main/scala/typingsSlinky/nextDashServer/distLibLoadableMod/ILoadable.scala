package typingsSlinky.nextDashServer.distLibLoadableMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoadable extends js.Object {
  def apply[P](opts: js.Any): ReactComponentClass[P] = js.native
  def Map[P](opts: js.Any): ReactComponentClass[P] = js.native
  def preloadAll(): js.Promise[_] = js.native
}

