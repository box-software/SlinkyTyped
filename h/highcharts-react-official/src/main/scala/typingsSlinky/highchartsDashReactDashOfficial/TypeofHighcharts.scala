package typingsSlinky.highchartsDashReactDashOfficial

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.highcharts.highchartsMod.AnimationOptionsObject
import typingsSlinky.highcharts.highchartsMod.AnnotationsOptions
import typingsSlinky.highcharts.highchartsMod.Axis
import typingsSlinky.highcharts.highchartsMod.AxisOptions
import typingsSlinky.highcharts.highchartsMod.CSSObject
import typingsSlinky.highcharts.highchartsMod.Chart
import typingsSlinky.highcharts.highchartsMod.ChartCallbackFunction
import typingsSlinky.highcharts.highchartsMod.Class
import typingsSlinky.highcharts.highchartsMod.Color
import typingsSlinky.highcharts.highchartsMod.ColorAxisOptions
import typingsSlinky.highcharts.highchartsMod.ColorType
import typingsSlinky.highcharts.highchartsMod.Dictionary
import typingsSlinky.highcharts.highchartsMod.EventCallbackFunction
import typingsSlinky.highcharts.highchartsMod.EventOptionsObject
import typingsSlinky.highcharts.highchartsMod.HTMLAttributes
import typingsSlinky.highcharts.highchartsMod.HTMLDOMElement
import typingsSlinky.highcharts.highchartsMod.LegendOptions
import typingsSlinky.highcharts.highchartsMod.ObjectEachCallbackFunction
import typingsSlinky.highcharts.highchartsMod.OffsetObject
import typingsSlinky.highcharts.highchartsMod.Options
import typingsSlinky.highcharts.highchartsMod.RelativeSize
import typingsSlinky.highcharts.highchartsMod.SVGAttributes
import typingsSlinky.highcharts.highchartsMod.SVGDOMElement
import typingsSlinky.highcharts.highchartsMod.SVGElement
import typingsSlinky.highcharts.highchartsMod.Series
import typingsSlinky.highcharts.highchartsMod.SeriesOptionsType
import typingsSlinky.highcharts.highchartsMod.Time
import typingsSlinky.highcharts.highchartsMod.TimeFormatCallbackFunction
import typingsSlinky.highcharts.highchartsMod.TimeOptions
import typingsSlinky.highcharts.highchartsMod.TooltipOptions
import typingsSlinky.highcharts.highchartsMod.WrapProceedFunction
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofHighcharts extends js.Object {
  var Annotation: Instantiable2[
    /* chart */ Chart, 
    /* userOptions */ AnnotationsOptions, 
    typingsSlinky.highcharts.highchartsMod.Annotation
  ] = js.native
  var Axis: Instantiable2[
    /* chart */ Chart, 
    /* options */ AxisOptions, 
    typingsSlinky.highcharts.highchartsMod.Axis
  ] = js.native
  var Chart: Instantiable1[/* options */ Options, typingsSlinky.highcharts.highchartsMod.Chart] = js.native
  var Color: Instantiable1[/* input */ ColorType, typingsSlinky.highcharts.highchartsMod.Color] = js.native
  var ColorAxis: Instantiable2[
    /* chart */ Chart, 
    /* userOptions */ ColorAxisOptions, 
    typingsSlinky.highcharts.highchartsMod.ColorAxis
  ] = js.native
  var Legend: Instantiable2[
    /* chart */ Chart, 
    /* options */ LegendOptions, 
    typingsSlinky.highcharts.highchartsMod.Legend
  ] = js.native
  var PlotLineOrBand: Instantiable1[/* axis */ Axis, typingsSlinky.highcharts.highchartsMod.PlotLineOrBand] = js.native
  var Point: Instantiable0[typingsSlinky.highcharts.highchartsMod.Point] = js.native
  var Pointer: Instantiable2[
    /* chart */ Chart, 
    /* options */ Options, 
    typingsSlinky.highcharts.highchartsMod.Pointer
  ] = js.native
  var SVGElement: Instantiable0[typingsSlinky.highcharts.highchartsMod.SVGElement] = js.native
  var SVGRenderer: Instantiable3[
    /* container */ HTMLDOMElement, 
    /* width */ Double, 
    /* height */ Double, 
    typingsSlinky.highcharts.highchartsMod.SVGRenderer
  ] = js.native
  var Series: Instantiable2[
    /* chart */ Chart, 
    /* options */ js.Object, 
    typingsSlinky.highcharts.highchartsMod.Series
  ] = js.native
  var Tick: Instantiable2[/* axis */ Axis, /* pos */ Double, typingsSlinky.highcharts.highchartsMod.Tick] = js.native
  var Time: Instantiable1[/* options */ TimeOptions, typingsSlinky.highcharts.highchartsMod.Time] = js.native
  var Tooltip: Instantiable2[
    /* chart */ Chart, 
    /* options */ TooltipOptions, 
    typingsSlinky.highcharts.highchartsMod.Tooltip
  ] = js.native
  var charts: js.Array[js.UndefOr[Chart]] = js.native
  var dateFormats: Dictionary[TimeFormatCallbackFunction] = js.native
  var defaultOptions: Options = js.native
  var time: Time = js.native
  def addEvent[T](el: T, `type`: String, fn: js.Function): js.Function = js.native
  def addEvent[T](el: T, `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
  def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
  def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
  def addEvent[T](el: Class[T], `type`: String, fn: js.Function): js.Function = js.native
  def addEvent[T](el: Class[T], `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
  def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
  def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
  def animObject(): AnimationOptionsObject = js.native
  def animObject(animation: Boolean): AnimationOptionsObject = js.native
  def animObject(animation: AnimationOptionsObject): AnimationOptionsObject = js.native
  def animate(el: HTMLDOMElement, params: CSSObject): Unit = js.native
  def animate(el: HTMLDOMElement, params: CSSObject, opt: AnimationOptionsObject): Unit = js.native
  def animate(el: HTMLDOMElement, params: SVGAttributes): Unit = js.native
  def animate(el: HTMLDOMElement, params: SVGAttributes, opt: AnimationOptionsObject): Unit = js.native
  def animate(el: SVGElement, params: CSSObject): Unit = js.native
  def animate(el: SVGElement, params: CSSObject, opt: AnimationOptionsObject): Unit = js.native
  def animate(el: SVGElement, params: SVGAttributes): Unit = js.native
  def animate(el: SVGElement, params: SVGAttributes, opt: AnimationOptionsObject): Unit = js.native
  def arrayMax(data: js.Array[_]): Double = js.native
  def arrayMin(data: js.Array[_]): Double = js.native
  def attr(elem: HTMLDOMElement): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: String): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: String, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: String, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: HTMLAttributes): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: SVGAttributes): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: String): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: String, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: String, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: HTMLAttributes): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: SVGAttributes): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
  def chart(options: Options): Chart = js.native
  def chart(options: Options, callback: ChartCallbackFunction): Chart = js.native
  def chart(renderTo: String, options: Options): Chart = js.native
  def chart(renderTo: String, options: Options, callback: ChartCallbackFunction): Chart = js.native
  def chart(renderTo: HTMLDOMElement, options: Options): Chart = js.native
  def chart(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction): Chart = js.native
  def clearTimeout(id: Double): Unit = js.native
  def color(input: ColorType): Color = js.native
  def correctFloat(num: Double): Double = js.native
  def correctFloat(num: Double, prec: Double): Double = js.native
  def createElement(tag: String): HTMLDOMElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes): HTMLDOMElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject): HTMLDOMElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLDOMElement): HTMLDOMElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
  def css(el: HTMLDOMElement, styles: CSSObject): Unit = js.native
  def css(el: SVGDOMElement, styles: CSSObject): Unit = js.native
  def dateFormat(format: String, timestamp: Double): String = js.native
  def dateFormat(format: String, timestamp: Double, capitalize: Boolean): String = js.native
  def defined(obj: js.Any): Boolean = js.native
  def destroyObjectProperties(obj: js.Any): Unit = js.native
  def destroyObjectProperties(obj: js.Any, except: js.Any): Unit = js.native
  def discardElement(element: HTMLDOMElement): Unit = js.native
  def each(arr: js.Array[_], fn: js.Function): Unit = js.native
  def each(arr: js.Array[_], fn: js.Function, ctx: js.Any): Unit = js.native
  def erase(arr: js.Array[_], item: js.Any): Unit = js.native
  def error(code: String): Unit = js.native
  def error(code: String, stop: Boolean): Unit = js.native
  def error(code: String, stop: Boolean, chart: Chart): Unit = js.native
  def error(code: String, stop: Boolean, chart: Chart, params: Dictionary[String]): Unit = js.native
  def error(code: Double): Unit = js.native
  def error(code: Double, stop: Boolean): Unit = js.native
  def error(code: Double, stop: Boolean, chart: Chart): Unit = js.native
  def error(code: Double, stop: Boolean, chart: Chart, params: Dictionary[String]): Unit = js.native
  def extend[T](a: T, b: js.Object): T = js.native
  def extend[T](a: js.UndefOr[scala.Nothing], b: js.Object): T = js.native
  def extendClass[T](parent: Class[T], members: Dictionary[_]): Class[T] = js.native
  def find[T](arr: js.Array[T], callback: js.Function): js.UndefOr[T] = js.native
  def fireEvent[T](el: T, `type`: String): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_]): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: js.Function): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: EventCallbackFunction[T]): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Event): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: js.Function): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: EventCallbackFunction[T]): Unit = js.native
  def format(str: String, ctx: js.Any): String = js.native
  def format(str: String, ctx: js.Any, time: Time): String = js.native
  def formatSingle(format: String, `val`: js.Any): String = js.native
  def formatSingle(format: String, `val`: js.Any, time: Time): String = js.native
  def getMagnitude(num: Double): Double = js.native
  def getOptions(): Options = js.native
  def getStyle(el: HTMLDOMElement, prop: String): Double | String = js.native
  def getStyle(el: HTMLDOMElement, prop: String, toInt: Boolean): Double | String = js.native
  def grep(arr: js.Array[_], callback: js.Function): js.Array[_] = js.native
  def inArray(item: js.Any, arr: js.Array[_]): Double = js.native
  def inArray(item: js.Any, arr: js.Array[_], fromIndex: Double): Double = js.native
  def isArray(obj: js.Any): Boolean = js.native
  def isClass(): Boolean = js.native
  def isClass(obj: js.Object): Boolean = js.native
  def isDOMElement(obj: js.Any): Boolean = js.native
  def isNumber(n: js.Any): Boolean = js.native
  def isObject(obj: js.Any): Boolean = js.native
  def isObject(obj: js.Any, strict: Boolean): Boolean = js.native
  def isString(s: js.Any): Boolean = js.native
  def keys(obj: js.Any): js.Array[String] = js.native
  def map(arr: js.Array[_], fn: js.Function): js.Array[_] = js.native
  def merge[T](a: T, n: js.UndefOr[js.Object]*): T = js.native
  def merge[T](extend: Boolean, a: T, n: js.UndefOr[js.Object]*): T = js.native
  def merge[T](extend: Boolean, n: js.UndefOr[js.Object]*): T = js.native
  def merge[T](n: js.UndefOr[js.Object]*): T = js.native
  def normalizeTickInterval(interval: Double): Double = js.native
  def normalizeTickInterval(interval: Double, multiples: js.Array[_]): Double = js.native
  def normalizeTickInterval(interval: Double, multiples: js.Array[_], magnitude: Double): Double = js.native
  def normalizeTickInterval(interval: Double, multiples: js.Array[_], magnitude: Double, allowDecimals: Boolean): Double = js.native
  def normalizeTickInterval(
    interval: Double,
    multiples: js.Array[_],
    magnitude: Double,
    allowDecimals: Boolean,
    hasTickAmount: Boolean
  ): Double = js.native
  def numberFormat(number: Double, decimals: Double): String = js.native
  def numberFormat(number: Double, decimals: Double, decimalPoint: String): String = js.native
  def numberFormat(number: Double, decimals: Double, decimalPoint: String, thousandsSep: String): String = js.native
  def objectEach[T](obj: js.Any, fn: ObjectEachCallbackFunction[T]): Unit = js.native
  def objectEach[T](obj: js.Any, fn: ObjectEachCallbackFunction[T], ctx: T): Unit = js.native
  def offset(el: HTMLDOMElement): OffsetObject = js.native
  def pad(number: Double): String = js.native
  def pad(number: Double, length: Double): String = js.native
  def pad(number: Double, length: Double, padder: String): String = js.native
  def pick[T](items: (js.UndefOr[T | Null])*): T = js.native
  def reduce(arr: js.Array[_], fn: js.Function, initialValue: js.Any): js.Any = js.native
  def relativeLength(value: RelativeSize, base: Double): Double = js.native
  def relativeLength(value: RelativeSize, base: Double, offset: Double): Double = js.native
  def removeEvent[T](el: T): Unit = js.native
  def removeEvent[T](el: T, `type`: String): Unit = js.native
  def removeEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
  def removeEvent[T](el: Class[T]): Unit = js.native
  def removeEvent[T](el: Class[T], `type`: String): Unit = js.native
  def removeEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
  def seriesType(`type`: String, parent: String, options: Dictionary[_]): Series = js.native
  def seriesType(`type`: String, parent: String, options: Dictionary[_], props: Dictionary[_]): Series = js.native
  def seriesType(
    `type`: String,
    parent: String,
    options: Dictionary[_],
    props: Dictionary[_],
    pointProps: Dictionary[_]
  ): Series = js.native
  def seriesType(`type`: String, parent: String, options: SeriesOptionsType): Series = js.native
  def seriesType(`type`: String, parent: String, options: SeriesOptionsType, props: Dictionary[_]): Series = js.native
  def seriesType(
    `type`: String,
    parent: String,
    options: SeriesOptionsType,
    props: Dictionary[_],
    pointProps: Dictionary[_]
  ): Series = js.native
  def setAnimation(animation: js.UndefOr[scala.Nothing], chart: Chart): Unit = js.native
  def setAnimation(animation: Boolean, chart: Chart): Unit = js.native
  def setAnimation(animation: AnimationOptionsObject, chart: Chart): Unit = js.native
  def setOptions(options: Options): Options = js.native
  def some(arr: js.Array[_], fn: js.Function, ctx: js.Any): Boolean = js.native
  def splat(obj: js.Any): js.Array[_] = js.native
  def stableSort(arr: js.Array[_], sortFunction: js.Function): Unit = js.native
  def stop(el: SVGElement): Unit = js.native
  def stop(el: SVGElement, prop: String): Unit = js.native
  def syncTimeout(fn: js.Function, delay: Double): Double = js.native
  def syncTimeout(fn: js.Function, delay: Double, context: js.Any): Double = js.native
  def uniqueKey(): String = js.native
  def wrap(obj: js.Any, method: String, func: WrapProceedFunction): Unit = js.native
}

