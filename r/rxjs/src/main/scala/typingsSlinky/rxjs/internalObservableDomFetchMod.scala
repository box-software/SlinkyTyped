package typingsSlinky.rxjs

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/dom/fetch", JSImport.Namespace)
@js.native
object internalObservableDomFetchMod extends js.Object {
  def fromFetch(input: String): Observable[Response] = js.native
  def fromFetch(input: String, init: RequestInit): Observable[Response] = js.native
  def fromFetch(input: Request): Observable[Response] = js.native
  def fromFetch(input: Request, init: RequestInit): Observable[Response] = js.native
}

