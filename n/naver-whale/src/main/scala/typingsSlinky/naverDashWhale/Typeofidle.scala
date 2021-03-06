package typingsSlinky.naverDashWhale

import typingsSlinky.chrome.chrome.idle.IdleStateChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofidle extends js.Object {
  var onStateChanged: IdleStateChangedEvent
  def queryState(detectionIntervalInSeconds: Double, callback: js.Function1[/* newState */ String, Unit]): Unit
  def setDetectionInterval(intervalInSeconds: Double): Unit
}

object Typeofidle {
  @scala.inline
  def apply(
    onStateChanged: IdleStateChangedEvent,
    queryState: (Double, js.Function1[/* newState */ String, Unit]) => Unit,
    setDetectionInterval: Double => Unit
  ): Typeofidle = {
    val __obj = js.Dynamic.literal(onStateChanged = onStateChanged.asInstanceOf[js.Any], queryState = js.Any.fromFunction2(queryState), setDetectionInterval = js.Any.fromFunction1(setDetectionInterval))
  
    __obj.asInstanceOf[Typeofidle]
  }
}

