package typingsSlinky.prosemirrorDashTables.prosemirrorDashTablesMod

import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "deleteTable")
@js.native
object deleteTable extends js.Object {
  def apply[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def apply[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
}

