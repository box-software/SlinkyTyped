package typingsSlinky.antdDashMobileDashRn

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactDashNative.reactDashNativeMod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animating extends js.Object {
  var animating: Boolean
  var color: String
  var size: String
  var styles: StringDictionary[RegisteredStyle[_]]
  var toast: Boolean
}

object Anon_Animating {
  @scala.inline
  def apply(
    animating: Boolean,
    color: String,
    size: String,
    styles: StringDictionary[RegisteredStyle[_]],
    toast: Boolean
  ): Anon_Animating = {
    val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Animating]
  }
}

