package typingsSlinky.atIonicCliDashFramework.libTasksMod

import typingsSlinky.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.clear
import typingsSlinky.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.end
import typingsSlinky.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.failure
import typingsSlinky.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.success
import typingsSlinky.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.tick
import typingsSlinky.node.NodeJS.Timer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/tasks", "Task")
@js.native
class Task () extends EventEmitter {
  def this(hasMsgTickInterval: TaskOptions) = this()
  var _msg: String = js.native
  var intervalId: js.UndefOr[Timer] = js.native
  var progressRatio: js.UndefOr[Double] = js.native
  var running: Boolean = js.native
  var tickInterval: js.UndefOr[Double] = js.native
  def clear(): this.type = js.native
  @JSName("emit")
  def emit_clear(name: clear): Boolean = js.native
  @JSName("emit")
  def emit_end(name: end): Boolean = js.native
  @JSName("emit")
  def emit_failure(name: failure): Boolean = js.native
  @JSName("emit")
  def emit_success(name: success): Boolean = js.native
  @JSName("emit")
  def emit_tick(name: tick): Boolean = js.native
  def end(): this.type = js.native
  def fail(): this.type = js.native
  def msg(): String = js.native
  def msg(msg: String): js.Any = js.native
  @JSName("on")
  def on_clear(name: clear, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_end(name: end, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_failure(name: failure, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_success(name: success, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_tick(name: tick, handler: js.Function0[Unit]): this.type = js.native
  def progress(prog: Double, total: Double): this.type = js.native
  def start(): this.type = js.native
  def succeed(): this.type = js.native
  def tick(): this.type = js.native
}

