package typingsSlinky.fluxxor.fluxxorMod

import typingsSlinky.eventemitter3.eventemitter3Mod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxxor", "Flux")
@js.native
class Flux protected ()
  extends EventEmitter[String | js.Symbol] {
  def this(stores: js.Any, actions: js.Any) = this()
  var actions: js.Any = js.native
  var stores: js.Any = js.native
  def addAction(args: (String | js.Function)*): Unit = js.native
  def addAction(names: js.Array[String], action: js.Function): Unit = js.native
  def addActions(actions: js.Any): Unit = js.native
  def addStore(name: String, store: Store): Unit = js.native
  def addStores(stores: js.Any): Unit = js.native
  def store(name: String): js.Any = js.native
}

