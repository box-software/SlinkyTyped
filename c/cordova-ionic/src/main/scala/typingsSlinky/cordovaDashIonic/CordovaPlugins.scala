package typingsSlinky.cordovaDashIonic

import typingsSlinky.cordovaDashIonic.Ionic.Keyboard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var Keyboard: typingsSlinky.cordovaDashIonic.Ionic.Keyboard
}

object CordovaPlugins {
  @scala.inline
  def apply(Keyboard: Keyboard): CordovaPlugins = {
    val __obj = js.Dynamic.literal(Keyboard = Keyboard.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

