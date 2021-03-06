package typingsSlinky.ol.interactionInteractionMod

import typingsSlinky.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Interaction", "zoomWithoutConstraints")
@js.native
object zoomWithoutConstraints extends js.Object {
  def apply(view: typingsSlinky.ol.viewMod.default): Unit = js.native
  def apply(
    view: typingsSlinky.ol.viewMod.default,
    resolution: js.UndefOr[scala.Nothing],
    opt_anchor: Coordinate
  ): Unit = js.native
  def apply(
    view: typingsSlinky.ol.viewMod.default,
    resolution: js.UndefOr[scala.Nothing],
    opt_anchor: Coordinate,
    opt_duration: Double
  ): Unit = js.native
  def apply(view: typingsSlinky.ol.viewMod.default, resolution: Double): Unit = js.native
  def apply(view: typingsSlinky.ol.viewMod.default, resolution: Double, opt_anchor: Coordinate): Unit = js.native
  def apply(
    view: typingsSlinky.ol.viewMod.default,
    resolution: Double,
    opt_anchor: Coordinate,
    opt_duration: Double
  ): Unit = js.native
}

