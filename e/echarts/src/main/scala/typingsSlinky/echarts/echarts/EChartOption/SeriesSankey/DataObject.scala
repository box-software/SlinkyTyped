package typingsSlinky.echarts.echarts.EChartOption.SeriesSankey

import typingsSlinky.echarts.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth
import typingsSlinky.echarts.Anon_BackgroundColorBorderColor
import typingsSlinky.echarts.Anon_BorderColorBorderType
import typingsSlinky.echarts.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBorderColorBorderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.emphasis
    */
  var emphasis: js.UndefOr[
    Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBorderColorBorderType
  ] = js.undefined
  /**
    * The style of this node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * The lable style of this node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
  /**
    * The name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * The value of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.value
    */
  var value: js.UndefOr[js.Array[_] | Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBorderColorBorderType = null,
    itemStyle: Anon_BorderColorBorderType = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth = null,
    name: String = null,
    tooltip: Anon_BackgroundColorBorderColor = null,
    value: js.Array[_] | Double = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

