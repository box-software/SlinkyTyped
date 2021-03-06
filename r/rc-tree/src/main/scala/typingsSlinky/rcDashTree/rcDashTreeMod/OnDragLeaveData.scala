package typingsSlinky.rcDashTree.rcDashTreeMod

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragLeaveData extends js.Object {
  var event: Event
  var node: ReactComponentClass[InternalTreeNodeProps]
}

object OnDragLeaveData {
  @scala.inline
  def apply(event: Event, node: ReactComponentClass[InternalTreeNodeProps]): OnDragLeaveData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnDragLeaveData]
  }
}

