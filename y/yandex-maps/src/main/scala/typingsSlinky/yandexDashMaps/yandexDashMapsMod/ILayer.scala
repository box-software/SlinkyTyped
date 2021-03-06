package typingsSlinky.yandexDashMaps.yandexDashMapsMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @js.native
trait ILayer extends IChild[IControlParent] {
  var getBrightness: js.UndefOr[js.Function0[Double]] = js.native
  var getCopyrights: js.UndefOr[
    js.Function2[
      /* coords */ js.Array[Double], 
      /* zoom */ Double, 
      js.Promise[js.Array[String | HTMLElement]]
    ]
  ] = js.native
  var getZoomRange: js.UndefOr[js.Function1[/* point */ js.Array[Double], js.Promise[js.Array[Double]]]] = js.native
  var options: IOptionManager = js.native
}

