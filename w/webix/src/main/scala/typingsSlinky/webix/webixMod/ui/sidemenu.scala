package typingsSlinky.webix.webixMod.ui

import typingsSlinky.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.sidemenu")
@js.native
class sidemenu ()
  extends typingsSlinky.webix.webix.ui.baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("$skin")
  var $skin_Original_sidemenu: WebixCallback = js.native
  @JSName("config")
  var config_sidemenu: sidemenuConfig = js.native
  def attachEvent(`type`: sidemenuEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: sidemenuEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def detachEvent(id: String): Unit = js.native
  def getBody(): js.Any = js.native
  def getHead(): js.Any = js.native
  def hasEvent(name: String): Boolean = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def resizeChildren(): Unit = js.native
  def setPosition(x: Double, y: Double): Unit = js.native
  def unblockEvent(): Unit = js.native
}

