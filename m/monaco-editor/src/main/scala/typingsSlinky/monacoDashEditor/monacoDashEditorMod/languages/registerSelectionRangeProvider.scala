package typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages

import typingsSlinky.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerSelectionRangeProvider")
@js.native
object registerSelectionRangeProvider extends js.Object {
  def apply(languageId: String, provider: SelectionRangeProvider): IDisposable = js.native
}

