package typingsSlinky.keenDashTracking.keenDashTrackingMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.keenDashTracking.Anon_Created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeenTracking extends js.Object {
  def recordEvent(collectionName: String, event: js.Object): js.Promise[Anon_Created]
  def recordEvents(events: StringDictionary[js.Array[js.Object]]): js.Promise[StringDictionary[js.Array[Boolean]]]
}

object KeenTracking {
  @scala.inline
  def apply(
    recordEvent: (String, js.Object) => js.Promise[Anon_Created],
    recordEvents: StringDictionary[js.Array[js.Object]] => js.Promise[StringDictionary[js.Array[Boolean]]]
  ): KeenTracking = {
    val __obj = js.Dynamic.literal(recordEvent = js.Any.fromFunction2(recordEvent), recordEvents = js.Any.fromFunction1(recordEvents))
  
    __obj.asInstanceOf[KeenTracking]
  }
}

