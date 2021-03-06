package typingsSlinky.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registration[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def registerResolver(
    container: Container,
    key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs],
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]
  ): Resolver
}

object Registration {
  @scala.inline
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    registerResolver: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], DependencyCtorOrFunctor[TBase, TImpl, TArgs]) => Resolver
  ): Registration[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(registerResolver = js.Any.fromFunction3(registerResolver))
  
    __obj.asInstanceOf[Registration[TBase, TImpl, TArgs]]
  }
}

@JSImport("aurelia-dependency-injection", "registration")
@js.native
object registration extends js.Object {
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](value: Registration[TBase, TImpl, TArgs]): js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit] = js.native
}

