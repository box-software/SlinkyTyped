package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Api extends js.Object {
  /**
    * The second parameter of `renderItem`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api
    */
  var api: js.UndefOr[Anon_BarLayout] = js.undefined
  /**
    * The first parameter of `renderItem`, including:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments)
    *
    * Difference between `dataIndex` and `dataIndexInside`:
    *
    * + `dataIndex` is the index of a `dataItem` in the original
    * data.
    * + `dataIndexInside` is the index of a `dataItem` in the
    * current data window (see
    * [dataZoom](https://echarts.apache.org/en/option.html#dataZoom)
    * .
    *
    * [renderItem.arguments.api](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api)
    * uses `dataIndexInside` as the input parameter but not
    * `dataIndex`, because conversion from `dataIndex` to `dataIndexInside`
    * is time-consuming.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.params
    */
  var params: js.UndefOr[js.Object] = js.undefined
}

object Anon_Api {
  @scala.inline
  def apply(api: Anon_BarLayout = null, params: js.Object = null): Anon_Api = {
    val __obj = js.Dynamic.literal()
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Api]
  }
}

