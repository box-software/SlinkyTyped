package typingsSlinky.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomedOutEventArgs extends js.Object {
  /** Event parameters from map
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  /** Returns zoom level value for which the map is zoomed.
    */
  var zoomLevel: js.UndefOr[js.Any] = js.undefined
}

object ZoomedOutEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null, zoomLevel: js.Any = null): ZoomedOutEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    if (zoomLevel != null) __obj.updateDynamic("zoomLevel")(zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomedOutEventArgs]
  }
}

