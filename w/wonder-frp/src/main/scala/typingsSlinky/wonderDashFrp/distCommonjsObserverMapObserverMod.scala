package typingsSlinky.wonderDashFrp

import typingsSlinky.wonderDashFrp.distCommonjsCoreObserverMod.Observer
import typingsSlinky.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/MapObserver", JSImport.Namespace)
@js.native
object distCommonjsObserverMapObserverMod extends js.Object {
  @js.native
  class MapObserver protected () extends Observer {
    def this(currentObserver: IObserver, selector: js.Function) = this()
    var _currentObserver: js.Any = js.native
    var _selector: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object MapObserver extends js.Object {
    def create(currentObserver: IObserver, selector: js.Function): MapObserver = js.native
  }
  
}

