package typingsSlinky.broDashFs.broDashFsMod

import typingsSlinky.broDashFs.Anon_Create
import typingsSlinky.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "rename")
@js.native
object rename extends js.Object {
  def apply(oldPath: String, newPath: String): js.Promise[FileEntry] = js.native
  def apply(oldPath: String, newPath: String, options: Anon_Create): js.Promise[FileEntry] = js.native
  def apply(oldPath: FileEntry, newPath: String): js.Promise[FileEntry] = js.native
  def apply(oldPath: FileEntry, newPath: String, options: Anon_Create): js.Promise[FileEntry] = js.native
}

