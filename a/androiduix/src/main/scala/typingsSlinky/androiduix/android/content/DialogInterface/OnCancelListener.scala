package typingsSlinky.androiduix.android.content.DialogInterface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCancelListener extends js.Object {
  def onCancel(dialog: typingsSlinky.androiduix.android.content.DialogInterface): Unit
}

object OnCancelListener {
  @scala.inline
  def apply(onCancel: typingsSlinky.androiduix.android.content.DialogInterface => Unit): OnCancelListener = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction1(onCancel))
  
    __obj.asInstanceOf[OnCancelListener]
  }
}

