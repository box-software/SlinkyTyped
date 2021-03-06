package typingsSlinky.amapDashJsDashApiDashRiding.AMap.Riding

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashRiding.Anon_Info
import typingsSlinky.amapDashJsDashApiDashRiding.amapDashJsDashApiDashRidingStrings.complete
import typingsSlinky.amapDashJsDashApiDashRiding.amapDashJsDashApiDashRidingStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typingsSlinky.amapDashJsDashApiDashRiding.amapDashJsDashApiDashRidingStrings.complete, 
    SearchResult
  ]
  var error: Event[
    typingsSlinky.amapDashJsDashApiDashRiding.amapDashJsDashApiDashRidingStrings.error, 
    Anon_Info
  ]
}

object EventMap {
  @scala.inline
  def apply(complete: Event[complete, SearchResult], error: Event[error, Anon_Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

