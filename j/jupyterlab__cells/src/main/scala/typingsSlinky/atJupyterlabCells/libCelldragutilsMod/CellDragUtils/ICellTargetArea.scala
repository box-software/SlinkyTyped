package typingsSlinky.atJupyterlabCells.libCelldragutilsMod.CellDragUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabCells.atJupyterlabCellsStrings.input
  - typings.atJupyterlabCells.atJupyterlabCellsStrings.prompt
  - typings.atJupyterlabCells.atJupyterlabCellsStrings.cell
  - typings.atJupyterlabCells.atJupyterlabCellsStrings.unknown
*/
trait ICellTargetArea extends js.Object

object ICellTargetArea {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cell: typingsSlinky.atJupyterlabCells.atJupyterlabCellsStrings.cell = this.cast("cell")
  @scala.inline
  def input: typingsSlinky.atJupyterlabCells.atJupyterlabCellsStrings.input = this.cast("input")
  @scala.inline
  def prompt: typingsSlinky.atJupyterlabCells.atJupyterlabCellsStrings.prompt = this.cast("prompt")
  @scala.inline
  def unknown: typingsSlinky.atJupyterlabCells.atJupyterlabCellsStrings.unknown = this.cast("unknown")
}

