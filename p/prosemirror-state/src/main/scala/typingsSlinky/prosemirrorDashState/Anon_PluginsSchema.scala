package typingsSlinky.prosemirrorDashState

import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PluginsSchema[S /* <: Schema[_, _] */] extends js.Object {
  var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.undefined
  var schema: S
}

object Anon_PluginsSchema {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](schema: S, plugins: js.Array[Plugin[_, S]] = null): Anon_PluginsSchema[S] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PluginsSchema[S]]
  }
}

