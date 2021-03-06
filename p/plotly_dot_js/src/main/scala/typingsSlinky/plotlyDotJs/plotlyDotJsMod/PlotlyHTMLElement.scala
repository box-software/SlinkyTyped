package typingsSlinky.plotlyDotJs.plotlyDotJsMod

import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_afterexport
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_afterplot
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_animated
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_animatingframe
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_animationinterrupted
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_autosize
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_beforeexport
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_beforeplot
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_click
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_clickannotation
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_deselect
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_doubleclick
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_event
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_framework
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_hover
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_legendclick
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_legenddoubleclick
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_redraw
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_relayout
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_restyle
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_selected
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_selecting
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_sliderchange
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_sliderend
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_sliderstart
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_transitioning
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_transitioninterrupted
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.plotly_unhover
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotlyHTMLElement extends HTMLElement {
  def on(
    event: plotly_afterexport | plotly_afterplot | plotly_animated | plotly_animationinterrupted | plotly_autosize | plotly_beforeexport | plotly_deselect | plotly_doubleclick | plotly_framework | plotly_redraw | plotly_transitioning | plotly_transitioninterrupted,
    callback: js.Function0[Unit]
  ): Unit = js.native
  @JSName("on")
  def on_plotlyanimatingframe(event: plotly_animatingframe, callback: js.Function1[/* event */ FrameAnimationEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlybeforeplot(event: plotly_beforeplot, callback: js.Function1[/* event */ BeforePlotEvent, Boolean]): Unit = js.native
  @JSName("on")
  def on_plotlyclick(event: plotly_click, callback: js.Function1[/* event */ PlotMouseEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyclickannotation(event: plotly_clickannotation, callback: js.Function1[/* event */ ClickAnnotationEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyevent(event: plotly_event, callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyhover(event: plotly_hover, callback: js.Function1[/* event */ PlotMouseEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlylegendclick(event: plotly_legendclick, callback: js.Function1[/* event */ LegendClickEvent, Boolean]): Unit = js.native
  @JSName("on")
  def on_plotlylegenddoubleclick(event: plotly_legenddoubleclick, callback: js.Function1[/* event */ LegendClickEvent, Boolean]): Unit = js.native
  @JSName("on")
  def on_plotlyrelayout(event: plotly_relayout, callback: js.Function1[/* event */ PlotRelayoutEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyrestyle(event: plotly_restyle, callback: js.Function1[/* data */ PlotRestyleEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyselected(event: plotly_selected, callback: js.Function1[/* event */ PlotSelectionEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyselecting(event: plotly_selecting, callback: js.Function1[/* event */ PlotSelectionEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlysliderchange(event: plotly_sliderchange, callback: js.Function1[/* event */ SliderChangeEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlysliderend(event: plotly_sliderend, callback: js.Function1[/* event */ SliderEndEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlysliderstart(event: plotly_sliderstart, callback: js.Function1[/* event */ SliderStartEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyunhover(event: plotly_unhover, callback: js.Function1[/* event */ PlotMouseEvent, Unit]): Unit = js.native
  def removeAllListeners(handler: String): Unit = js.native
}

