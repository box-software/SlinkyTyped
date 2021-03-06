package typingsSlinky.wonderDashFrp

import typingsSlinky.wonderDashFrp.distEs2015CoreStreamMod.Stream
import typingsSlinky.wonderDashFrp.distEs2015DisposableIDisposableMod.IDisposable
import typingsSlinky.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/AnonymousStream", JSImport.Namespace)
@js.native
object distEs2015StreamAnonymousStreamMod extends js.Object {
  @js.native
  class AnonymousStream protected () extends Stream {
    def this(subscribeFunc: js.Function) = this()
    def subscribe(observer: IObserver): IDisposable = js.native
    def subscribe(onNext: js.Function1[/* value */ js.Any, Unit]): IDisposable = js.native
    def subscribe(onNext: js.Function1[/* value */ js.Any, Unit], onError: js.Function1[/* e */ js.Any, Unit]): IDisposable = js.native
    def subscribe(
      onNext: js.Function1[/* value */ js.Any, Unit],
      onError: js.Function1[/* e */ js.Any, Unit],
      onComplete: js.Function0[Unit]
    ): IDisposable = js.native
  }
  
  /* static members */
  @js.native
  object AnonymousStream extends js.Object {
    def create(subscribeFunc: js.Function): AnonymousStream = js.native
  }
  
}

