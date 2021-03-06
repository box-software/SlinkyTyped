package typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.autoClosingBrackets
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.bounded
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.codeFolding
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.fontFamily
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.fontSize
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.insertSpaces
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.lineNumbers
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.lineWrap
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.matchBrackets
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.off
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.on
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.readOnly
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.rulers
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.tabSize
import typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.wordWrapColumn
import typingsSlinky.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typingsSlinky.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget that provides a code editor.
  */
@js.native
trait IEditor
  extends ISelectionOwner
     with IDisposable {
  /**
    * The widget of a character in the editor in pixels.
    */
  val charWidth: Double = js.native
  /**
    * A signal emitted when either the top or bottom edge is requested.
    */
  val edgeRequested: ISignal[IEditor, EdgeLocation] = js.native
  /**
    * The DOM node that hosts the editor.
    */
  val host: HTMLElement = js.native
  /**
    * Get the number of lines in the eidtor.
    */
  val lineCount: Double = js.native
  /**
    * The height of a line in the editor in pixels.
    */
  val lineHeight: Double = js.native
  /**
    * The model used by the editor.
    */
  val model: IModel = js.native
  /**
    * The default selection style for the editor.
    */
  var selectionStyle: ISelectionStyle = js.native
  /**
    * Add a keydown handler to the editor.
    *
    * @param handler - A keydown handler.
    *
    * @returns A disposable that can be used to remove the handler.
    */
  def addKeydownHandler(handler: KeydownHandler): IDisposable = js.native
  /**
    * Explicitly blur the editor.
    */
  def blur(): Unit = js.native
  /**
    * Clear the undo history.
    */
  def clearHistory(): Unit = js.native
  /**
    * Brings browser focus to this editor text.
    */
  def focus(): Unit = js.native
  /**
    * Get the window coordinates given a cursor position.
    *
    * @param position - The desired position.
    *
    * @returns The coordinates of the position.
    */
  def getCoordinateForPosition(position: IPosition): ICoordinate = js.native
  /**
    * Returns the content for the given line number.
    *
    * @param line - The line of interest.
    *
    * @returns The value of the line.
    *
    * #### Notes
    * Lines are 0-based, and accessing a line out of range returns
    * `undefined`.
    */
  def getLine(line: Double): js.UndefOr[String] = js.native
  /**
    * Find an offset for the given position.
    *
    * @param position - The position of interest.
    *
    * @returns The offset at the position, clamped to the extent of the
    * editor contents.
    */
  def getOffsetAt(position: IPosition): Double = js.native
  @JSName("getOption")
  def getOption_autoClosingBrackets(option: autoClosingBrackets): Boolean = js.native
  @JSName("getOption")
  def getOption_codeFolding(option: codeFolding): Boolean = js.native
  /**
    * Get a config option for the editor.
    */
  @JSName("getOption")
  def getOption_fontFamily(option: fontFamily): String | Null = js.native
  @JSName("getOption")
  def getOption_fontSize(option: fontSize): Double | Null = js.native
  @JSName("getOption")
  def getOption_insertSpaces(option: insertSpaces): Boolean = js.native
  @JSName("getOption")
  def getOption_lineHeight(option: typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.lineHeight): Double | Null = js.native
  @JSName("getOption")
  def getOption_lineNumbers(option: lineNumbers): Boolean = js.native
  @JSName("getOption")
  def getOption_lineWrap(option: lineWrap): off | on | wordWrapColumn | bounded = js.native
  @JSName("getOption")
  def getOption_matchBrackets(option: matchBrackets): Boolean = js.native
  @JSName("getOption")
  def getOption_readOnly(option: readOnly): Boolean = js.native
  @JSName("getOption")
  def getOption_rulers(option: rulers): js.Array[Double] = js.native
  @JSName("getOption")
  def getOption_tabSize(option: tabSize): Double = js.native
  @JSName("getOption")
  def getOption_wordWrapColumn(option: wordWrapColumn): Double = js.native
  /**
    * Find a position for the given offset.
    *
    * @param offset - The offset of interest.
    *
    * @returns The position at the offset, clamped to the extent of the
    * editor contents.
    */
  def getPositionAt(offset: Double): js.UndefOr[IPosition] = js.native
  /**
    * Get the cursor position given window coordinates.
    *
    * @param coordinate - The desired coordinate.
    *
    * @returns The position of the coordinates, or null if not
    *   contained in the editor.
    */
  def getPositionForCoordinate(coordinate: ICoordinate): IPosition | Null = js.native
  /**
    * Gets the token at a given position.
    */
  def getTokenForPosition(position: IPosition): IToken = js.native
  /**
    * Gets the list of tokens for the editor model.
    */
  def getTokens(): js.Array[IToken] = js.native
  /**
    * Test whether the editor has keyboard focus.
    */
  def hasFocus(): Boolean = js.native
  /**
    * Inserts a new line at the cursor position and indents it.
    */
  def newIndentedLine(): Unit = js.native
  /**
    * Redo one undone edit.
    */
  def redo(): Unit = js.native
  /**
    * Repaint the editor.
    *
    * #### Notes
    * A repainted editor should fit to its host node.
    */
  def refresh(): Unit = js.native
  /**
    * Resize the editor to fit its host node.
    */
  def resizeToFit(): Unit = js.native
  /**
    * Reveals the given position in the editor.
    *
    * @param position - The desired position to reveal.
    */
  def revealPosition(position: IPosition): Unit = js.native
  /**
    * Reveals the given selection in the editor.
    *
    * @param position - The desired selection to reveal.
    */
  def revealSelection(selection: IRange): Unit = js.native
  def setOption(option: lineWrap, value: bounded): Unit = js.native
  def setOption(option: lineWrap, value: off): Unit = js.native
  def setOption(option: lineWrap, value: on): Unit = js.native
  def setOption(option: lineWrap, value: wordWrapColumn): Unit = js.native
  @JSName("setOption")
  def setOption_autoClosingBrackets(option: autoClosingBrackets, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_codeFolding(option: codeFolding, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_fontFamily(option: fontFamily): Unit = js.native
  /**
    * Set a config option for the editor.
    */
  @JSName("setOption")
  def setOption_fontFamily(option: fontFamily, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_fontSize(option: fontSize): Unit = js.native
  @JSName("setOption")
  def setOption_fontSize(option: fontSize, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_insertSpaces(option: insertSpaces, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_lineHeight(option: typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.lineHeight): Unit = js.native
  @JSName("setOption")
  def setOption_lineHeight(
    option: typingsSlinky.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.lineHeight,
    value: Double
  ): Unit = js.native
  @JSName("setOption")
  def setOption_lineNumbers(option: lineNumbers, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_matchBrackets(option: matchBrackets, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_readOnly(option: readOnly, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_rulers(option: rulers, value: js.Array[Double]): Unit = js.native
  @JSName("setOption")
  def setOption_tabSize(option: tabSize, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_wordWrapColumn(option: wordWrapColumn, value: Double): Unit = js.native
  def setSize(): Unit = js.native
  /**
    * Set the size of the editor.
    *
    * @param size - The desired size.
    *
    * #### Notes
    * Use `null` if the size is unknown.
    */
  def setSize(size: IDimension): Unit = js.native
  /**
    * Undo one edit (if any undo events are stored).
    */
  def undo(): Unit = js.native
}

