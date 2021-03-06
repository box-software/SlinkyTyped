package typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperStrings.download
import typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperStrings.end
import typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperStrings.error
import typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperStrings.pause
import typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperStrings.progress
import typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperStrings.resume
import typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperStrings.start
import typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperStrings.stateChanged
import typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-downloader-helper", "DownloaderHelper")
@js.native
class DownloaderHelper protected () extends EventEmitter {
  def this(url: String, destFolder: String) = this()
  def this(url: String, destFolder: String, options: Options) = this()
  def on(event: String, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_download(event: download, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_pause(event: pause, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_progress(event: progress, callback: js.Function1[/* stats */ Stats, Unit]): this.type = js.native
  @JSName("on")
  def on_resume(event: resume, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_start(event: start, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_stateChanged(event: stateChanged, callback: js.Function1[/* state */ DH_STATES, Unit]): this.type = js.native
  @JSName("on")
  def on_stop(event: stop, callback: js.Function0[Unit]): this.type = js.native
  def pause(): js.Promise[Boolean] = js.native
  def resume(): js.Promise[Boolean] = js.native
  def start(): js.Promise[Boolean] = js.native
  def stop(): js.Promise[Boolean] = js.native
}

