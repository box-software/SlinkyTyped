package typingsSlinky.cypress

import typingsSlinky.cypress.Cypress.ServerOptions
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Defaults extends js.Object {
  def defaults(options: Partial[ServerOptions]): Unit
}

object Anon_Defaults {
  @scala.inline
  def apply(defaults: Partial[ServerOptions] => Unit): Anon_Defaults = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
  
    __obj.asInstanceOf[Anon_Defaults]
  }
}

