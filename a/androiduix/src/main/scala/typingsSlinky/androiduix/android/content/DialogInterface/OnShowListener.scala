package typingsSlinky.androiduix.android.content.DialogInterface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnShowListener extends js.Object {
  def onShow(dialog: typingsSlinky.androiduix.android.content.DialogInterface): Unit
}

object OnShowListener {
  @scala.inline
  def apply(onShow: typingsSlinky.androiduix.android.content.DialogInterface => Unit): OnShowListener = {
    val __obj = js.Dynamic.literal(onShow = js.Any.fromFunction1(onShow))
  
    __obj.asInstanceOf[OnShowListener]
  }
}

