package typingsSlinky.virtualDashDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object VirtualDOM {
  import org.scalajs.dom.raw.Element

  type EventHandler = js.Function1[/* repeated */ js.Any, Unit]
  type PatchFn[T /* <: Element */] = js.Function3[
    /* rootNode */ T, 
    /* patches */ js.Array[VPatch], 
    /* renderOptions */ VPatchOptions[T], 
    T
  ]
  type VChild = (js.Array[String | VTree]) | VTree | String
}
