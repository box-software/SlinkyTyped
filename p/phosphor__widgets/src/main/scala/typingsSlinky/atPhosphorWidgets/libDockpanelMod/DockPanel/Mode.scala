package typingsSlinky.atPhosphorWidgets.libDockpanelMod.DockPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the supported dock panel modes.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`single-document`
  - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`multiple-document`
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `multiple-document`: typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsStrings.`multiple-document` = this.cast("multiple-document")
  @scala.inline
  def `single-document`: typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsStrings.`single-document` = this.cast("single-document")
}

