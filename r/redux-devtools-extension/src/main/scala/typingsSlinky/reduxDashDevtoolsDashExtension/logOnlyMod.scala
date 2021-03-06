package typingsSlinky.reduxDashDevtoolsDashExtension

import typingsSlinky.redux.reduxMod.StoreEnhancer
import typingsSlinky.reduxDashDevtoolsDashExtension.reduxDashDevtoolsDashExtensionMod.EnhancerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-devtools-extension/logOnly", JSImport.Namespace)
@js.native
object logOnlyMod extends js.Object {
  def composeWithDevTools(options: EnhancerOptions): Fn_A = js.native
  def composeWithDevTools[StoreExt, StateExt](funcs: (StoreEnhancer[StoreExt, js.Object])*): StoreEnhancer[StoreExt, js.Object] = js.native
  def devToolsEnhancer(options: EnhancerOptions): StoreEnhancer[_, js.Object] = js.native
}

