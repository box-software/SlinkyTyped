package typingsSlinky.workboxDashWindow

import org.scalajs.dom.experimental.serviceworkers.ServiceWorker
import typingsSlinky.std.RegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-window", JSImport.Namespace)
@js.native
object workboxDashWindowMod extends js.Object {
  @js.native
  class Workbox protected ()
    extends typingsSlinky.workboxDashWindow.workboxMod.Workbox {
    def this(scriptURL: String) = this()
    def this(scriptURL: String, registerOptions: RegistrationOptions) = this()
  }
  
  def messageSW(sw: ServiceWorker, data: js.Any): js.Promise[_] = js.native
}

