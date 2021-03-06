package typingsSlinky.ionic.definitionsMod

import typingsSlinky.atIonicUtilsDashSubprocess.atIonicUtilsDashSubprocessMod.Subprocess
import typingsSlinky.atIonicUtilsDashSubprocess.atIonicUtilsDashSubprocessMod.SubprocessOptions
import typingsSlinky.atIonicUtilsDashSubprocess.atIonicUtilsDashSubprocessMod.WhichOptions
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShell extends js.Object {
  def alterPath(path: String): String = js.native
  def cmdinfo(cmd: String): js.Promise[js.UndefOr[String]] = js.native
  def cmdinfo(cmd: String, args: js.Array[String]): js.Promise[js.UndefOr[String]] = js.native
  def cmdinfo(cmd: String, args: js.Array[String], options: SubprocessOptions): js.Promise[js.UndefOr[String]] = js.native
  def createSubprocess(command: String, args: js.Array[String]): js.Promise[Subprocess] = js.native
  def createSubprocess(command: String, args: js.Array[String], options: SubprocessOptions): js.Promise[Subprocess] = js.native
  def output(command: String, args: js.Array[String], options: IShellOutputOptions): js.Promise[String] = js.native
  def run(command: String, args: js.Array[String], options: IShellRunOptions): js.Promise[Unit] = js.native
  def spawn(command: String, args: js.Array[String], options: IShellSpawnOptions): js.Promise[ChildProcess] = js.native
  def which(command: String): js.Promise[String] = js.native
  def which(command: String, options: WhichOptions): js.Promise[String] = js.native
}

