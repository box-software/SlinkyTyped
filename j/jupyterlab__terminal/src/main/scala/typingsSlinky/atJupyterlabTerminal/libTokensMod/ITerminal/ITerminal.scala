package typingsSlinky.atJupyterlabTerminal.libTokensMod.ITerminal

import typingsSlinky.atJupyterlabServices.libTerminalTerminalMod.TerminalSession.ISession
import typingsSlinky.atJupyterlabTerminal.atJupyterlabTerminalStrings.cursorBlink
import typingsSlinky.atJupyterlabTerminal.atJupyterlabTerminalStrings.fontFamily
import typingsSlinky.atJupyterlabTerminal.atJupyterlabTerminalStrings.fontSize
import typingsSlinky.atJupyterlabTerminal.atJupyterlabTerminalStrings.initialCommand
import typingsSlinky.atJupyterlabTerminal.atJupyterlabTerminalStrings.lineHeight
import typingsSlinky.atJupyterlabTerminal.atJupyterlabTerminalStrings.pasteWithCtrlV
import typingsSlinky.atJupyterlabTerminal.atJupyterlabTerminalStrings.screenReaderMode
import typingsSlinky.atJupyterlabTerminal.atJupyterlabTerminalStrings.scrollback
import typingsSlinky.atJupyterlabTerminal.atJupyterlabTerminalStrings.shutdownOnClose
import typingsSlinky.atJupyterlabTerminal.atJupyterlabTerminalStrings.theme
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITerminal extends Widget {
  /**
    * The terminal session associated with the widget.
    */
  var session: ISession = js.native
  @JSName("getOption")
  def getOption_cursorBlink(option: cursorBlink): Boolean = js.native
  /**
    * Get a config option for the terminal.
    */
  @JSName("getOption")
  def getOption_fontFamily(option: fontFamily): String | Null = js.native
  @JSName("getOption")
  def getOption_fontSize(option: fontSize): Double = js.native
  @JSName("getOption")
  def getOption_initialCommand(option: initialCommand): String = js.native
  @JSName("getOption")
  def getOption_lineHeight(option: lineHeight): Double | Null = js.native
  @JSName("getOption")
  def getOption_pasteWithCtrlV(option: pasteWithCtrlV): Boolean = js.native
  @JSName("getOption")
  def getOption_screenReaderMode(option: screenReaderMode): Boolean = js.native
  @JSName("getOption")
  def getOption_scrollback(option: scrollback): Double | Null = js.native
  @JSName("getOption")
  def getOption_shutdownOnClose(option: shutdownOnClose): Boolean = js.native
  @JSName("getOption")
  def getOption_theme(option: theme): Theme = js.native
  /**
    * Refresh the terminal session.
    */
  def refresh(): js.Promise[Unit] = js.native
  @JSName("setOption")
  def setOption_cursorBlink(option: cursorBlink, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_fontFamily(option: fontFamily): Unit = js.native
  /**
    * Set a config option for the terminal.
    */
  @JSName("setOption")
  def setOption_fontFamily(option: fontFamily, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_fontSize(option: fontSize, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_initialCommand(option: initialCommand, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_lineHeight(option: lineHeight): Unit = js.native
  @JSName("setOption")
  def setOption_lineHeight(option: lineHeight, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_pasteWithCtrlV(option: pasteWithCtrlV, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_screenReaderMode(option: screenReaderMode, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_scrollback(option: scrollback): Unit = js.native
  @JSName("setOption")
  def setOption_scrollback(option: scrollback, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_shutdownOnClose(option: shutdownOnClose, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_theme(option: theme, value: Theme): Unit = js.native
}

