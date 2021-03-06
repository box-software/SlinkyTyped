package typingsSlinky.mobx.libApiWhenMod

import typingsSlinky.mobx.Anon_Cancel
import typingsSlinky.mobx.libCoreReactionMod.IReactionDisposer
import typingsSlinky.mobx.libUtilsUtilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/when", "when")
@js.native
object when extends js.Object {
  def apply(predicate: js.Function0[Boolean]): js.Promise[Unit] with Anon_Cancel = js.native
  def apply(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = js.native
  def apply(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = js.native
  def apply(predicate: js.Function0[Boolean], opts: IWhenOptions): js.Promise[Unit] with Anon_Cancel = js.native
}

