package typingsSlinky.maliDashCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mali-compose", JSImport.Namespace)
@js.native
object maliDashComposeMod extends js.Object {
  def apply[T](middleware: js.Array[Middleware[T]]): ComposedMiddleware[T] = js.native
  type ComposedMiddleware[T] = js.Function2[
    /* context */ T, 
    /* next */ js.UndefOr[js.Function0[js.Promise[js.Any]]], 
    js.Promise[Unit]
  ]
  type Middleware[T] = js.Function2[/* context */ T, /* next */ js.Function0[js.Promise[js.Any]], js.Any]
}

