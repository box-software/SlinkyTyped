package typingsSlinky.slickgrid.Slick.Data

import typingsSlinky.slickgrid.Slick.Data.Aggregators.Aggregator
import typingsSlinky.slickgrid.Slick.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupingOptions[T] extends js.Object {
  var aggregateChildGroups: js.UndefOr[Boolean] = js.undefined
  var aggregateCollapsed: js.UndefOr[Boolean] = js.undefined
  var aggregateEmpty: js.UndefOr[Boolean] = js.undefined
  	// todo
  var aggregators: js.UndefOr[js.Array[Aggregator[T]]] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var comparer: js.UndefOr[js.Function2[/* a */ Group[T], /* b */ Group[T], Double]] = js.undefined
  var displayTotalsRow: js.UndefOr[Boolean] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* item */ js.UndefOr[T], String]] = js.undefined
  var getter: js.UndefOr[(js.Function1[/* item */ js.UndefOr[T], _]) | String] = js.undefined
  var predefinedValues: js.UndefOr[js.Array[_]] = js.undefined
}

object GroupingOptions {
  @scala.inline
  def apply[T](
    aggregateChildGroups: js.UndefOr[Boolean] = js.undefined,
    aggregateCollapsed: js.UndefOr[Boolean] = js.undefined,
    aggregateEmpty: js.UndefOr[Boolean] = js.undefined,
    aggregators: js.Array[Aggregator[T]] = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    comparer: (/* a */ Group[T], /* b */ Group[T]) => Double = null,
    displayTotalsRow: js.UndefOr[Boolean] = js.undefined,
    formatter: /* item */ js.UndefOr[T] => String = null,
    getter: (js.Function1[/* item */ js.UndefOr[T], _]) | String = null,
    predefinedValues: js.Array[_] = null
  ): GroupingOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aggregateChildGroups)) __obj.updateDynamic("aggregateChildGroups")(aggregateChildGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(aggregateCollapsed)) __obj.updateDynamic("aggregateCollapsed")(aggregateCollapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(aggregateEmpty)) __obj.updateDynamic("aggregateEmpty")(aggregateEmpty.asInstanceOf[js.Any])
    if (aggregators != null) __obj.updateDynamic("aggregators")(aggregators.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (comparer != null) __obj.updateDynamic("comparer")(js.Any.fromFunction2(comparer))
    if (!js.isUndefined(displayTotalsRow)) __obj.updateDynamic("displayTotalsRow")(displayTotalsRow.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (getter != null) __obj.updateDynamic("getter")(getter.asInstanceOf[js.Any])
    if (predefinedValues != null) __obj.updateDynamic("predefinedValues")(predefinedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupingOptions[T]]
  }
}

