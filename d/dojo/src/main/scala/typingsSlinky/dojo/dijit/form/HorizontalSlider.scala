package typingsSlinky.dojo.dijit.form

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.Anon_Unwatch
import typingsSlinky.dojo.dijit._WidgetBase
import typingsSlinky.dojo.dojo.dnd.Mover
import typingsSlinky.dojo.dojoStrings.clickSelect
import typingsSlinky.dojo.dojoStrings.discreteValues
import typingsSlinky.dojo.dojoStrings.maximum
import typingsSlinky.dojo.dojoStrings.minimum
import typingsSlinky.dojo.dojoStrings.pageIncrement
import typingsSlinky.dojo.dojoStrings.showButtons
import typingsSlinky.dojo.dojoStrings.slideDuration
import typingsSlinky.dojo.dojoStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/HorizontalSlider.html
  *
  * A form widget that allows one to select a value with a horizontally draggable handle
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dijit.form.HorizontalSlider")
@js.native
class HorizontalSlider () extends _FormValueWidget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * If clicking the slider bar changes the value or not
    * 
    */
  var clickSelect: Boolean = js.native
  /**
    * If specified, indicates that the slider handle has only 'discreteValues' possible positions,
    * and that after dragging the handle, it will snap to the nearest possible position.
    * Thus, the slider has only 'discreteValues' possible values.
    * 
    * For example, if minimum=10, maxiumum=30, and discreteValues=3, then the slider handle has
    * three possible positions, representing values 10, 20, or 30.
    * 
    * If discreteValues is not specified or if it's value is higher than the number of pixels
    * in the slider bar, then the slider handle can be moved freely, and the slider's value will be
    * computed/reported based on pixel position (in this case it will likely be fractional,
    * such as 123.456789).
    * 
    */
  var discreteValues: Double = js.native
  /**
    * The maximum value the slider can be set to.
    * 
    */
  var maximum: Double = js.native
  /**
    * The minimum value the slider can be set to.
    * 
    */
  var minimum: Double = js.native
  /**
    * If discreteValues is also specified, this indicates the amount of clicks (ie, snap positions)
    * that the slider handle is moved via pageup/pagedown keys.
    * If discreteValues is not specified, it indicates the number of pixels.
    * 
    */
  var pageIncrement: Double = js.native
  /**
    * Show increment/decrement buttons at the ends of the slider?
    * 
    */
  var showButtons: Boolean = js.native
  /**
    * The time in ms to take to animate the slider handle from 0% to 100%,
    * when clicking the slider bar to make the handle move.
    * 
    */
  var slideDuration: Double = js.native
  /**
    * 
    */
  @JSName("value")
  var value_HorizontalSlider: Double = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: _WidgetBase): Unit = js.native
  def addChild(widget: _WidgetBase, insertIndex: Double): Unit = js.native
  /**
    * Gets the index of the child in this container or -1 if not found
    * 
    * @param child             
    */
  /**
    * Gets the index of the child in this container or -1 if not found
    * 
    * @param child             
    */
  def getIndexOfChild(child: _WidgetBase): js.Any = js.native
  @JSName("get")
  def get_clickSelect(property: clickSelect): Boolean = js.native
  @JSName("get")
  def get_discreteValues(property: discreteValues): Double = js.native
  @JSName("get")
  def get_maximum(property: maximum): Double = js.native
  @JSName("get")
  def get_minimum(property: minimum): Double = js.native
  @JSName("get")
  def get_pageIncrement(property: pageIncrement): Double = js.native
  @JSName("get")
  def get_showButtons(property: showButtons): Boolean = js.native
  @JSName("get")
  def get_slideDuration(property: slideDuration): Double = js.native
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    * 
    */
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    * 
    */
  def hasChildren(): Boolean = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: Double): Unit = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: _WidgetBase): Unit = js.native
  @JSName("set")
  def set_clickSelect(property: clickSelect, value: Boolean): Unit = js.native
  @JSName("set")
  def set_discreteValues(property: discreteValues, value: Double): Unit = js.native
  @JSName("set")
  def set_maximum(property: maximum, value: Double): Unit = js.native
  @JSName("set")
  def set_minimum(property: minimum, value: Double): Unit = js.native
  @JSName("set")
  def set_pageIncrement(property: pageIncrement, value: Double): Unit = js.native
  @JSName("set")
  def set_showButtons(property: showButtons, value: Boolean): Unit = js.native
  @JSName("set")
  def set_slideDuration(property: slideDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: Double): Unit = js.native
  @JSName("watch")
  def watch_clickSelect(
    property: clickSelect,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_discreteValues(
    property: discreteValues,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_maximum(
    property: maximum,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minimum(
    property: minimum,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_pageIncrement(
    property: pageIncrement,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_showButtons(
    property: showButtons,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_slideDuration(
    property: slideDuration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

@JSGlobal("dijit.form.HorizontalSlider")
@js.native
object HorizontalSlider extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/HorizontalSlider._Mover.html
    *
    * 
    * @param node a node (or node's id) to be moved     
    * @param e a mouse event, which started the move;only pageX and pageY properties are used     
    * @param host       Optionalobject which implements the functionality of the move,and defines proper events (onMoveStart and onMoveStop)     
    */
  @js.native
  class _Mover protected () extends Mover {
    def this(node: HTMLElement, e: Event) = this()
    def this(node: HTMLElement, e: Event, host: js.Object) = this()
    def destroy(e: js.Any): Unit = js.native
    /**
      * 
      * @param e             
      */
    def onMouseMove(e: js.Any): Unit = js.native
  }
  
}

