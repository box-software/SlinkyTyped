package typingsSlinky.flight.Flight

import typingsSlinky.jquery.JQuery
import typingsSlinky.std.Element
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentStatic extends js.Object {
  def apply(fns: js.Function*): ComponentStatic = js.native
  def attachTo(selector: String): Unit = js.native
  def attachTo(selector: String, options: js.Object): Unit = js.native
  def attachTo(selector: JQuery[HTMLElement]): Unit = js.native
  def attachTo(selector: JQuery[HTMLElement], options: js.Object): Unit = js.native
  def attachTo(selector: Element): Unit = js.native
  def attachTo(selector: Element, options: js.Object): Unit = js.native
  def teardownAll(): Unit = js.native
}

