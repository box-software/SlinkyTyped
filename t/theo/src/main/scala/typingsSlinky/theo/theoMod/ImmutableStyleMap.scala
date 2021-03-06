package typingsSlinky.theo.theoMod

import typingsSlinky.immutable.Immutable.Map
import typingsSlinky.theo.theoStrings.aliases
import typingsSlinky.theo.theoStrings.global
import typingsSlinky.theo.theoStrings.imports
import typingsSlinky.theo.theoStrings.meta
import typingsSlinky.theo.theoStrings.options
import typingsSlinky.theo.theoStrings.props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImmutableStyleMap
  extends Map[String, js.Any] {
  @JSName("get")
  def get_aliases(key: aliases): Aliases = js.native
  @JSName("get")
  def get_global(key: global): Props = js.native
  @JSName("get")
  def get_imports(key: imports): js.Array[String] = js.native
  @JSName("get")
  def get_meta(key: meta): Meta = js.native
  @JSName("get")
  def get_options(key: options): js.Object = js.native
  @JSName("get")
  def get_props(key: props): Props = js.native
}

