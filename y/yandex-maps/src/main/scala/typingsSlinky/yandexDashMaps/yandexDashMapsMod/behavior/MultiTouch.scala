package typingsSlinky.yandexDashMaps.yandexDashMapsMod.behavior

import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IBehavior
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IControlParent
import typingsSlinky.yandexDashMaps.yandexDashMapsMod.IEventManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "behavior.MultiTouch")
@js.native
class MultiTouch () extends IBehavior {
  def this(options: IMultiTouchOptions) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

