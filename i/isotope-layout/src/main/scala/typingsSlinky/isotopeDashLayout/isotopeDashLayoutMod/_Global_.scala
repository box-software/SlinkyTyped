package typingsSlinky.isotopeDashLayout.isotopeDashLayoutMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.addItems
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.appended
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.destroy
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.getFilteredItemElements
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.getItemElements
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.hideItemElements
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.insert
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.isotope
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.layout
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.layoutItems
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.prepended
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.reloadItems
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.remove
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.revealItemElements
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.shuffle
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.stamp
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.unstamp
import typingsSlinky.isotopeDashLayout.isotopeDashLayoutStrings.updateSortData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  trait JQuery extends js.Object {
    /**
      * Get the Isotope instance from a jQuery object. Isotope instances are useful to access Isotope properties.
      */
    @JSName("data")
    def data_isotope(methodName: isotope): Isotope = js.native
    /**
      * Filters, sorts, and lays out items.
      */
    def isotope(): JQuery = js.native
    /**
      * Filters, sorts, and lays out items. Pass in options to apply filtering and sorting.
      * @param options All options are optional, but itemSelector is recommended. Layout modes have their own separate options.
      */
    def isotope(options: IsotopeOptions): JQuery = js.native
    /**
      * Adds item elements to the Isotope instance. addItems does not lay out items like appended, prepended, or insert.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    @JSName("isotope")
    def isotope_addItems(methodName: addItems, elements: Elements): JQuery = js.native
    /**
      * Adds and lays out newly appended item elements to the end of the layout.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    @JSName("isotope")
    def isotope_appended(methodName: appended, elements: Elements): JQuery = js.native
    /**
      * Removes the Isotope functionality completely. destroy will return the element back to its pre-initialized state.
      */
    @JSName("isotope")
    def isotope_destroy(methodName: destroy): Unit = js.native
    /**
      * Returns an array of filtered item elements in current sorted order.
      */
    @JSName("isotope")
    def isotope_getFilteredItemElements(methodName: getFilteredItemElements): js.Array[Element] = js.native
    /**
      * Returns an array of all item elements in the Isotope instance.
      */
    @JSName("isotope")
    def isotope_getItemElements(methodName: getItemElements): js.Array[Element] = js.native
    /**
      * Hide items.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    @JSName("isotope")
    def isotope_hideItemElements(methodName: hideItemElements, elements: Elements): JQuery = js.native
    /**
      * Appends elements into container element, adds elements as items, and arranges items with filtering and sorting.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    @JSName("isotope")
    def isotope_insert(methodName: insert, elements: Elements): JQuery = js.native
    /**
      * Lays out all item elements. layout is useful when an item has changed size, and all items need to be laid out again. layout does not apply filtering or sorting.
      */
    @JSName("isotope")
    def isotope_layout(methodName: layout): JQuery = js.native
    /**
      * Lays out specified items.
      * @param elements Array of Isotope.Items
      * @param isStill Disables transitions
      */
    @JSName("isotope")
    def isotope_layoutItems(methodName: layoutItems, elements: js.Array[HTMLElement], isStill: Boolean): JQuery = js.native
    /**
      * Adds and lays out newly prepended item elements at the beginning of layout.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    @JSName("isotope")
    def isotope_prepended(methodName: prepended, elements: Elements): JQuery = js.native
    /**
      * Recollects all item elements.
      * For frameworks like Angular and React, reloadItems may be useful to apply changes to the DOM to Isotope.
      */
    @JSName("isotope")
    def isotope_reloadItems(methodName: reloadItems): JQuery = js.native
    /**
      * Removes elements from the Isotope instance and DOM.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    @JSName("isotope")
    def isotope_remove(methodName: remove, elements: Elements): JQuery = js.native
    /**
      * Reveals hidden items.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    @JSName("isotope")
    def isotope_revealItemElements(methodName: revealItemElements, elements: Elements): JQuery = js.native
    /**
      * Shuffles items in a random order.
      */
    @JSName("isotope")
    def isotope_shuffle(methodName: shuffle): JQuery = js.native
    /**
      * Stamps elements in the layout. Isotope will lay out item elements around stamped elements.
      * Stamping is only supported by some layout modes: masonry, packery and masonryhorizontal.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    @JSName("isotope")
    def isotope_stamp(methodName: stamp, elements: Elements): JQuery = js.native
    /**
      * Un-stamps elements in the layout, so that Isotope will no longer layout item elements around them.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    @JSName("isotope")
    def isotope_unstamp(methodName: unstamp, elements: Elements): JQuery = js.native
    /**
      * Updates sort data
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    @JSName("isotope")
    def isotope_updateSortData(methodName: updateSortData, elements: Elements): JQuery = js.native
  }
  
}

