package typingsSlinky.atJupyterlabCoreutils.libNbformatMod.nbformat

import typingsSlinky.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.auto
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A union metadata type.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IBaseCellMetadata
  - typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IRawCellMetadata
  - typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ICodeCellMetadata
*/
trait ICellMetadata extends js.Object

object ICellMetadata {
  @scala.inline
  def IBaseCellMetadata(jupyter: Partial[IBaseCellJupyterMetadata], name: String, tags: js.Array[String], trusted: Boolean): ICellMetadata = {
    val __obj = js.Dynamic.literal(jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICellMetadata]
  }
  @scala.inline
  def IRawCellMetadata(
    format: String,
    jupyter: Partial[IBaseCellJupyterMetadata],
    name: String,
    tags: js.Array[String],
    trusted: Boolean
  ): ICellMetadata = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICellMetadata]
  }
  @scala.inline
  def ICodeCellMetadata(
    collapsed: Boolean,
    jupyter: Partial[ICodeCellJupyterMetadata],
    name: String,
    scrolled: Boolean | auto,
    tags: js.Array[String],
    trusted: Boolean
  ): ICellMetadata = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scrolled = scrolled.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICellMetadata]
  }
}

