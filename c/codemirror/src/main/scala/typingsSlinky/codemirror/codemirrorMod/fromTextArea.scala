package typingsSlinky.codemirror.codemirrorMod

import org.scalajs.dom.raw.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "fromTextArea")
@js.native
object fromTextArea extends js.Object {
  def apply(host: HTMLTextAreaElement): EditorFromTextArea = js.native
  def apply(host: HTMLTextAreaElement, options: EditorConfiguration): EditorFromTextArea = js.native
}

