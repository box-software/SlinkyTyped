package typingsSlinky.atExpoVectorDashIcons.atExpoVectorDashIconsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashNativeDashVectorDashIcons.fontAwesomeMod.default
import typingsSlinky.reactDashNativeDashVectorDashIcons.iconMod.IconButtonProps
import typingsSlinky.reactDashNativeDashVectorDashIcons.iconMod.ImageSource
import typingsSlinky.reactDashNativeDashVectorDashIcons.iconMod.TabBarItemIOSProps
import typingsSlinky.reactDashNativeDashVectorDashIcons.iconMod.ToolbarAndroidProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/vector-icons", "FontAwesome")
@js.native
class FontAwesome () extends default

/* static members */
@JSImport("@expo/vector-icons", "FontAwesome")
@js.native
object FontAwesome extends js.Object {
  @js.native
  class Button ()
    extends Component[IconButtonProps, js.Any, js.Any]
  
  @js.native
  class TabBarItem ()
    extends Component[TabBarItemIOSProps, js.Any, js.Any]
  
  @js.native
  class TabBarItemIOS ()
    extends Component[TabBarItemIOSProps, js.Any, js.Any]
  
  @js.native
  class ToolbarAndroid ()
    extends Component[ToolbarAndroidProps, js.Any, js.Any]
  
  def getImageSource(name: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
  def getRawGlyphMap(): StringDictionary[Double] = js.native
  def hasIcon(name: String): Boolean = js.native
  def loadFont(): js.Promise[Unit] = js.native
  def loadFont(file: String): js.Promise[Unit] = js.native
}

