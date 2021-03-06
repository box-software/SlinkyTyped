package typingsSlinky.ol.styleStrokeMod

import typingsSlinky.ol.colorMod.Color
import typingsSlinky.ol.colorlikeMod.ColorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stroke extends js.Object {
  def getChecksum(): String = js.native
  def getColor(): Color | ColorLike = js.native
  def getLineCap(): js.UndefOr[String] = js.native
  def getLineDash(): js.Array[Double] = js.native
  def getLineDashOffset(): js.UndefOr[Double] = js.native
  def getLineJoin(): js.UndefOr[String] = js.native
  def getMiterLimit(): js.UndefOr[Double] = js.native
  def getWidth(): js.UndefOr[Double] = js.native
  def setColor(color: Color): Unit = js.native
  def setColor(color: ColorLike): Unit = js.native
  def setLineCap(): Unit = js.native
  def setLineCap(lineCap: String): Unit = js.native
  def setLineDash(lineDash: js.Array[Double]): Unit = js.native
  def setLineDashOffset(): Unit = js.native
  def setLineDashOffset(lineDashOffset: Double): Unit = js.native
  def setLineJoin(): Unit = js.native
  def setLineJoin(lineJoin: String): Unit = js.native
  def setMiterLimit(): Unit = js.native
  def setMiterLimit(miterLimit: Double): Unit = js.native
  def setWidth(): Unit = js.native
  def setWidth(width: Double): Unit = js.native
}

