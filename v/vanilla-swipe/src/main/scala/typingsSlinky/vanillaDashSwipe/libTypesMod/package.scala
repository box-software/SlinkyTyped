package typingsSlinky.vanillaDashSwipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import org.scalajs.dom.raw.Event

  type EventHandler = js.Function6[
    /* e */ Event, 
    /* deltaX */ Double, 
    /* deltaY */ Double, 
    /* absX */ Double, 
    /* absY */ Double, 
    /* duration */ Double, 
    Unit
  ]
}
