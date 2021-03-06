package typingsSlinky.extjs.Ext.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemplateColumn
  extends typingsSlinky.extjs.Ext.grid.column.IColumn {
  /** [Method] When defined this will take precedence over the renderer config
  		* @param value Object
  		* @param meta Object
  		* @param record Object
  		*/
  @JSName("defaultRenderer")
  var defaultRenderer_ITemplateColumn: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}

object ITemplateColumn {
  @scala.inline
  def apply(
    IColumn: typingsSlinky.extjs.Ext.grid.column.IColumn = null,
    defaultRenderer: (/* value */ js.UndefOr[js.Any], /* meta */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any]) => Unit = null
  ): ITemplateColumn = {
    val __obj = js.Dynamic.literal()
    if (IColumn != null) js.Dynamic.global.Object.assign(__obj, IColumn)
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(js.Any.fromFunction3(defaultRenderer))
    __obj.asInstanceOf[ITemplateColumn]
  }
}

