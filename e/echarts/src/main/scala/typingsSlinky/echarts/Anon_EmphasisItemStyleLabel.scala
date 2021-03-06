package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmphasisItemStyleLabel extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves.emphasis
    */
  var emphasis: js.UndefOr[Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColor] = js.undefined
  /**
    * The style of the leaf node in the tree.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * Describes the style of the text label corresponding to the
    * leaf node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColor] = js.undefined
}

object Anon_EmphasisItemStyleLabel {
  @scala.inline
  def apply(
    emphasis: Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColor = null,
    itemStyle: Anon_BorderColorBorderType = null,
    label: Anon_AlignBackgroundColorBorderColor = null
  ): Anon_EmphasisItemStyleLabel = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EmphasisItemStyleLabel]
  }
}

