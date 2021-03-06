package typingsSlinky.browserfs.distNodeBackendXmlHttpRequestMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.browserfs.distNodeCoreFileMod.File
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreFlagMod.FileFlag
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSOneArgCallback
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.BaseFileSystem
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlHttpRequest
  extends BaseFileSystem
     with FileSystem {
  var _index: js.Any = js.native
  val prefixUrl: String = js.native
  /**
    * Asynchronously download the given file.
    */
  /* private */ def _requestFileAsync(p: js.Any, `type`: js.Any, cb: js.Any): js.Any = js.native
  /**
    * Only requests the HEAD content, for the file size.
    */
  /* private */ def _requestFileSizeAsync(path: js.Any, cb: js.Any): js.Any = js.native
  /* private */ def _requestFileSizeSync(path: js.Any): js.Any = js.native
  /**
    * Synchronously download the given file.
    */
  /* private */ def _requestFileSync(p: js.Any, `type`: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def chmod(p: String, isLchmod: Boolean, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def chmodSync(p: String, isLchmod: Boolean, mode: Double): Unit = js.native
  /* InferMemberOverrides */
  override def chown(p: String, isLchown: Boolean, uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def chownSync(p: String, isLchown: Boolean, uid: Double, gid: Double): Unit = js.native
  /* InferMemberOverrides */
  override def diskSpace(p: String, cb: js.Function2[/* total */ Double, /* free */ Double, _]): Unit = js.native
  def empty(): Unit = js.native
  /* InferMemberOverrides */
  override def exists(p: String, cb: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  /* InferMemberOverrides */
  override def existsSync(p: String): Boolean = js.native
  /* private */ def getXhrPath(filePath: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def link(srcpath: String, dstpath: String, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def linkSync(srcpath: String, dstpath: String): Unit = js.native
  /* InferMemberOverrides */
  override def mkdir(p: String, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def mkdirSync(p: String, mode: Double): Unit = js.native
  /* InferMemberOverrides */
  override def open(p: String, flag: FileFlag, mode: Double, cb: BFSCallback[File]): Unit = js.native
  /* InferMemberOverrides */
  override def openSync(p: String, flag: FileFlag, mode: Double): File = js.native
  /**
    * Special XHR function: Preload the given file into the index.
    * @param [String] path
    * @param [BrowserFS.Buffer] buffer
    */
  def preloadFile(path: String, buffer: Buffer): Unit = js.native
  /* InferMemberOverrides */
  override def readFile(fname: String, encoding: String, flag: FileFlag, cb: BFSCallback[String | Buffer]): Unit = js.native
  /* InferMemberOverrides */
  override def readFile(fname: String, encoding: Null, flag: FileFlag, cb: BFSCallback[String | Buffer]): Unit = js.native
  /* InferMemberOverrides */
  override def readFileSync(fname: String, encoding: String, flag: FileFlag): js.Any = js.native
  /* InferMemberOverrides */
  override def readFileSync(fname: String, encoding: Null, flag: FileFlag): js.Any = js.native
  /* InferMemberOverrides */
  override def readdir(p: String, cb: BFSCallback[js.Array[String]]): Unit = js.native
  /* InferMemberOverrides */
  override def readdirSync(p: String): js.Array[String] = js.native
  /* InferMemberOverrides */
  override def readlinkSync(p: String): String = js.native
  /* InferMemberOverrides */
  override def realpath(p: String, cache: StringDictionary[String], cb: BFSCallback[String]): Unit = js.native
  /* InferMemberOverrides */
  override def realpathSync(p: String, cache: StringDictionary[String]): String = js.native
  /* InferMemberOverrides */
  override def rename(oldPath: String, newPath: String, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def renameSync(oldPath: String, newPath: String): Unit = js.native
  /* InferMemberOverrides */
  override def rmdir(p: String, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def rmdirSync(p: String): Unit = js.native
  /* InferMemberOverrides */
  override def stat(
    p: String,
    isLstat: Boolean,
    cb: BFSCallback[typingsSlinky.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default]
  ): Unit = js.native
  /* InferMemberOverrides */
  override def stat(
    p: String,
    isLstat: Null,
    cb: BFSCallback[typingsSlinky.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default]
  ): Unit = js.native
  /* InferMemberOverrides */
  override def statSync(p: String): typingsSlinky.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default = js.native
  /* InferMemberOverrides */
  override def statSync(p: String, isLstat: Boolean): typingsSlinky.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default = js.native
  /* InferMemberOverrides */
  override def supportsLinks(): Boolean = js.native
  /* InferMemberOverrides */
  override def symlink(srcpath: String, dstpath: String, `type`: String, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def symlinkSync(srcpath: String, dstpath: String, `type`: String): Unit = js.native
  /* InferMemberOverrides */
  override def truncate(p: String, len: Double, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def truncateSync(p: String, len: Double): Unit = js.native
  /* InferMemberOverrides */
  override def unlink(p: String, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def unlinkSync(p: String): Unit = js.native
  /* InferMemberOverrides */
  override def utimes(p: String, atime: js.Date, mtime: js.Date, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def utimesSync(p: String, atime: js.Date, mtime: js.Date): Unit = js.native
  /* InferMemberOverrides */
  override def writeFile(fname: String, data: js.Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  /* InferMemberOverrides */
  override def writeFile(fname: String, data: js.Any, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
}

