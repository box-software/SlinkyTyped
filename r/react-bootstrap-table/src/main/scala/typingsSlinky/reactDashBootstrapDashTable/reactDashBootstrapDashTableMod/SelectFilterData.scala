package typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectFilterData extends FilterValue {
  var `type`: typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.SelectFilter
  var value: String
}

object SelectFilterData {
  @scala.inline
  def apply(
    `type`: typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.SelectFilter,
    value: String
  ): SelectFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectFilterData]
  }
}

