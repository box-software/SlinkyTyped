package typingsSlinky.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalTypesMod {
  import typingsSlinky.rxjs.internalObservableMod.Observable
  import typingsSlinky.std.ArrayLike

  type FactoryOrValue[T] = T | js.Function0[T]
  type MonoTypeOperatorFunction[T] = OperatorFunction[T, T]
  type ObservableInput[T] = SubscribableOrPromise[T] | ArrayLike[T] | js.Iterable[T]
  type ObservableLike[T] = InteropObservable[T]
  type ObservedValueOf[O] = js.Any
  type ObservedValuesFromArray[X] = js.Any
  type OperatorFunction[T, R] = UnaryFunction[Observable[T], Observable[R]]
  type SubscribableOrPromise[T] = (Subscribable[scala.Nothing | T]) | js.Thenable[T] | InteropObservable[T]
  type TeardownLogic = Unsubscribable | js.Function | Unit
  type UnaryFunction[T, R] = js.Function1[/* source */ T, R]
}
