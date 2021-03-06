package typingsSlinky.atIonicUtilsDashFs.atIonicUtilsDashFsMod

import typingsSlinky.node.Anon_BufferEncoding
import typingsSlinky.node.Anon_EncodingBufferEncoding
import typingsSlinky.node.Anon_EncodingNull
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "mkdtempSync")
@js.native
object mkdtempSync extends js.Object {
  /**
    * Synchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(prefix: String): String | Buffer = js.native
  def apply(prefix: String, options: String): String | Buffer = js.native
  /**
    * Synchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(prefix: String, options: Anon_BufferEncoding): Buffer = js.native
  def apply(prefix: String, options: Anon_EncodingBufferEncoding): String = js.native
  def apply(prefix: String, options: Anon_EncodingNull): String | Buffer = js.native
  def apply(prefix: String, options: BufferEncoding): String = js.native
}

