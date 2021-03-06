package typingsSlinky.atOracleOraclejet.ojarraytreedataproviderMod

import typingsSlinky.atOracleOraclejet.ojtreedataproviderMod.TreeDataProvider
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayTreeDataProvider[K, D] extends TreeDataProvider[K, D] {
  def addEventListener(eventType: String, listener: EventListener): Unit = js.native
  def getCapability(): js.Any = js.native
  def removeEventListener(eventType: String, listener: EventListener): Unit = js.native
}

