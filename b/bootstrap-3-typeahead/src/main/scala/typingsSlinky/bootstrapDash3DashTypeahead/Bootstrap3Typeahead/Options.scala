package typingsSlinky.bootstrapDash3DashTypeahead.Bootstrap3Typeahead

import typingsSlinky.bootstrapDash3DashTypeahead.Anon_Name
import typingsSlinky.bootstrapDash3DashTypeahead.JQuery
import typingsSlinky.bootstrapDash3DashTypeahead.bootstrapDash3DashTypeaheadStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Adds an item to the end of the list
    */
  var addItem: js.UndefOr[js.Object] = js.undefined
  /**
    * Call back function to execute after selected an item
    */
  var afterSelect: js.UndefOr[js.Function1[/* item */ String | js.Object, Unit]] = js.undefined
  /**
    * Use this option to add the menu to another div
    */
  var appendTo: js.UndefOr[JQuery] = js.undefined
  /**
    * Allows you to dictate whether or not the first suggestion is selected automatically
    */
  var autoSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * Adds a delay between lookups
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Method used to get textual representation of an item of the sources
    */
  var displayText: js.UndefOr[js.Function1[/* item */ String | Anon_Name, String]] = js.undefined
  /**
    * Set to true if you want the menu to be the same size than the input it is attached to
    */
  var fitToElement: js.UndefOr[Boolean] = js.undefined
  /**
    * Method used to highlight autocomplete results
    */
  var highlighter: js.UndefOr[js.Function1[/* item */ String, String]] = js.undefined
  /**
    * The max number of items to display in the dropdown
    */
  var items: js.UndefOr[Double] = js.undefined
  /**
    * The method used to determine if a query matches an item
    */
  var matcher: js.UndefOr[js.Function1[/* item */ String, Boolean]] = js.undefined
  /**
    * The minimum character length needed before triggering autocomplete suggestions
    */
  var minLength: js.UndefOr[Double] = js.undefined
  /**
    * Number of pixels the scrollable parent container scrolled down
    */
  var scrollHeight: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  /**
    * If hints should be shown as soon as the input gets focus
    */
  var showHintOnFocus: js.UndefOr[Boolean | all] = js.undefined
  /**
    * Method used to sort autocomplete results
    */
  var sorter: js.UndefOr[js.Function1[/* items */ js.Array[String], js.Array[String]]] = js.undefined
  /**
    * The data source to query against
    */
  var source: js.UndefOr[
    (js.Array[js.Object | String]) | (js.Function2[
      /* query */ js.UndefOr[String], 
      /* process */ js.UndefOr[js.Function1[/* callback */ js.Any, String | (js.Array[js.Object | String])]], 
      Unit
    ])
  ] = js.undefined
  /**
    * The method used to return selected item
    */
  var updater: js.UndefOr[js.Function1[/* item */ String, String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    addItem: js.Object = null,
    afterSelect: /* item */ String | js.Object => Unit = null,
    appendTo: JQuery = null,
    autoSelect: js.UndefOr[Boolean] = js.undefined,
    delay: Int | Double = null,
    displayText: /* item */ String | Anon_Name => String = null,
    fitToElement: js.UndefOr[Boolean] = js.undefined,
    highlighter: /* item */ String => String = null,
    items: Int | Double = null,
    matcher: /* item */ String => Boolean = null,
    minLength: Int | Double = null,
    scrollHeight: Double | js.Function0[Double] = null,
    showHintOnFocus: Boolean | all = null,
    sorter: /* items */ js.Array[String] => js.Array[String] = null,
    source: (js.Array[js.Object | String]) | (js.Function2[
      /* query */ js.UndefOr[String], 
      /* process */ js.UndefOr[js.Function1[/* callback */ js.Any, String | (js.Array[js.Object | String])]], 
      Unit
    ]) = null,
    updater: /* item */ String => String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (addItem != null) __obj.updateDynamic("addItem")(addItem.asInstanceOf[js.Any])
    if (afterSelect != null) __obj.updateDynamic("afterSelect")(js.Any.fromFunction1(afterSelect))
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSelect)) __obj.updateDynamic("autoSelect")(autoSelect.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (displayText != null) __obj.updateDynamic("displayText")(js.Any.fromFunction1(displayText))
    if (!js.isUndefined(fitToElement)) __obj.updateDynamic("fitToElement")(fitToElement.asInstanceOf[js.Any])
    if (highlighter != null) __obj.updateDynamic("highlighter")(js.Any.fromFunction1(highlighter))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction1(matcher))
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (showHintOnFocus != null) __obj.updateDynamic("showHintOnFocus")(showHintOnFocus.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(js.Any.fromFunction1(sorter))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction1(updater))
    __obj.asInstanceOf[Options]
  }
}

