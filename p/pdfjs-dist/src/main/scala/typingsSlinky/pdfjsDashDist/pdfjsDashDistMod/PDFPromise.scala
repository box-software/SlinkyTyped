package typingsSlinky.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFPromise[T] extends js.Object {
  def isRejected(): Boolean = js.native
  def isResolved(): Boolean = js.native
  def reject(reason: String): Unit = js.native
  def resolve(value: T): Unit = js.native
  def `then`[U](onResolve: js.Function1[/* promise */ T, U]): PDFPromise[U] = js.native
  def `then`[U](onResolve: js.Function1[/* promise */ T, U], onReject: js.Function1[/* reason */ String, Unit]): PDFPromise[U] = js.native
}

