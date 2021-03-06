package typingsSlinky.ejDotWebDotAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionFailureEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns current filtering column field name.
    */
  var currentFilteringColumn: js.UndefOr[String] = js.undefined
  /** Returns the card object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the error return by server.
    */
  var error: js.UndefOr[js.Any] = js.undefined
  /** Returns filter details.
    */
  var filterCollection: js.UndefOr[js.Any] = js.undefined
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns current action event type.
    */
  var originalEventType: js.UndefOr[String] = js.undefined
  /** Returns primary key value.
    */
  var primaryKeyValue: js.UndefOr[String] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns Kanban element.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ActionFailureEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentFilteringColumn: String = null,
    data: js.Any = null,
    error: js.Any = null,
    filterCollection: js.Any = null,
    model: js.Any = null,
    originalEventType: String = null,
    primaryKeyValue: String = null,
    requestType: String = null,
    target: js.Any = null,
    `type`: String = null
  ): ActionFailureEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (currentFilteringColumn != null) __obj.updateDynamic("currentFilteringColumn")(currentFilteringColumn.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (filterCollection != null) __obj.updateDynamic("filterCollection")(filterCollection.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (originalEventType != null) __obj.updateDynamic("originalEventType")(originalEventType.asInstanceOf[js.Any])
    if (primaryKeyValue != null) __obj.updateDynamic("primaryKeyValue")(primaryKeyValue.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionFailureEventArgs]
  }
}

