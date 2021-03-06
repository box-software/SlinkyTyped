package typingsSlinky.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "TextEdit")
@js.native
object TextEdit extends js.Object {
  /**
    * Creates a delete text edit.
    * @param range The range of text to be deleted.
    */
  def del(range: typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range): typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit = js.native
  /**
    * Creates a insert text edit.
    * @param position The position to insert the text at.
    * @param newText The text to be inserted.
    */
  def insert(
    position: typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position,
    newText: String
  ): typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextEdit */ Boolean = js.native
  /**
    * Creates a replace text edit.
    * @param range The range of text to be replaced.
    * @param newText The new text.
    */
  def replace(
    range: typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    newText: String
  ): typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit = js.native
}

