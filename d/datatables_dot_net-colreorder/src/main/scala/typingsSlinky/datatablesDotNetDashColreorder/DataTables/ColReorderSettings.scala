package typingsSlinky.datatablesDotNetDashColreorder.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColReorderSettings extends js.Object {
  /*
    * Number of columns (counting from the left) to disallow reordering of, '0' in default
    */
  var fixedColumnsLeft: js.UndefOr[Double] = js.undefined
  /*
    * Number of columns (counting from the right) to disallow reordering of, '0' in default
    */
  var fixedColumnsRight: js.UndefOr[Double] = js.undefined
  /*
    * Set a default order for the columns in the table
    */
  var order: js.UndefOr[js.Array[Double]] = js.undefined
  /*
    * Enable / disable live reordering of columns during a drag, 'true' in default
    */
  var realtime: js.UndefOr[Boolean] = js.undefined
  /*
    * Callback after reorder
    */
  def reorderCallback(): Unit
}

object ColReorderSettings {
  @scala.inline
  def apply(
    reorderCallback: () => Unit,
    fixedColumnsLeft: Int | Double = null,
    fixedColumnsRight: Int | Double = null,
    order: js.Array[Double] = null,
    realtime: js.UndefOr[Boolean] = js.undefined
  ): ColReorderSettings = {
    val __obj = js.Dynamic.literal(reorderCallback = js.Any.fromFunction0(reorderCallback))
    if (fixedColumnsLeft != null) __obj.updateDynamic("fixedColumnsLeft")(fixedColumnsLeft.asInstanceOf[js.Any])
    if (fixedColumnsRight != null) __obj.updateDynamic("fixedColumnsRight")(fixedColumnsRight.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColReorderSettings]
  }
}

