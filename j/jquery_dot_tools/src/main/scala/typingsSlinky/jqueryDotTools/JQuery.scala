package typingsSlinky.jqueryDotTools

import typingsSlinky.jqueryDotTools.JQueryTools.overlay.Overlay
import typingsSlinky.jqueryDotTools.JQueryTools.overlay.OverlayOptions
import typingsSlinky.jqueryDotTools.jqueryDotToolsStrings.overlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("data")
  def data_overlay(key: overlay): Overlay = js.native
  def overlay(): JQuery = js.native
  def overlay(opts: OverlayOptions): JQuery = js.native
  @JSName("overlay")
  def overlay_T_Overlay_T[T /* <: Overlay */](): T = js.native
  @JSName("overlay")
  def overlay_T_Overlay_T[T /* <: Overlay */](opts: OverlayOptions): T = js.native
}

