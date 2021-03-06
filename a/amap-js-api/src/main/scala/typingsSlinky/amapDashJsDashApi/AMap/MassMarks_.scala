package typingsSlinky.amapDashJsDashApi.AMap

import typingsSlinky.amapDashJsDashApi.AMap.MassMarks.Data
import typingsSlinky.amapDashJsDashApi.AMap.MassMarks.Options
import typingsSlinky.amapDashJsDashApi.AMap.MassMarks.Style
import typingsSlinky.amapDashJsDashApi.Anon_LnglatLngLat
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.lnglat
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.MassMarks")
@js.native
class MassMarks_[D /* <: Data */] protected () extends Layer {
  def this(data: String, opts: Options) = this()
  /**
    * 海量点类，利用该类可同时在地图上展示万级别的点
    * @param data 点对象数组或url
    * @param opts 选项
    */
  def this(data: js.Array[D], opts: Options) = this()
  /**
    * 清除海量点
    */
  def clear(): Unit = js.native
  /**
    * 获取数据集
    */
  def getData(): js.Array[(Pick[D, Exclude[String, lnglat]]) with Anon_LnglatLngLat] = js.native
  /**
    * 获取显示样式
    */
  def getStyle(): Style | js.Array[Style] = js.native
  def setData(data: String): Unit = js.native
  /**
    * 设置数据集
    * @param data 数据集
    */
  def setData(data: js.Array[D]): Unit = js.native
  def setStyle(style: js.Array[Style]): Unit = js.native
  /**
    * 设置显示样式
    * @param style 样式设置
    */
  def setStyle(style: Style): Unit = js.native
}

