package typingsSlinky.atIonicUtilsDashFs.atIonicUtilsDashFsMod

import typingsSlinky.node.Anon_BufferEncodingFalse
import typingsSlinky.node.Anon_EncodingFalse
import typingsSlinky.node.Anon_EncodingFalseWithFileTypes
import typingsSlinky.node.Anon_EncodingTrue
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "readdirSync")
@js.native
object readdirSync extends js.Object {
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike): js.Array[String] = js.native
  def apply(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike, options: Anon_BufferEncodingFalse): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: Anon_EncodingFalse): js.Array[String] = js.native
  def apply(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Array[Buffer | String] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  def apply(path: PathLike, options: Anon_EncodingTrue): js.Array[typingsSlinky.node.fsMod.Dirent] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
}

