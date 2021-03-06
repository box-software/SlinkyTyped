package typingsSlinky.phonegap

import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileEntry extends FileSystemEntry {
  def copyTo(
    parentEntry: DirectoryEntry,
    file: String,
    onSuccess: js.Function1[/* arg */ DirectoryEntry, Unit],
    onError: js.Function1[/* arg */ FileError, Unit]
  ): Unit = js.native
  def createWriter(): Unit = js.native
  def createWriter(onSuccess: js.Function1[/* arg */ FileWriter, Unit]): Unit = js.native
  def createWriter(
    onSuccess: js.Function1[/* arg */ FileWriter, Unit],
    onError: js.Function1[/* arg */ FileError, Unit]
  ): Unit = js.native
  def file(): Unit = js.native
  def file(onSuccess: js.Function1[/* arg */ File, Unit]): Unit = js.native
  def file(onSuccess: js.Function1[/* arg */ File, Unit], onError: js.Function1[/* arg */ FileError, Unit]): Unit = js.native
  def moveTo(
    parentEntry: DirectoryEntry,
    file: String,
    onSuccess: js.Function1[/* arg */ DirectoryEntry, Unit],
    onError: js.Function1[/* arg */ FileError, Unit]
  ): Unit = js.native
}

