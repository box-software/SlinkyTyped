package typingsSlinky.aureliaDashKnockout

import typingsSlinky.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  var container: Container
  def globalResources(resources: String*): js.Any
}

object Anon_Container {
  @scala.inline
  def apply(container: Container, globalResources: /* repeated */ String => js.Any): Anon_Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], globalResources = js.Any.fromFunction1(globalResources))
  
    __obj.asInstanceOf[Anon_Container]
  }
}

