package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object browserAction {
  import typingsSlinky.chrome.chrome.events.Event
  import typingsSlinky.chrome.chrome.tabs.Tab

  type BrowserClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
  type ColorArray = js.Tuple4[Double, Double, Double, Double]
}
