package typingsSlinky.atJupyterlabFileeditorDashExtension

import typingsSlinky.atJupyterlabApplication.atJupyterlabApplicationMod.JupyterFrontEnd
import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typingsSlinky.atJupyterlabApputils.atJupyterlabApputilsMod.WidgetTracker
import typingsSlinky.atJupyterlabApputils.libCommandpaletteMod.ICommandPalette
import typingsSlinky.atJupyterlabConsole.libTokensMod.IConsoleTracker
import typingsSlinky.atJupyterlabCoreutils.libTokensMod.ISettingRegistry
import typingsSlinky.atJupyterlabCoreutils.libTokensMod.ISettingRegistry.ISettings
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typingsSlinky.atJupyterlabFilebrowser.libTokensMod.IFileBrowserFactory
import typingsSlinky.atJupyterlabFileeditor.atJupyterlabFileeditorMod.FileEditor
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.Editor
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.`fileeditorColonchange-font-size`
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.`fileeditorColonchange-tabs`
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.`fileeditorColoncreate-console`
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.`fileeditorColoncreate-new-markdown-file`
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.`fileeditorColoncreate-new`
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.`fileeditorColonmarkdown-preview`
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.`fileeditorColonrun-all`
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.`fileeditorColonrun-code`
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.`fileeditorColontoggle-autoclosing-brackets`
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.`fileeditorColontoggle-line-numbers`
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.`fileeditorColontoggle-line-wrap`
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.`fileeditorColontoggle-match-brackets`
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.`jp-MarkdownIcon`
import typingsSlinky.atJupyterlabFileeditorDashExtension.atJupyterlabFileeditorDashExtensionStrings.`jp-MaterialIcon jp-TextEditorIcon`
import typingsSlinky.atJupyterlabLauncher.atJupyterlabLauncherMod.ILauncher
import typingsSlinky.atJupyterlabMainmenu.libTokensMod.IMainMenu
import typingsSlinky.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor-extension/lib/commands", JSImport.Namespace)
@js.native
object libCommandsMod extends js.Object {
  val EDITOR_ICON_CLASS: `jp-MaterialIcon jp-TextEditorIcon` = js.native
  val FACTORY: Editor = js.native
  val MARKDOWN_ICON_CLASS: `jp-MarkdownIcon` = js.native
  @js.native
  object CommandIDs extends js.Object {
    val autoClosingBrackets: `fileeditorColontoggle-autoclosing-brackets` = js.native
    val changeFontSize: `fileeditorColonchange-font-size` = js.native
    val changeTabs: `fileeditorColonchange-tabs` = js.native
    val createConsole: `fileeditorColoncreate-console` = js.native
    val createNew: `fileeditorColoncreate-new` = js.native
    val createNewMarkdown: `fileeditorColoncreate-new-markdown-file` = js.native
    val lineNumbers: `fileeditorColontoggle-line-numbers` = js.native
    val lineWrap: `fileeditorColontoggle-line-wrap` = js.native
    val markdownPreview: `fileeditorColonmarkdown-preview` = js.native
    val matchBrackets: `fileeditorColontoggle-match-brackets` = js.native
    val runAllCode: `fileeditorColonrun-all` = js.native
    val runCode: `fileeditorColonrun-code` = js.native
  }
  
  @js.native
  object Commands extends js.Object {
    /**
      * Add the Auto Close Brackets for Text Editor command
      */
    def addAutoClosingBracketsCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, id: String): Unit = js.native
    /**
      * Add a command to change font size for File Editor
      */
    def addChangeFontSizeCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, id: String): Unit = js.native
    /**
      * Add commands to change the font size to the File Editor palette
      */
    def addChangeFontSizeCommandsToPalette(palette: ICommandPalette): Unit = js.native
    /**
      * Add command for changing tabs size or type in File Editor
      */
    def addChangeTabsCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, id: String): Unit = js.native
    /**
      * Add commands to change the tab indentation to the File Editor palette
      */
    def addChangeTabsCommandsToPalette(palette: ICommandPalette): Unit = js.native
    /**
      * Add a File Editor code runner to the Run menu
      */
    def addCodeRunnersToRunMenu(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      consoleTracker: IConsoleTracker
    ): Unit = js.native
    /**
      * Wrapper function for adding the default File Editor commands
      */
    def addCommands(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      id: String,
      isEnabled: js.Function0[Boolean],
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      browserFactory: IFileBrowserFactory
    ): Unit = js.native
    /**
      * Add a File Editor console creator to the File menu
      */
    def addConsoleCreatorToFileMenu(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]
    ): Unit = js.native
    /**
      * Wrapper function for adding the default items to the File Editor context menu
      */
    def addContextMenuItems(app: JupyterFrontEnd[IShell]): Unit = js.native
    /**
      * Add the Create Console for Editor command
      */
    def addCreateConsoleCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    /**
      * Add a Create Console item to the File Editor context menu
      */
    def addCreateConsoleToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    /**
      * Add the New File command
      */
    def addCreateNewCommand(commands: CommandRegistry, browserFactory: IFileBrowserFactory): Unit = js.native
    /**
      * Add a Create New File command to the File Editor palette
      */
    def addCreateNewCommandToPalette(palette: ICommandPalette): Unit = js.native
    /**
      * Add a Create New File command to the File menu
      */
    def addCreateNewFileToFileMenu(menu: IMainMenu): Unit = js.native
    /**
      * Add the New Markdown File command
      */
    def addCreateNewMarkdownCommand(commands: CommandRegistry, browserFactory: IFileBrowserFactory): Unit = js.native
    /**
      * Add a Create New Markdown command to the File Editor palette
      */
    def addCreateNewMarkdownCommandToPalette(palette: ICommandPalette): Unit = js.native
    /**
      * Add a Create New Markdown File command to the File menu
      */
    def addCreateNewMarkdownFileToFileMenu(menu: IMainMenu): Unit = js.native
    /**
      * Add Create New Markdown to the Launcher
      */
    def addCreateNewMarkdownToLauncher(launcher: ILauncher): Unit = js.native
    /**
      * Add Create New Text File to the Launcher
      */
    def addCreateNewToLauncher(launcher: ILauncher): Unit = js.native
    /**
      * Add File Editor editing commands to the Settings menu, including:
      * Indent with Tab, Tab Spaces, Change Font Size, and auto closing brackets
      */
    def addEditingCommandsToSettingsMenu(menu: IMainMenu, commands: CommandRegistry): Unit = js.native
    /**
      * Add a File Editor editor viewer to the View Menu
      */
    def addEditorViewerToViewMenu(menu: IMainMenu, tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = js.native
    /**
      * Wrapper function for adding the default launcher items for File Editor
      */
    def addLauncherItems(launcher: ILauncher): Unit = js.native
    /**
      * Add the Line Numbers command
      */
    def addLineNumbersCommand(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      id: String,
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    /**
      * Add the command
      */
    def addMarkdownPreviewCommand(commands: CommandRegistry, tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = js.native
    /**
      * Add a Markdown Preview item to the File Editor context menu
      */
    def addMarkdownPreviewToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    /**
      * Add the Match Brackets command
      */
    def addMatchBracketsCommand(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      id: String,
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    /**
      * Wrapper function for adding the default menu items for File Editor
      */
    def addMenuItems(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      consoleTracker: IConsoleTracker
    ): Unit = js.native
    /**
      * Wrapper function for adding the default items to the File Editor palette
      */
    def addPaletteItems(palette: ICommandPalette): Unit = js.native
    /**
      * Add the Run All Code command
      */
    def addRunAllCodeCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    /**
      * Add the Run Code command
      */
    def addRunCodeCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    /**
      * Add File Editor undo and redo widgets to the Edit menu
      */
    def addUndoRedoToEditMenu(menu: IMainMenu, tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = js.native
    /**
      * Add the Word Wrap command
      */
    def addWordWrapCommand(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      id: String,
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    /**
      * Update the setting values.
      */
    def updateSettings(settings: ISettings, commands: CommandRegistry): Unit = js.native
    /**
      * Update the settings of the current tracker instances.
      */
    def updateTracker(tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = js.native
    /**
      * Update the settings of a widget.
      */
    def updateWidget(widget: FileEditor): Unit = js.native
  }
  
}

