package typingsSlinky.senchaUnderscoreTouch.Ext.chart

import typingsSlinky.senchaUnderscoreTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPolarChart extends IAbstractChart {
  /** [Config Option] (Array) */
  var center: js.UndefOr[Array] = js.undefined
  /** [Method] Returns the value of center
  		* @returns Array
  		*/
  var getCenter: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of radius
  		* @returns Number
  		*/
  var getRadius: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.undefined
  /** [Method] Sets the value of center
  		* @param center Array The new value.
  		*/
  var setCenter: js.UndefOr[js.Function1[/* center */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of radius
  		* @param radius Number The new value.
  		*/
  var setRadius: js.UndefOr[js.Function1[/* radius */ js.UndefOr[Double], Unit]] = js.undefined
}

object IPolarChart {
  @scala.inline
  def apply(
    IAbstractChart: IAbstractChart = null,
    center: Array = null,
    getCenter: () => Array = null,
    getRadius: () => Double = null,
    radius: Int | Double = null,
    setCenter: /* center */ js.UndefOr[Array] => Unit = null,
    setRadius: /* radius */ js.UndefOr[Double] => Unit = null
  ): IPolarChart = {
    val __obj = js.Dynamic.literal()
    if (IAbstractChart != null) js.Dynamic.global.Object.assign(__obj, IAbstractChart)
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (getCenter != null) __obj.updateDynamic("getCenter")(js.Any.fromFunction0(getCenter))
    if (getRadius != null) __obj.updateDynamic("getRadius")(js.Any.fromFunction0(getRadius))
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (setCenter != null) __obj.updateDynamic("setCenter")(js.Any.fromFunction1(setCenter))
    if (setRadius != null) __obj.updateDynamic("setRadius")(js.Any.fromFunction1(setRadius))
    __obj.asInstanceOf[IPolarChart]
  }
}

