package typingsSlinky.seen.seenMod

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "SvgTextPainter")
@js.native
class SvgTextPainter protected () extends js.Object {
  def this(elementFactory: js.Function1[/* name */ String, HTMLElement]) = this()
  def fillText(m: js.Array[Double], text: String): Unit = js.native
  def fillText(m: js.Array[Double], text: String, style: Partial[CSSStyleDeclaration]): Unit = js.native
}

