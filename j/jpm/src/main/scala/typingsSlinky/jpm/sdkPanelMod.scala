package typingsSlinky.jpm

import org.scalajs.dom.experimental.URL
import typingsSlinky.jpm.FFAddonSDK.Port
import typingsSlinky.jpm.jpmStrings.end
import typingsSlinky.jpm.jpmStrings.error
import typingsSlinky.jpm.jpmStrings.hide
import typingsSlinky.jpm.jpmStrings.message
import typingsSlinky.jpm.jpmStrings.ready
import typingsSlinky.jpm.jpmStrings.show
import typingsSlinky.jpm.jpmStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates transient dialogs to implement part of an add-on's user interface
  */
@JSImport("sdk/panel", JSImport.Namespace)
@js.native
object sdkPanelMod extends js.Object {
  @js.native
  trait Panel extends js.Object {
    var allow: js.UndefOr[Anon_Script] = js.native
    var contentScript: js.UndefOr[String | js.Array[String]] = js.native
    var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
    var contentScriptOptions: js.UndefOr[js.Any] = js.native
    var contentScriptWhen: start | ready | end = js.native
    var contentURL: js.UndefOr[String | URL] = js.native
    var focus: Boolean = js.native
    var height: Double = js.native
    var isShowing: Boolean = js.native
    var port: Port = js.native
    var width: Double = js.native
    def destroy(): Unit = js.native
    def hide(): Unit = js.native
    @JSName("on")
    def on_error(event: error, handler: js.Function1[/* arg */ js.UndefOr[js.Error | js.Any], _]): Unit = js.native
    @JSName("on")
    def on_hide(event: hide, handler: js.Function1[/* arg */ js.UndefOr[js.Error | js.Any], _]): Unit = js.native
    @JSName("on")
    def on_message(event: message, handler: js.Function1[/* arg */ js.UndefOr[js.Error | js.Any], _]): Unit = js.native
    @JSName("on")
    def on_show(event: show, handler: js.Function1[/* arg */ js.UndefOr[js.Error | js.Any], _]): Unit = js.native
    def postMessage(message: String): Unit = js.native
    def removeListener(event: String, listener: js.Function): Unit = js.native
    def resize(width: Double, height: Double): Unit = js.native
    def show(): Unit = js.native
    def show(options: Anon_Focus): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jpm.FFAddonSDK.ToggleButton
    - typings.jpm.FFAddonSDK.Widget
    - typings.jpm.Anon_Bottom
  */
  trait PanelPosition extends js.Object
  
  def Panel(options: Anon_AllowContentScript): Panel = js.native
}

