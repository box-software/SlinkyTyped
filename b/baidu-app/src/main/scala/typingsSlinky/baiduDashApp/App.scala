package typingsSlinky.baiduDashApp

import typingsSlinky.baiduDashApp.swan.AppOptions
import typingsSlinky.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("App")
@js.native
object App extends js.Object {
  /**
    * App() 函数用来注册一个小程序。
    * 接受一个 object 参数，其指定小程序的生命周期函数等。
    */
  def apply[T /* <: AppOptions */](app: T with (ThisType[T with typingsSlinky.baiduDashApp.swan.App])): Unit = js.native
}

