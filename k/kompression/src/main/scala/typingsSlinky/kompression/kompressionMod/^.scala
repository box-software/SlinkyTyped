package typingsSlinky.kompression.kompressionMod

import typingsSlinky.koa.koaMod.DefaultContext
import typingsSlinky.koa.koaMod.DefaultState
import typingsSlinky.koa.koaMod.Middleware
import typingsSlinky.kompression.kompressionMod.Kompression.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kompression", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = js.native
}

