package typingsSlinky.urllib.urllibMod

import typingsSlinky.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urllib", "request")
@js.native
object request extends js.Object {
  def apply[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: String, callback: Callback[T]): Unit = js.native
  def apply[T](url: String, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: String, options: RequestOptions, callback: Callback[T]): Unit = js.native
  def apply[T](url: URL): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: URL, callback: Callback[T]): Unit = js.native
  def apply[T](url: URL, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: URL, options: RequestOptions, callback: Callback[T]): Unit = js.native
}

