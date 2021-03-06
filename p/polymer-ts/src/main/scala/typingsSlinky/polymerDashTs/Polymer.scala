package typingsSlinky.polymerDashTs

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.polymerDashTs.polymer.Base
import typingsSlinky.polymerDashTs.polymer.Element
import typingsSlinky.polymerDashTs.polymer.dom
import typingsSlinky.std.FunctionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Polymer")
@js.native
object Polymer extends js.Object {
  var Base: js.Any = js.native
  @JSName("dom")
  var dom_Original: dom = js.native
  def apply(prototype: Element): FunctionConstructor = js.native
  def Class(prototype: Element): js.Function = js.native
  def appendChild(node: HTMLElement): HTMLElement = js.native
  def dom(node: Base): HTMLElement = js.native
  def dom(node: typingsSlinky.std.HTMLElement): HTMLElement = js.native
  def insertBefore(node: HTMLElement, beforeNode: HTMLElement): HTMLElement = js.native
  def removeChild(node: HTMLElement): HTMLElement = js.native
  def updateStyles(): Unit = js.native
}

