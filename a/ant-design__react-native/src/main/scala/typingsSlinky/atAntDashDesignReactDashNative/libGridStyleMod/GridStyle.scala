package typingsSlinky.atAntDashDesignReactDashNative.libGridStyleMod

import typingsSlinky.reactDashNative.reactDashNativeMod.ImageStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridStyle extends js.Object {
  var grayBorderBox: ViewStyle
  var icon: ImageStyle
  var text: TextStyle
}

object GridStyle {
  @scala.inline
  def apply(grayBorderBox: ViewStyle, icon: ImageStyle, text: TextStyle): GridStyle = {
    val __obj = js.Dynamic.literal(grayBorderBox = grayBorderBox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GridStyle]
  }
}

