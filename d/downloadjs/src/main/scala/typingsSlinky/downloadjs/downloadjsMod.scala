package typingsSlinky.downloadjs

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.std.Blob
import typingsSlinky.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("downloadjs", JSImport.Namespace)
@js.native
object downloadjsMod extends js.Object {
  def apply(data: String): XMLHttpRequest | Boolean = js.native
  def apply(data: String, filename: String): XMLHttpRequest | Boolean = js.native
  def apply(data: String, filename: String, mimeType: String): XMLHttpRequest | Boolean = js.native
  def apply(data: Blob): XMLHttpRequest | Boolean = js.native
  def apply(data: Blob, filename: String): XMLHttpRequest | Boolean = js.native
  def apply(data: Blob, filename: String, mimeType: String): XMLHttpRequest | Boolean = js.native
  def apply(data: File): XMLHttpRequest | Boolean = js.native
  def apply(data: File, filename: String): XMLHttpRequest | Boolean = js.native
  def apply(data: File, filename: String, mimeType: String): XMLHttpRequest | Boolean = js.native
}

