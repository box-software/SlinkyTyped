package typingsSlinky.echarts.libEchartsMod

import typingsSlinky.echarts.echarts.ECharts
import typingsSlinky.std.HTMLCanvasElement
import typingsSlinky.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("echarts/lib/echarts", "getInstanceByDom")
@js.native
object getInstanceByDom extends js.Object {
  def apply(target: HTMLCanvasElement): ECharts = js.native
  /**
    * Returns chart instance of dom container.
    *
    * @param target Chart container.
    */
  def apply(target: HTMLDivElement): ECharts = js.native
}

