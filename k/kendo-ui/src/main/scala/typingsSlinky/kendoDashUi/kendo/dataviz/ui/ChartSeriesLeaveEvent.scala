package typingsSlinky.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesLeaveEvent extends ChartEvent {
  var category: js.UndefOr[js.Any] = js.undefined
  var dataItem: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[js.Any] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  var percentage: js.UndefOr[js.Any] = js.undefined
  var series: js.UndefOr[ChartSeriesLeaveEventSeries] = js.undefined
  var stackValue: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ChartSeriesLeaveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Chart,
    category: js.Any = null,
    dataItem: js.Any = null,
    element: js.Any = null,
    originalEvent: js.Any = null,
    percentage: js.Any = null,
    series: ChartSeriesLeaveEventSeries = null,
    stackValue: js.Any = null,
    value: js.Any = null
  ): ChartSeriesLeaveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (stackValue != null) __obj.updateDynamic("stackValue")(stackValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesLeaveEvent]
  }
}

