package typingsSlinky.atJupyterlabNotebook.atJupyterlabNotebookMod

import typingsSlinky.atJupyterlabApputils.libClientsessionMod.IClientSession
import typingsSlinky.atJupyterlabCoreutils.libNbformatMod.nbformat.CellType
import typingsSlinky.atJupyterlabNotebook.Anon_Cell
import typingsSlinky.atJupyterlabNotebook.atJupyterlabNotebookStrings.above
import typingsSlinky.atJupyterlabNotebook.atJupyterlabNotebookStrings.below
import typingsSlinky.atJupyterlabNotebook.atJupyterlabNotebookStrings.replace
import typingsSlinky.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "NotebookActions")
@js.native
/**
  * A private constructor for the `NotebookActions` class.
  *
  * #### Notes
  * This class can never be instantiated. Its static member `executed` will be
  * merged with the `NotebookActions` namespace. The reason it exists as a
  * standalone class is because at run time, the `Private.executed` variable
  * does not yet exist, so it needs to be referenced via a getter.
  */
class NotebookActions protected ()
  extends typingsSlinky.atJupyterlabNotebook.libActionsMod.NotebookActions

/* static members */
@JSImport("@jupyterlab/notebook", "NotebookActions")
@js.native
object NotebookActions extends js.Object {
  /**
    * A signal that emits whenever a cell is run.
    */
  val executed: ISignal[_, Anon_Cell] = js.native
  /**
    * Change the selected cell type(s).
    *
    * @param notebook - The target notebook widget.
    *
    * @param value - The target cell type.
    *
    * #### Notes
    * It should preserve the widget mode.
    * This action can be undone.
    * The existing selection will be cleared.
    * Any cells converted to markdown will be unrendered.
    */
  def changeCellType(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, value: CellType): Unit = js.native
  /**
    * Clear all the code outputs on the widget.
    *
    * @param notebook - The target notebook widget.
    *
    * #### Notes
    * The widget `mode` will be preserved.
    */
  def clearAllOutputs(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Clear the code outputs of the selected cells.
    *
    * @param notebook - The target notebook widget.
    *
    * #### Notes
    * The widget `mode` will be preserved.
    */
  def clearOutputs(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Copy the selected cell data to a clipboard.
    *
    * @param notebook - The target notebook widget.
    */
  def copy(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Cut the selected cell data to a clipboard.
    *
    * @param notebook - The target notebook widget.
    *
    * #### Notes
    * This action can be undone.
    * A new code cell is added if all cells are cut.
    */
  def cut(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Delete the selected cells.
    *
    * @param notebook - The target notebook widget.
    *
    * #### Notes
    * The cell after the last selected cell will be activated.
    * It will add a code cell if all cells are deleted.
    * This action can be undone.
    */
  def deleteCells(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Deselect all of the cells of the notebook.
    *
    * @param notebook - the targe notebook widget.
    */
  def deselectAll(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Disable output scrolling for all selected cells.
    *
    * @param notebook - The target notebook widget.
    */
  def disableOutputScrolling(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Enable output scrolling for all selected cells.
    *
    * @param notebook - The target notebook widget.
    */
  def enableOutputScrolling(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Extend the selection to the cell above.
    *
    * @param notebook - The target notebook widget.
    * @param toTop - If true, denotes selection to extend to the top.
    *
    * #### Notes
    * This is a no-op if the first cell is the active cell.
    * The new cell will be activated.
    */
  def extendSelectionAbove(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  def extendSelectionAbove(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, toTop: Boolean): Unit = js.native
  /**
    * Extend the selection to the cell below.
    *
    * @param notebook - The target notebook widget.
    * @param toBottom - If true, denotes selection to extend to the bottom.
    *
    * #### Notes
    * This is a no-op if the last cell is the active cell.
    * The new cell will be activated.
    */
  def extendSelectionBelow(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  def extendSelectionBelow(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, toBottom: Boolean): Unit = js.native
  /**
    * Hide the code on all code cells.
    *
    * @param notebook - The target notebook widget.
    */
  def hideAllCode(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Hide the output on all code cells.
    *
    * @param notebook - The target notebook widget.
    */
  def hideAllOutputs(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Hide the code on selected code cells.
    *
    * @param notebook - The target notebook widget.
    */
  def hideCode(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Hide the output on selected code cells.
    *
    * @param notebook - The target notebook widget.
    */
  def hideOutput(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Insert a new code cell above the active cell.
    *
    * @param notebook - The target notebook widget.
    *
    * #### Notes
    * The widget mode will be preserved.
    * This action can be undone.
    * The existing selection will be cleared.
    * The new cell will the active cell.
    */
  def insertAbove(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Insert a new code cell below the active cell.
    *
    * @param notebook - The target notebook widget.
    *
    * #### Notes
    * The widget mode will be preserved.
    * This action can be undone.
    * The existing selection will be cleared.
    * The new cell will be the active cell.
    */
  def insertBelow(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Merge the selected cells.
    *
    * @param notebook - The target notebook widget.
    *
    * #### Notes
    * The widget mode will be preserved.
    * If only one cell is selected, the next cell will be selected.
    * If the active cell is a code cell, its outputs will be cleared.
    * This action can be undone.
    * The final cell will have the same type as the active cell.
    * If the active cell is a markdown cell, it will be unrendered.
    */
  def mergeCells(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Move the selected cell(s) down.
    *
    * @param notebook = The target notebook widget.
    */
  def moveDown(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Move the selected cell(s) up.
    *
    * @param widget - The target notebook widget.
    */
  def moveUp(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Paste cells from the application clipboard.
    *
    * @param notebook - The target notebook widget.
    *
    * @param mode - the mode of the paste operation: 'below' pastes cells
    *   below the active cell, 'above' pastes cells above the active cell,
    *   and 'replace' removes the currently selected cells and pastes cells
    *   in their place.
    *
    * #### Notes
    * The last pasted cell becomes the active cell.
    * This is a no-op if there is no cell data on the clipboard.
    * This action can be undone.
    */
  def paste(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  @JSName("paste")
  def paste_above(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, mode: above): Unit = js.native
  @JSName("paste")
  def paste_below(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, mode: below): Unit = js.native
  @JSName("paste")
  def paste_replace(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, mode: replace): Unit = js.native
  /**
    * Redo a cell action.
    *
    * @param notebook - The target notebook widget.
    *
    * #### Notes
    * This is a no-op if there are no cell actions to redo.
    */
  def redo(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  def renderAllMarkdown(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): js.Promise[Boolean] = js.native
  def renderAllMarkdown(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, session: IClientSession): js.Promise[Boolean] = js.native
  /**
    * Run the selected cell(s).
    *
    * @param notebook - The target notebook widget.
    *
    * @param session - The optional client session object.
    *
    * #### Notes
    * The last selected cell will be activated, but not scrolled into view.
    * The existing selection will be cleared.
    * An execution error will prevent the remaining code cells from executing.
    * All markdown cells will be rendered.
    */
  def run(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): js.Promise[Boolean] = js.native
  def run(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, session: IClientSession): js.Promise[Boolean] = js.native
  /**
    * Run all of the cells in the notebook.
    *
    * @param notebook - The target notebook widget.
    *
    * @param session - The optional client session object.
    *
    * #### Notes
    * The existing selection will be cleared.
    * An execution error will prevent the remaining code cells from executing.
    * All markdown cells will be rendered.
    * The last cell in the notebook will be activated and scrolled into view.
    */
  def runAll(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): js.Promise[Boolean] = js.native
  def runAll(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, session: IClientSession): js.Promise[Boolean] = js.native
  /**
    * Run all of the cells before the currently active cell (exclusive).
    *
    * @param notebook - The target notebook widget.
    *
    * @param session - The optional client session object.
    *
    * #### Notes
    * The existing selection will be cleared.
    * An execution error will prevent the remaining code cells from executing.
    * All markdown cells will be rendered.
    * The currently active cell will remain selected.
    */
  def runAllAbove(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): js.Promise[Boolean] = js.native
  def runAllAbove(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, session: IClientSession): js.Promise[Boolean] = js.native
  /**
    * Run all of the cells after the currently active cell (inclusive).
    *
    * @param notebook - The target notebook widget.
    *
    * @param session - The optional client session object.
    *
    * #### Notes
    * The existing selection will be cleared.
    * An execution error will prevent the remaining code cells from executing.
    * All markdown cells will be rendered.
    * The last cell in the notebook will be activated and scrolled into view.
    */
  def runAllBelow(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): js.Promise[Boolean] = js.native
  def runAllBelow(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, session: IClientSession): js.Promise[Boolean] = js.native
  /**
    * Run the selected cell(s) and advance to the next cell.
    *
    * @param notebook - The target notebook widget.
    *
    * @param session - The optional client session object.
    *
    * #### Notes
    * The existing selection will be cleared.
    * The cell after the last selected cell will be activated and scrolled into view.
    * An execution error will prevent the remaining code cells from executing.
    * All markdown cells will be rendered.
    * If the last selected cell is the last cell, a new code cell
    * will be created in `'edit'` mode.  The new cell creation can be undone.
    */
  def runAndAdvance(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): js.Promise[Boolean] = js.native
  def runAndAdvance(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, session: IClientSession): js.Promise[Boolean] = js.native
  /**
    * Run the selected cell(s) and insert a new code cell.
    *
    * @param notebook - The target notebook widget.
    *
    * @param session - The optional client session object.
    *
    * #### Notes
    * An execution error will prevent the remaining code cells from executing.
    * All markdown cells will be rendered.
    * The widget mode will be set to `'edit'` after running.
    * The existing selection will be cleared.
    * The cell insert can be undone.
    * The new cell will be scrolled into view.
    */
  def runAndInsert(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): js.Promise[Boolean] = js.native
  def runAndInsert(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, session: IClientSession): js.Promise[Boolean] = js.native
  /**
    * Select the above the active cell.
    *
    * @param notebook - The target notebook widget.
    *
    * #### Notes
    * The widget mode will be preserved.
    * This is a no-op if the first cell is the active cell.
    * This will skip any collapsed cells.
    * The existing selection will be cleared.
    */
  def selectAbove(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Select all of the cells of the notebook.
    *
    * @param notebook - the target notebook widget.
    */
  def selectAll(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Select the cell below the active cell.
    *
    * @param notebook - The target notebook widget.
    *
    * #### Notes
    * The widget mode will be preserved.
    * This is a no-op if the last cell is the active cell.
    * This will skip any collapsed cells.
    * The existing selection will be cleared.
    */
  def selectBelow(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Set the markdown header level.
    *
    * @param notebook - The target notebook widget.
    *
    * @param level - The header level.
    *
    * #### Notes
    * All selected cells will be switched to markdown.
    * The level will be clamped between 1 and 6.
    * If there is an existing header, it will be replaced.
    * There will always be one blank space after the header.
    * The cells will be unrendered.
    */
  def setMarkdownHeader(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, level: Double): Unit = js.native
  /**
    * Show the code on all code cells.
    *
    * @param widget - The target notebook widget.
    */
  def showAllCode(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Show the output on all code cells.
    *
    * @param notebook - The target notebook widget.
    */
  def showAllOutputs(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Show the code on selected code cells.
    *
    * @param notebook - The target notebook widget.
    */
  def showCode(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Show the output on selected code cells.
    *
    * @param notebook - The target notebook widget.
    */
  def showOutput(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Split the active cell into two or more cells.
    *
    * @param widget - The target notebook widget.
    *
    * #### Notes
    * It will preserve the existing mode.
    * The last cell will be activated.
    * The existing selection will be cleared.
    * The leading whitespace in the second cell will be removed.
    * If there is no content, two empty cells will be created.
    * Both cells will have the same type as the original cell.
    * This action can be undone.
    */
  def splitCell(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Toggle the line number of all cells.
    *
    * @param notebook - The target notebook widget.
    *
    * #### Notes
    * The original state is based on the state of the active cell.
    * The `mode` of the widget will be preserved.
    */
  def toggleAllLineNumbers(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Toggle whether to record cell timing execution.
    *
    * @param notebook - The target notebook widget.
    */
  def toggleRecordTiming(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
  /**
    * Trust the notebook after prompting the user.
    *
    * @param notebook - The target notebook widget.
    *
    * @returns a promise that resolves when the transaction is finished.
    *
    * #### Notes
    * No dialog will be presented if the notebook is already trusted.
    */
  def trust(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): js.Promise[Unit] = js.native
  /**
    * Undo a cell action.
    *
    * @param notebook - The target notebook widget.
    *
    * #### Notes
    * This is a no-op if if there are no cell actions to undo.
    */
  def undo(notebook: typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook): Unit = js.native
}

