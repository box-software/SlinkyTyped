package typingsSlinky.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PannedEventArgs extends js.Object {
  /** Event parameters from map
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object PannedEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): PannedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PannedEventArgs]
  }
}

