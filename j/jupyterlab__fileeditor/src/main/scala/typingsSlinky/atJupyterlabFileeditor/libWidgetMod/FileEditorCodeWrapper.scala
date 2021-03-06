package typingsSlinky.atJupyterlabFileeditor.libWidgetMod

import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorMod.CodeEditorWrapper
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.Context
import typingsSlinky.atJupyterlabFileeditor.libWidgetMod.FileEditor.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor/lib/widget", "FileEditorCodeWrapper")
@js.native
class FileEditorCodeWrapper protected () extends CodeEditorWrapper {
  /**
    * Construct a new editor widget.
    */
  def this(options: IOptions) = this()
  var _context: Context = js.native
  /**
    * Handle a change to the collaborators on the model
    * by updating UI elements associated with them.
    */
  var _onCollaboratorsChanged: js.Any = js.native
  /**
    * Handle a change in context model content.
    */
  var _onContentChanged: js.Any = js.native
  /**
    * Handle actions that should be taken when the context is ready.
    */
  var _onContextReady: js.Any = js.native
  var _ready: js.Any = js.native
  /**
    * Get the context for the editor widget.
    */
  val context: Context = js.native
  /**
    * A promise that resolves when the file editor is ready.
    */
  val ready: js.Promise[Unit] = js.native
}

