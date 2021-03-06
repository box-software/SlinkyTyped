package typingsSlinky.atJupyterlabPdfDashExtension

import typingsSlinky.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IExtension
import typingsSlinky.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRenderer
import typingsSlinky.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRendererFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/pdf-extension", JSImport.Namespace)
@js.native
object atJupyterlabPdfDashExtensionMod extends js.Object {
  @js.native
  class RenderedPDF () extends IRenderer {
    var _base64: js.Any = js.native
    var _disposable: js.Any = js.native
    var _object: js.Any = js.native
    var _ready: js.Any = js.native
    /**
      * Handle a `before-hide` message.
      */
    /* protected */ def onBeforeHide(): Unit = js.native
  }
  
  val default: IExtension | js.Array[IExtension] = js.native
  val rendererFactory: IRendererFactory = js.native
}

