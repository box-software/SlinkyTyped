package typingsSlinky.baseui.toastMod

import slinky.core.TagMod
import typingsSlinky.baseui.Anon_Bottom
import typingsSlinky.baseui.Anon_Key
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/toast", "ToasterContainer")
@js.native
class ToasterContainer ()
  extends Component[ToasterProps, ToasterContainerState, js.Any] {
  def clear(key: Key): Unit = js.native
  def clearAll(): Unit = js.native
  def dismiss(key: Key): Unit = js.native
  def getOnCloseHandler(key: Key): js.Function0[_] = js.native
  def getOnCloseHandler(key: Key, onClose: js.Function0[_]): js.Function0[_] = js.native
  def getSharedProps(): Anon_Bottom = js.native
  def getToastProps(props: ToastProps): ToastProps with Anon_Key = js.native
  def internalOnClose(key: Key): Unit = js.native
  def renderToast(toastProps: ToastProps with Anon_Key): TagMod[Any] = js.native
  def show(props: ToastProps): Key = js.native
  def update(key: Key, props: ToastProps): Unit = js.native
}

